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
@Table(name="GROUPE")
public class GroupeEntite implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_groupe")
        private int idGroupe;  
	@Column(name="classe")
    private String classeGroupe;
	@Column(name="limite_probleme")	
	private int limiteProbleme;
	@Column(name="ID_directeur")	
	private int idDirecteur;
	
	@OneToMany(mappedBy="etudiant")
	  private List<EtudiantEntite> listEtudiant;

	@ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="ID_directeur")
	  private DirecteurEntite directeur;
	
	@ManyToMany
	  @JoinTable(
	      name="CONCERNE",
	      joinColumns=@JoinColumn(name="ID_groupe", referencedColumnName="ID_groupe"),
	      inverseJoinColumns=@JoinColumn(name="ID_information", referencedColumnName="ID_information"))
	  private List<InformationEntite> listInformation;
	
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public String getClasseGroupe() {
		return classeGroupe;
	}
	public void setClasseGroupe(String classeGroupe) {
		this.classeGroupe = classeGroupe;
	}
	public int getLimiteProbleme() {
		return limiteProbleme;
	}
	public void setLimiteProbleme(int limiteProbleme) {
		this.limiteProbleme = limiteProbleme;
	}
	public int getIdDirecteur() {
		return idDirecteur;
	}
	public void setIdDirecteur(int idDirecteur) {
		this.idDirecteur = idDirecteur;
	}
}  