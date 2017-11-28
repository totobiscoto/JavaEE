package org.esaip.service;

import org.esaip.entity.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe utilitaire permettant de mapper les objet entité vers des objets DTO.
 * 
 * 
 */
public final class EtudiantMapper {

	/**
	 * Constructeur privée pour la classe utilitaire.
	 */
	private EtudiantMapper() {

	}

	/**
	 * Transformer un objet persistant EtudiantEntite en EtudiantBean.
	 * 
	 * @param EtudiantEntite
	 *            objet source
	 * @return EtudiantBean l'objet cree
	 */
	public static EtudiantBean transformEtudiantEntiteToBean(
			EtudiantEntite etudiantEntite) {

		EtudiantBean etudiantBean = null;
		if (etudiantEntite != null) {
			// renseigner les informations de l' Etudiant
			etudiantBean = new EtudiantBean();
			etudiantBean.setIdEtudiant(etudiantEntite.getEtudiantId());
			etudiantBean.setNomEtudiant(etudiantEntite.getNomEtudiant());
			etudiantBean.setPrenomEtudiant(etudiantEntite.getPrenomEtudiant());
			etudiantBean.setGroupeEtudiant(etudiantEntite.getGroupeEtudiant());
		}
		return etudiantBean;
	}

	/**
	 * Transformer un objet EtudiantBean en Objet persistant EtudiantEntite.
	 * 
	 * @param EtudiantBean
	 *            objet source
	 * @return EtudiantEntite l'objet cree
	 */
	public static EtudiantEntite transformEtudiantBeanToEntite(
			EtudiantBean etudiantBean) {

		EtudiantEntite etudiantEntite = null;
		if (etudiantBean != null) {
			// renseigner les informations de la personne
			etudiantEntite = new EtudiantEntite();
			etudiantEntite.setNomEtudiant(etudiantBean.getNomEtudiant());
			etudiantEntite.setPrenomEtudiant(etudiantBean.getPrenomEtudiant());
			etudiantEntite.setGroupeEtudiant(etudiantBean.getGroupeEtudiant());
		}
		return etudiantEntite;
	}

	/**.
	 * Transformer une liste d'objet persistant EtudiantEntite en une liste
	 * d'objet EtudiantBean
	 * 
	 * @param listEtudiantEntite
	 *            objet source
	 * @return listeEtudiantBean la liste à créer
	 */
	public static List<EtudiantBean> transformListPersonnesEntiteToBeans(
			List<EtudiantEntite> listEtudiantEntite) {

		List<EtudiantBean> listeEtudiantBean = null;
		if (listEtudiantEntite != null) {
			listeEtudiantBean = new ArrayList<EtudiantBean>();

			// Iteration sur la liste de resultats
			for (EtudiantEntite etudiantEntite : listEtudiantEntite) {
				listeEtudiantBean
						.add(transformEtudiantEntiteToBean(etudiantEntite));
			}
		}
		return listeEtudiantBean;
	}

	/**
	 * Actualiser les informations du Etudiant à partir de l'objet EtudiantBean.
	 * 
	 * @param EtudiantEntite
	 *            Entité à mettre à jour
	 * @param EtudiantBean
	 *            EtudiantBean avec les informations modifiées
	 * @return EtudiantEntite
	 */
	public static EtudiantEntite updateEtudiantEntiteFromBean(
			EtudiantEntite etudiantEntite, EtudiantBean etudiantBean) {
		// remplir les informations à jour dans l'entité
		if (etudiantBean != null && etudiantEntite != null) {
			etudiantEntite.setNomEtudiant(etudiantBean.getNomEtudiant());
			etudiantEntite.setPrenomEtudiant(etudiantBean.getPrenomEtudiant());
			etudiantEntite.setGroupeEtudiant(etudiantBean.getGroupeEtudiant());
		}
		return etudiantEntite;
	}

}
