package org.esaip.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="VOTE_PROBLEME")
public class VoteProblemeEntite implements Serializable { //TODO
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_etudiant")
        private int idEtudiant;  
	@Column(name="ID_probleme")
        private int idProbleme;
		
	public int getEtudiantId() {
		return idEtudiant;
	}
	public void setEtudiantId(int etudiantId) {
		this.idEtudiant = etudiantId;
	}
	public int getProbleme() {
		return idProbleme;
	}
	public void setProbleme(int idProbleme) {
		this.idProbleme = idProbleme;
	}
	
}  