package org.esaip.service;

import org.springframework.stereotype.Component;

/**
 * Classe qui represente une Information.
 * 
 */
@Component
public class InformationBean {
    
    public InformationBean() {
        super();
    }

	/**
	 * Identifiant de l'information.
	 */
	private int idInformation;

	/**
	 * Contenu de l'information.
	 */
	private String contenuInformation;
	
	/**
	 * Retourne la valeur de l'attribut id.
	 * 
	 * @return la valeur de l'attribut id
	 */
	public int getIdInformation() {
		return this.idInformation;
	}

	/**
	 * Met à jour la valeur de l'attribut id.
	 * 
	 * @param idInformation
	 *            la nouvelle valeur de l'attribut id
	 */
	public void setIdInformation(int idInformation) {
		this.idInformation = idInformation;
	}
	/**
	 * Retourne la valeur de l'attribut contenuInformation.
	 * 
	 * @return la valeur de l'attribut contenuInformation
	 */
	public String getContenuInformation() {
		return this.contenuInformation;
	}

	/**
	 * Met à jour la valeur de l'attribut contenuInformation.
	 * 
	 * @param idInformation
	 *            la nouvelle valeur de l'attribut contenuInformation
	 */
	public void setContenuInformation(String contenuInformation) {
		this.contenuInformation = contenuInformation;
	}

	/**
	 * Donne une representation du contenu de l'objet.
	 * 
	 * @return la representation
	 */
	public String toString() {
		return this.getClass().getName() + " :: " + "id : " + this.idInformation + ", contenu : "
				+ this.contenuInformation;
	}

}
