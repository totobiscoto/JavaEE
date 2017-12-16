package org.esaip.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.esaip.entity.DirecteurEntite;
import org.esaip.entity.InformationEntite;
import org.springframework.stereotype.Repository;


/**
 * Implémentation de la DAO pour la gestion des données de l'entité InformationEntite
 *
 *
 */
@Repository
public class InformationDAO{
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<InformationEntite> allInformation() {
		List<InformationEntite> information;
		information = em.createQuery("SELECT Information FROM Information information").getResultList();

		return information;

	}

	public InformationEntite informationId(long id) {
		InformationEntite information= (org.esaip.entity.InformationEntite) em.createQuery("SELECT info FROM Information info WHERE info.id LIKE :searchTerm").setParameter("searchTerm", id).getSingleResult();
		return information;
	}
	
	public List<InformationEntite> infoByDirecteur(DirecteurEntite directeur) {
		@SuppressWarnings("unchecked")
		List<InformationEntite>information= em.createQuery("SELECT info FROM Information info WHERE info.directeur LIKE :searchTerm").setParameter("searchTerm", directeur).getResultList();
		return information;
	}
	

	public void modificationInformation(long id, String description) {
		em.createQuery("update Information info set info.description =:description where info.id =:Id")
				.setParameter("description", description)
				.setParameter("Id", id)
				.executeUpdate();
	}

	
	public void supprimerInformation(long id) {
		em.createQuery("DELETE FROM Information info WHERE info.id LIKE :searchTerm").setParameter("searchTerm", id).executeUpdate();
		
	}
	
	public void insert(DirecteurEntite directeur,String contenu) {		
		InformationEntite information= new  InformationEntite();
		information.setDirecteur(directeur);
		information.setContenueInformation(contenu);
		em.persist(information);
	}
}
