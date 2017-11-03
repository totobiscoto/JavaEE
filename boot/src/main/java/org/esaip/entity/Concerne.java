package org.esaip.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CONCERNE")
public class Concerne implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_groupe")
        private int idGroupe; 
	@Column(name="ID_information")
    private int idInformation;
	
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public int getIdInformation() {
		return idInformation;
	}
	public void setIdInformation(int idInformation) {
		this.idInformation = idInformation;
	}
	
}  