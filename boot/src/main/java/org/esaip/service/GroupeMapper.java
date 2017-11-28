package org.esaip.service;

import org.esaip.entity.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe utilitaire permettant de mapper les objet entité vers des objets DTO.
 * 
 * 
 */
public final class GroupeMapper {

	/**
	 * Constructeur privée pour la classe utilitaire.
	 */
	private GroupeMapper() {

	}

	/**
	 * Transformer un objet persistant DirecteurEntite en DirecteurBean.
	 * 
	 * @param DirecteurEntite
	 *            objet source
	 * @return directeurBean l'objet cree
	 */
	public static DirecteurBean transformDirecteurEntiteToBean(
			DirecteurEntite DirecteurEntite) {

		DirecteurBean directeurBean = null;
		if (DirecteurEntite != null) {
			// renseigner les informations du directeur
			directeurBean = new DirecteurBean();
			directeurBean.setIdDirecteur(DirecteurEntite.getIdDirecteur());
			directeurBean.setNomDirecteur(DirecteurEntite.getNomDirecteur());
			directeurBean.setPrenomDirecteur(DirecteurEntite.getPrenomDirecteur());
		}
		return directeurBean;
	}

	/**
	 * Transformer un objet directeurBean en Objet persistant DirecteurEntite.
	 * 
	 * @param directeurBean
	 *            objet source
	 * @return DirecteurEntite l'objet cree
	 */
	public static DirecteurEntite transformDirecteurBeanToEntite(
			DirecteurBean directeurBean) {

		DirecteurEntite directeurEntite = null;
		if (directeurBean != null) {
			// renseigner les informations de la personne
			directeurEntite = new DirecteurEntite();
			directeurEntite.setNomDirecteur(directeurBean.getNomDirecteur());
			directeurEntite.setPrenomDirecteur(directeurBean.getPrenomDirecteur());
		}
		return directeurEntite;
	}

	/**.
	 * Transformer une liste d'objet persistant DirecteurEntite en une liste
	 * d'objet directeurBean
	 * 
	 * @param listDirecteurEntite
	 *            objet source
	 * @return listeDirecteurBean la liste à créer
	 */
	public static List<DirecteurBean> transformListPersonnesEntiteToBeans(
			List<DirecteurEntite> listDirecteurEntite) {

		List<DirecteurBean> listeDirecteurBean = null;
		if (listDirecteurEntite != null) {
			listeDirecteurBean = new ArrayList<DirecteurBean>();

			// Iteration sur la liste de resultats
			for (DirecteurEntite DirecteurEntite : listDirecteurEntite) {
				listeDirecteurBean
						.add(transformDirecteurEntiteToBean(DirecteurEntite));
			}
		}
		return listeDirecteurBean;
	}

	/**
	 * Actualiser les informations du directeur à partir de l'objet directeurBean.
	 * 
	 * @param DirecteurEntite
	 *            Entité à mettre à jour
	 * @param directeurBean
	 *            directeurBean avec les informations modifiées
	 * @return DirecteurEntite
	 */
	public static DirecteurEntite updateDirecteurEntiteFromBean(
			DirecteurEntite directeurEntite, DirecteurBean directeurBean) {
		// remplir les informations à jour dans l'entité
		if (directeurBean != null && directeurEntite != null) {
			directeurEntite.setNomDirecteur(directeurBean.getNomDirecteur());
			directeurEntite.setPrenomDirecteur(directeurBean.getPrenomDirecteur());

		}
		return directeurEntite;
	}

}
