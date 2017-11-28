package org.esaip.service;

import org.springframework.stereotype.Component;

/**
 * Classe qui represente un directeur.
 * 
 */
@Component
public class DirecteurBean {
    
    public DirecteurBean() {
        super();
    }

	/**
	 * Identifiant de la personne.
	 */
	private int idDirecteur;

	/**
	 * Nom de la personne.
	 */
	private String nomDirecteur;

	/**
	 * Prenom de la personne.
	 */
	private String prenomDirecteur;

	
	/**
	 * Retourne la valeur de l'attribut id.
	 * 
	 * @return la valeur de l'attribut id
	 */
	public int getIdDirecteur() {
		return this.idDirecteur;
	}

	/**
	 * Met à jour la valeur de l'attribut id.
	 * 
	 * @param idDirecteur
	 *            la nouvelle valeur de l'attribut id
	 */
	public void setIdDirecteur(int idDirecteur) {
		this.idDirecteur = idDirecteur;
	}

	/**
	 * Retourne la valeur de l'attribut nom.
	 * 
	 * @return la valeur de l'attribut nom
	 */
	public String getNomDirecteur() {
		return this.nomDirecteur;
	}

	/**
	 * Met à jour la valeur de l'attribut nom.
	 * 
	 * @param nomDirecteur
	 *            la nouvelle valeur de l'attribut nom
	 */
	public void setNomDirecteur(String nomDirecteur) {
		this.nomDirecteur = nomDirecteur;
	}

	/**
	 * Retourne la valeur de l'attribut prenom.
	 * 
	 * @return la valeur de l'attribut prenom
	 */
	public String getPrenomDirecteur() {
		return this.prenomDirecteur;
	}

	/**
	 * Met à jour la valeur de l'attribut prenom.
	 * 
	 * @param prenomDirecteur
	 *            la nouvelle valeur de l'attribut prenom
	 */
	public void setPrenomDirecteur(String prenomDirecteur) {
		this.prenomDirecteur = prenomDirecteur;
	}

	/**
	 * Donne une representation du contenu de l'objet.
	 * 
	 * @return la representation
	 */
	public String toString() {
		return this.getClass().getName() + " :: " + "id : " + this.idDirecteur + ", nom : "
				+ this.nomDirecteur + ", prenom : " + this.prenomDirecteur;
	}

}
