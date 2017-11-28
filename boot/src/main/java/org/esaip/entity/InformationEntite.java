package org.esaip.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="INFORMATION")
public class InformationEntite implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_information")
        private int idInformation;  
	@Column(name="contenue")
        private String contenueInformation;
	
	@ManyToMany(mappedBy="groupe")
	  private List<GroupeEntite> groupe;
	
	public int getIdInformation() {
		return idInformation;
	}
	public void setIdInformation(int idInformation) {
		this.idInformation = idInformation;
	}
	public String getContenueInformation() {
		return contenueInformation;
	}
	public void setContenueInformation(String contenueInformation) {
		this.contenueInformation = contenueInformation;
	}

}  