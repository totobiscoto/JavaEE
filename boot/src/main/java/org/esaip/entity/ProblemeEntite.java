package org.esaip.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="PROBLEME")
public class ProblemeEntite implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_probleme")
        private int idProbleme;  
	@Column(name="contenu")
    private String contenuProbleme;
	@Column(name="creation")	
	private Date dateProbleme;
	@Column(name="ID_etudiant")	
	private int idEtudiant;	
	
	 @OneToMany(mappedBy="probleme")
	  private List<EtudiantEntite> listEtudiant;
	
	@ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="ID_etudiant")
	  private EtudiantEntite etudiant;
	
	public int getIdProbleme() {
		return idProbleme;
	}
	public void setIdProbleme(int idProbleme) {
		this.idProbleme = idProbleme;
	}
	public String getContenuProbleme() {
		return contenuProbleme;
	}
	public void setContenuProbleme(String contenuProbleme) {
		this.contenuProbleme = contenuProbleme;
	}
	public Date getDateProbleme() {
		return dateProbleme;
	}
	public void setDateProbleme(Date dateProbleme) {
		this.dateProbleme = dateProbleme;
	}
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
}  
