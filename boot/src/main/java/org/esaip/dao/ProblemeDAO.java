package org.esaip.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.esaip.entity.GroupeEntite;
import org.esaip.entity.ProblemeEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité ProblemeEntite
 *
 *
 */
@Repository
public class ProblemeDAO{
	@PersistenceContext
	private EntityManager em;

	// récupération de tous les problemes
	@SuppressWarnings("unchecked")
	public List<ProblemeEntite> allPb() {
		List<ProblemeEntite> probleme;
		probleme = em.createQuery("SELECT pb FROM Probleme pb").getResultList();

		return probleme;

	}

	public void supprimer(long id) {
		em.createQuery("DELETE FROM Probleme pb WHERE pb.id LIKE :searchTerm").setParameter("searchTerm", id)
				.executeUpdate();

	}

	@SuppressWarnings("unchecked")
	public void insert(GroupeEntite etudiant, String contenu, int idEtudiant) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate localDate = LocalDate.now();
		long date = Long.valueOf(dtf.format(localDate));
		// limitation de problèmes par jours
		List<ProblemeEntite> problemes;
		problemes = em.createQuery("SELECT pb FROM Probleme pb WHERE pb.etudiant LIKE :searchTerm")
				.setParameter("searchTerm", etudiant).getResultList();

		if (problemes.size() < etudiant.getLimiteProbleme()) {
			ProblemeEntite pb = new ProblemeEntite();
			pb.setIdEtudiant(idEtudiant);
			pb.setDateProbleme(date);
			pb.setContenuProbleme(contenu);
			em.persist(pb);
		}

	}

	public ProblemeEntite problemeById(long id) {
		ProblemeEntite probleme = (org.esaip.entity.ProblemeEntite) em.createQuery("SELECT pb FROM Probleme pb WHERE pb.id LIKE :searchTerm")
				.setParameter("searchTerm", id).getSingleResult();
		return probleme;
	}
}
