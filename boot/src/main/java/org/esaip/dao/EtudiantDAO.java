package org.esaip.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import org.esaip.entity.EtudiantEntite;
import org.esaip.entity.GroupeEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité EtudiantEntite
 *
 *
 */
@Repository
public class EtudiantDAO{
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<EtudiantEntite> allEtudiant() {
		List<EtudiantEntite> etudiant;
		etudiant = em.createQuery("SELECT s FROM Etudiant s").getResultList();

		return etudiant;

	}

	public EtudiantEntite etudiantId(long id) {
		EtudiantEntite etudiants = (org.esaip.entity.EtudiantEntite) em
				.createQuery("SELECT etudiant FROM Etudiant etudiant WHERE etudiant.id LIKE :searchTerm").setParameter("searchTerm", id)
				.getSingleResult();
		return etudiants;
	}

	public void limite(GroupeEntite groupe, int limite) {
		groupe.setLimiteProbleme(limite);
		em.persist(groupe);
	}
}
