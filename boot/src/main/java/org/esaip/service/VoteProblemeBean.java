package org.esaip.service;

import org.springframework.stereotype.Component;

/**
 * Classe qui represente un VoteProbleme.
 * 
 */
@Component
public class VoteProblemeBean {
    
    public VoteProblemeBean() {
        super();
    }

	/**
	 * Identifiant de l'étudiant créant le problème.
	 */
	private int idEtudiant;

	/**
	 * Id du problème suivant le vote.
	 */
	private int idProbleme;


	public int getIdProbleme() {
		return idProbleme;
	}

	public void setIdProbleme(int idProbleme) {
		this.idProbleme = idProbleme;
	}
	
	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	/**
	 * Donne une representation du contenu de l'objet.
	 * 
	 * @return la representation
	 */
	public String toString() {
		return this.getClass().getName() + " :: " + "idEtudiant : " + this.idEtudiant + ", idProbleme : "
				+ this.idProbleme;
	}


}
