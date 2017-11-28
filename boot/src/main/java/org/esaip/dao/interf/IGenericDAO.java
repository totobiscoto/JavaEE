package org.esaip.dao.interf;

import java.io.Serializable;
import java.util.List;

import org.esaip.exception.DAOException;

/**
 * Interface de persistence générique
 *
 *
 * @param <E>
 */
public interface IGenericDAO<E extends Serializable> {

    /**
     * Recherche l'entité par id.
     *
     * @param id
     *            Id de l'objet à rechercher
     * @return l'entité recherché
     * @throws DAOException
     *             Exception DAO
     */
    E rechercherParId(final Object id) throws DAOException;

    /**
     * Récuperer l'ensemble des entités.
     *
     * @return Liste des entités recherchées
     * @throws DAOException
     *             Exception DAO
     */
    List<E> rechercherTous() throws DAOException;

    /**
     * Liste l'ensemble des entité par le nom d'une propriete en parametre.
     *
     * @param nomPropriete
     *            propriete
     * @param valeur
     *            valeur
     * @return Liste des entités recherchées
     * @throws DAOException
     *             Exception DAO
     */
    List<E> rechercherParAttribut(final String nomPropriete, final Object valeur) throws DAOException;

    /**
     * rechercher les elements.
     *
     * @param debut
     *            de la recherche
     * @param quantite
     *            d'objet retourné
     * @return Liste des entités recherchées
     * @throws DAOException
     *             Exception DAO
     */
    List<E> rechercherElements(final int debut, final int quantite) throws DAOException;

    /**
     * Compter les entités.
     *
     * @return nombre total d'entités
     * @throws DAOException
     *             Exception DAO
     */
    long compterTous() throws DAOException;

    /**
     * Créer l'objet en base.
     *
     * @param entity
     *            l'entité à créer
     * @return l'entité créé
     * @throws DAOException
     *             Exception DAO
     */
    E creer(final E entity) throws DAOException;

    /**
     * Modifie l'entité équivalent à JPA merge.
     *
     * @param entity
     *            à modifier
     * @return l'entité modifié
     * @throws DAOException
     *             Exception DAO
     */
    E modifier(final E entity) throws DAOException;

    /**
     * Supprimer une entité
     *
     * @param entity
     *            entité à supprimer
     * @throws DAOException
     *             Exception DAO
     */
    void supprimer(final E entity) throws DAOException;

    /**
     * Supprimer une entité
     *
     * @param id
     *            Id de l'objet à supprimer
     * @throws DAOException
     *             Exception DAO
     */
    void supprimerParId(final Object id) throws DAOException;

    /**
     * Synchronise la base de données avec le contenu du context de persistence.
     *
     * @throws DAOException
     *             Exception DAO
     */
    void flush() throws DAOException;

    /**
     * Nettoie le contexte de persistence et détacher toutes les entités
     *
     * @throws DAOException
     *             Exception DAO
     */
    void clear() throws DAOException;
}
