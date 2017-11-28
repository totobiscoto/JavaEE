package org.esaip.service;

import org.springframework.stereotype.Component;

/**
 * Classe qui represente un Concerne.
 * 
 */
@Component
public class ConcerneBean {
    
    public ConcerneBean() {
        super();
    }

	/**
	 * Identifiant groupe concerne.
	 */
	private int idGroupeConcerne;

	/**
	 * Identifiant information concerne.
	 */
	private int idInformationConcerne;
	
	/**
	 * Retourne la valeur de l'attribut idGroupeConcerne.
	 * 
	 * @return la valeur de l'attribut idGroupeConcerne
	 */
	public int getIdGroupeConcerne() {
		return this.idGroupeConcerne;
	}

	/**
	 * Met à jour la valeur de l'attribut idGroupeConcerne.
	 * 
	 * @param idConcerne
	 *            la nouvelle valeur de l'attribut idGroupeConcerne
	 */
	public void setIdGroupeConcerne(int idGroupeConcerne) {
		this.idGroupeConcerne = idGroupeConcerne;
	}

	/**
	 * Retourne la valeur de l'attribut idInformationConcerne.
	 * 
	 * @return la valeur de l'attribut idInformationConcerne
	 */
	public int getIdInformationConcerne() {
		return this.idInformationConcerne;
	}

	/**
	 * Met à jour la valeur de l'attribut nom.
	 * 
	 * @param nomConcerne
	 *            la nouvelle valeur de l'attribut nom
	 */
	public void setIdInformationConcerne(int idInformationConcerne) {
		this.idInformationConcerne = idInformationConcerne;
	}

	/**
	 * Donne une representation du contenu de l'objet.
	 * 
	 * @return la representation
	 */
	public String toString() {
		return this.getClass().getName() + " :: " + "idGroupeConcerne : " + this.idGroupeConcerne + ", idInformationConcerne : "
				+ this.idInformationConcerne;
	}

}
