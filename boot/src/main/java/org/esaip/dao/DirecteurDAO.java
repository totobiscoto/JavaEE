package org.esaip.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import org.esaip.entity.DirecteurEntite;


/**
 * Implémentation de la DAO pour la gestion des données de l'entité DirecteurEntite
 *
 *
 */
@Repository
public class DirecteurDAO {
	@PersistenceContext
	private EntityManager em;

	public List<DirecteurEntite> allDirecteur() {
		return em.createQuery("SELECT d FROM DIRECTEUR d", DirecteurEntite.class).getResultList();
	}

	public DirecteurEntite directeurId(long id) {
		DirecteurEntite directeur= (org.esaip.entity.DirecteurEntite) em.createQuery("SELECT n FROM Directeur n WHERE n.id LIKE :searchTerm").setParameter("searchTerm", id).getSingleResult();
		return directeur;
	}

	public DirecteurEntite directeurGeneral() {
		DirecteurEntite directeur= (org.esaip.entity.DirecteurEntite) em.createQuery("SELECT n FROM Directeur n LIKE :searchTerm").setParameter("searchTerm", true).getSingleResult();
		return directeur;
	}
}
