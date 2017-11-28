package org.esaip.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="DIRECTEUR")
public class DirecteurEntite implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_directeur")
        private int idDirecteur;
	@Column(name="nom")
    private String nomDirecteur;
	@Column(name="prenom")	
	private String prenomDirecteur;
	
	@OneToMany(mappedBy="groupe")
	  private List<GroupeEntite> listGroupe;

	public int getIdDirecteur() {
		return idDirecteur;
	}
	public void setIdDirecteur(int idDirecteur) {
		this.idDirecteur = idDirecteur;
	}
	public String getNomDirecteur() {
		return nomDirecteur;
	}
	public void setNomDirecteur(String nomDirecteur) {
		this.nomDirecteur = nomDirecteur;
	}
	public String getPrenomDirecteur() {
		return prenomDirecteur;
	}
	public void setPrenomDirecteur(String prenomDirecteur) {
		this.prenomDirecteur = prenomDirecteur;
	}
	

}  
