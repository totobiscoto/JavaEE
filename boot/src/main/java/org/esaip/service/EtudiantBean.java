package org.esaip.service;

import org.springframework.stereotype.Component;

/**
 * Classe qui represente un Etudiant.
 * 
 */
@Component
public class EtudiantBean {
    
    public EtudiantBean() {
        super();
    }

	/**
	 * Identifiant de la personne.
	 */
	private int idEtudiant;

	/**
	 * Nom de l'Etudiant.
	 */
	private String nomEtudiant;

	/**
	 * Prenom de l'Etudiant.
	 */
	private String prenomEtudiant;
	/**
	 * Groupe de l'Etudiant.
	 */
	private int groupeEtudiant;
	
	/**
	 * Retourne la valeur de l'attribut id.
	 * 
	 * @return la valeur de l'attribut id
	 */
	public int getIdEtudiant() {
		return this.idEtudiant;
	}

	/**
	 * Met à jour la valeur de l'attribut id.
	 * 
	 * @param idEtudiant
	 *            la nouvelle valeur de l'attribut id
	 */
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	/**
	 * Retourne la valeur de l'attribut nom.
	 * 
	 * @return la valeur de l'attribut nom
	 */
	public String getNomEtudiant() {
		return this.nomEtudiant;
	}

	/**
	 * Met à jour la valeur de l'attribut nom.
	 * 
	 * @param nomEtudiant
	 *            la nouvelle valeur de l'attribut nom
	 */
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	/**
	 * Retourne la valeur de l'attribut prenom.
	 * 
	 * @return la valeur de l'attribut prenom
	 */
	public String getPrenomEtudiant() {
		return this.prenomEtudiant;
	}

	/**
	 * Met à jour la valeur de l'attribut prenom.
	 * 
	 * @param prenomEtudiant
	 *            la nouvelle valeur de l'attribut prenom
	 */
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	/**
	 * Retourne la valeur de l'attribut groupe.
	 * 
	 * @return la valeur de l'attribut groupe
	 */
	public int getGroupeEtudiant() {
		return this.groupeEtudiant;
	}

	/**
	 * Met à jour la valeur de l'attribut groupe.
	 * 
	 * @param groupeEtudiant
	 *            la nouvelle valeur de l'attribut groupe
	 */
	public void setGroupeEtudiant(int groupeEtudiant) {
		this.groupeEtudiant = groupeEtudiant;
	}

	/**
	 * Donne une representation du contenu de l'objet.
	 * 
	 * @return la representation
	 */
	public String toString() {
		return this.getClass().getName() + " :: " + "id : " + this.idEtudiant + ", nom : "
				+ this.nomEtudiant + ", prenom : " + this.prenomEtudiant + ", groupe : " + this.groupeEtudiant;
	}

}
