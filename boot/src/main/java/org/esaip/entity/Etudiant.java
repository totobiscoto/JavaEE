package org.esaip.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="ETUDIANT")
public class Etudiant implements Serializable { 
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
	
	@ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="ID_groupe")
	  private Groupe groupe;
	
	@ManyToMany
	  @JoinTable(
	      name="VOTE_PROBLEME",
	      joinColumns=@JoinColumn(name="ID_etudiant", referencedColumnName="ID_etudiant"),
	      inverseJoinColumns=@JoinColumn(name="ID_probleme", referencedColumnName="ID_probleme"))
	  private List<Probleme> listProblemeVote;
	
	@OneToMany(mappedBy="problemeCreer")
	  private List<Probleme> listProblemeCreer;
	
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
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
}  
