package tn.esprit.spring.springbootdatajpaentity.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fournisseur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFournisseur;
	private String code;
	private String libelle;
	
	
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
