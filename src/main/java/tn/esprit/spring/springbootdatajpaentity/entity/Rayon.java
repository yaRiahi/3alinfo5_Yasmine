package tn.esprit.spring.springbootdatajpaentity.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rayon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRayon;
	private String code;
	private String libelle;
	@OneToMany(mappedBy="rayon")
	private List<Produit> produits;
	
	
	
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public Long getIdRayon() {
		return idRayon;
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
