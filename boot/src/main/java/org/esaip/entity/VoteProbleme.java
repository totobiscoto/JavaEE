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
public class VoteProbleme implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_etudiant")
        private int idEtudiant;  
	@Column(name="nom")
        private String nomEtudiant;
	@Column(name="prenom")	
	private String prenomEtudiant;
	@Column(name="groupe")	
	private int groupeEtudiant;
	@Column(name="ID_groupe")	
	private int groupeId;
	
	public int getArticleId() {
		return idEtudiant;
	}
	public void setArticleId(int articleId) {
		this.idEtudiant = articleId;
	}
	public String getTitle() {
		return nomEtudiant;
	}
	public void setTitle(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenom() {
		return prenomEtudiant;
	}
	public void setPrenom(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	public int getGroupeEtudiant() {
		return groupeEtudiant;
	}
	public void setGroupeEtudiant(int groupeEtudiant) {
		this.groupeEtudiant = groupeEtudiant;
	}
	public int getGroupeID() {
		return groupeId;
	}
	public void setGroupeID(int groupeId) {
		this.groupeId = groupeId;
	}
}  