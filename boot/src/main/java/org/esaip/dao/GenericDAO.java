package org.esaip.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esaip.dao.interf.IGenericDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Classe de pertsistence générique.
 *
 *
 * @param <E>
 *            Entité
 */
public class GenericDAO<E extends Serializable> implements IGenericDAO<E> {

    private static final String UNCHECKED = "unchecked";

    /** Logger */
    private static final Logger LOG = LoggerFactory.getLogger(GenericDAO.class);

    /** persistentClass : Une DAO ne peut gérer qu'une seule entité. */
    private final transient Class<E> persistentClass;

    /** EntityManager */
    @PersistenceContext
    private transient EntityManager entityManager;

    /**
     * Constructeur.
     */
    @SuppressWarnings(UNCHECKED)
    public GenericDAO() {
        this.persistentClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * Retourne la classe persistante.
     *
     * @return persistentClass
     */
    public Class<E> getPersistentClass() {
        return persistentClass;
    }

    /**
     * Retourne l'Entity Manager de l'application.
     *
     * @return entityManager
     */
    public EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * Recherche l'entité par id.
     *
     * @param id
     *            Id de l'objet à rechercher
     * @return l'entité recherché
     */
    public E rechercherParId(final Object id) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Recherche de l'entité {} avec Id : {}", getPersistentClass().getSimpleName(), id);
        }
        return entityManager.find(getPersistentClass(), id);
    }

    /**
     * Récuperer l'ensemble des entités.
     *
     * @return Liste des entités recherchées
     */
    @SuppressWarnings(UNCHECKED)
    public List<E> rechercherTous() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Recherche de toutes les instances  de l'entité {} ", getPersistentClass().getSimpleName());
        }
        return entityManager.createQuery(new StringBuilder("select entity from ").append(getPersistentClass().getSimpleName()).append(" as entity").toString()).getResultList();
    }

    /**
     * Liste l'ensemble des entité par le nom d'une propriete en parametre.
     *
     * @param nomPropriete
     *            propriete
     * @param valeur
     *            valeur
     * @return Liste des entités recherchées
     */
    @SuppressWarnings(UNCHECKED)
    public List<E> rechercherParAttribut(final String nomPropriete, final Object valeur) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Recherche des entités {} avec la propriété : {}, valeur : {}", new Object[] {getPersistentClass().getSimpleName(), nomPropriete, valeur });
        }

        String queryString = new StringBuilder("select entity from ").append(getPersistentClass().getName()).append(" as entity where entity.").append(nomPropriete).append("= :propertyValue")
                .toString();

        Query query = entityManager.createQuery(queryString);
        query.setParameter("propertyValue", valeur);

        return query.getResultList();

    }

    /**
     * rechercher les elements.
     *
     * @param debut
     *            de la recherche
     * @param quantite
     *            d'objet retourné
     * @return Liste des entités recherchées
     */
    @SuppressWarnings(UNCHECKED)
    public List<E> rechercherElements(final int debut, final int quantite) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Recherche des entités {} avec les paramètres début de recherche : {} et quantité : {}", new Object[] {getPersistentClass().getSimpleName(), debut, quantite });
        }
        return entityManager.createQuery(new StringBuilder("select entity from ").append(getPersistentClass().getSimpleName()).append(" as entity").toString()).setFirstResult(debut)
                .setMaxResults(quantite).getResultList();
    }

    /**
     * Compter les entités.
     *
     * @return nombre total d'entités
     */
    public long compterTous() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Compter toutes les entités {}", getPersistentClass().getSimpleName());
        }
        return (Long) entityManager.createQuery(new StringBuilder("select count(*) from ").append(getPersistentClass().getName()).toString()).getSingleResult();
    }

    /**
     * Créer l'objet en base.
     *
     * @param entity
     *            l'entité à créer
     * @return l'entité créé
     */
    public E creer(final E entity) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Sauvegarde de l'entité {}", getPersistentClass().getSimpleName());
        }
        entityManager.persist(entity);
        return entity;
    }

    /**
     * Modifie l'entité équivalent à JPA merge.
     *
     * @param entity
     *            à modifier
     * @return l'entité modifié
     */
    public E modifier(final E entity) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Mise à jour {}", getPersistentClass().getSimpleName());
        }
        return entityManager.merge(entity);

    }

    /**
     * Supprimer une entité
     *
     * @param entity
     *            entité à supprimer
     */
    public void supprimer(final E entity) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Suppression de l'entité {}", getPersistentClass().getSimpleName());
        }
        entityManager.remove(entityManager.merge(entity));
    }

    /**
     * Supprimer une entité
     *
     * * @param id Id de l'objet à supprimer
     */
    public void supprimerParId(final Object id) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Suppression de l'entité {} par Id : {}", getPersistentClass().getSimpleName(), id);
        }
        entityManager.createQuery(new StringBuilder("delete ").append(getPersistentClass().getName()).append(" where id = ").append(id).toString()).executeUpdate();

    }

    /**
     * Synchronise la base de données avec le contenu du context de persistence.
     */
    public void flush() {
        entityManager.flush();
    }

    /**
     * Nettoie le contexte de persistence et détacher toutes les entités
     */
    public void clear() {
        entityManager.clear();
    }

}
