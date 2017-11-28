package org.esaip.service;

import org.springframework.stereotype.Component;

/**
 * Classe qui represente un Groupe.
 * 
 */
@Component
public class GroupeBean {
    
    public GroupeBean() {
        super();
    }

	/**
	 * Identifiant du groupe.
	 */
	private int idGroupe;

	/**
	 * Nom de la personne.
	 */
	private String classeGroupe;

	/**
	 * Limite problème par groupe
	 */
	private int limiteProblemeGroupe;

	/**
	 * id du directeur affilié au groupe.
	 */
	private int idDirecteurGroupe;
	
	/**
	 * Retourne la valeur de l'attribut id.
	 * 
	 * @return la valeur de l'attribut id
	 */
	public int getIdGroupe() {
		return this.idGroupe;
	}

	/**
	 * Met à jour la valeur de l'attribut id.
	 * 
	 * @param idGroupe
	 *            la nouvelle valeur de l'attribut id
	 */
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	/**
	 * Retourne la valeur de l'attribut nom.
	 * 
	 * @return la valeur de l'attribut nom
	 */
	public String getClasseGroupe() {
		return this.classeGroupe;
	}

	/**
	 * Met à jour la valeur de l'attribut classeGroupe.
	 * 
	 * @param classeGroupe
	 *            la nouvelle valeur de l'attribut classeGroupe
	 */
	public void setClasseGroupe(String classeGroupe) {
		this.classeGroupe = classeGroupe;
	}

	/**
	 * Retourne la valeur de l'attribut limiteProbleme.
	 * 
	 * @return la valeur de l'attribut limiteProbleme
	 */
	public int getLimiteProblemeGroupe() {
		return this.limiteProblemeGroupe;
	}

	/**
	 * Met à jour la valeur de l'attribut limiteProbleme.
	 * 
	 * @param prenomGroupe
	 *            la nouvelle valeur de l'attribut limiteProbleme
	 */
	public void setLimiteProblemeGroupe(int limiteProblemeGroupe) {
		this.limiteProblemeGroupe = limiteProblemeGroupe;
	}
	/**
	 * Retourne la valeur de l'attribut IdDirecteurGroupe.
	 * 
	 * @return la valeur de l'attribut IdDirecteurGroupe
	 */
	public int getIdDirecteurGroupe() {
		return this.idDirecteurGroupe;
	}

	/**
	 * Met à jour la valeur de l'attribut IdDirecteurGroupe.
	 * 
	 * @param prenomGroupe
	 *            la nouvelle valeur de l'attribut IdDirecteurGroupe
	 */
	public void setIdDirecteurGroupe(int idDirecteurGroupe) {
		this.idDirecteurGroupe = idDirecteurGroupe;
	}
	/**
	 * Donne une representation du contenu de l'objet.
	 * 
	 * @return la representation
	 */
	public String toString() {
		return this.getClass().getName() + " :: " + "id : " + this.idGroupe + ", classe : "
				+ this.classeGroupe + ", limiteProbleme : " + this.limiteProblemeGroupe+ ", idDirecteurGroupe : " + this.idDirecteurGroupe;
	}

}
