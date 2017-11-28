package org.esaip.service;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Classe qui represente un Probleme.
 * 
 */
@Component
public class ProblemeBean {
    
    public ProblemeBean() {
        super();
    }

	/**
	 * Identifiant du probleme.
	 */
	private int idProbleme;

	/**
	 * Contenu du problème.
	 */
	private String contenuProbleme;

	/**
	 * Date de création du problème.
	 */
	private Date dateProbleme;
	/**
	 * id de l'étudiant créant le problème.
	 */
	private int idEtudiantProbleme;
	
	/**
	 * Retourne la valeur de l'attribut id.
	 * 
	 * @return la valeur de l'attribut id
	 */
	public int getIdProbleme() {
		return this.idProbleme;
	}

	/**
	 * Met à jour la valeur de l'attribut id.
	 * 
	 * @param idProbleme
	 *            la nouvelle valeur de l'attribut id
	 */
	public void setIdProbleme(int idProbleme) {
		this.idProbleme = idProbleme;
	}

	/**
	 * Retourne la valeur de l'attribut contenuProbleme.
	 * 
	 * @return la valeur de l'attribut contenuProbleme
	 */
	public String getContenuProbleme() {
		return this.contenuProbleme;
	}

	/**
	 * Met à jour la valeur de l'attribut contenuProbleme.
	 * 
	 * @param nomProbleme
	 *            la nouvelle valeur de l'attribut contenuProbleme
	 */
	public void setContenuProbleme(String contenuProbleme) {
		this.contenuProbleme = contenuProbleme;
	}

	/**
	 * Retourne la valeur de l'attribut dateProbleme.
	 * 
	 * @return la valeur de l'attribut dateProbleme
	 */
	public Date getDateProbleme() {
		return this.dateProbleme;
	}

	/**
	 * Met à jour la valeur de l'attribut dateProbleme.
	 * 
	 * @param prenomProbleme
	 *            la nouvelle valeur de l'attribut dateProbleme
	 */
	public void setDateProbleme(Date dateProbleme) {
		this.dateProbleme = dateProbleme;
	}
	
	/**
	 * Retourne la valeur de l'attribut idEtudiantProbleme.
	 * 
	 * @return la valeur de l'attribut idEtudiantProbleme
	 */
	public int getIdEtudiantProbleme() {
		return this.idEtudiantProbleme;
	}

	/**
	 * Met à jour la valeur de l'attribut idEtudiantProbleme.
	 * 
	 * @param prenomProbleme
	 *            la nouvelle valeur de l'attribut idEtudiantProbleme
	 */
	public void setIdEtudiantProbleme(int idEtudiantProbleme) {
		this.idEtudiantProbleme = idEtudiantProbleme;
	}

	/**
	 * Donne une representation du contenu de l'objet.
	 * 
	 * @return la representation
	 */
	public String toString() {
		return this.getClass().getName() + " :: " + "id : " + this.idProbleme + ", contenu : "
				+ this.contenuProbleme + ", dateCreationProbleme : " + this.dateProbleme+ ", idEtudiantProbleme : " + this.idEtudiantProbleme;
	}

}
