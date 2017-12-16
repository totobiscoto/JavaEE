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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="ETUDIANT")
public class EtudiantEntite implements Serializable { 
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
	  private GroupeEntite groupe;
	
	 @OneToMany(mappedBy="etudiant")
	  private List<ProblemeEntite> listProblemeVote;
	
	@OneToMany(mappedBy="problemeCreer")
	  private List<ProblemeEntite> listProblemeCreer;
	
	public int getEtudiantId() {
		return idEtudiant;
	}
	public void setEtudiantId(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	public int getGroupeEtudiant() {
		return groupeEtudiant;
	}
	public void setGroupeEtudiant(int groupeEtudiant) {
		this.groupeEtudiant = groupeEtudiant;
	}
}  
