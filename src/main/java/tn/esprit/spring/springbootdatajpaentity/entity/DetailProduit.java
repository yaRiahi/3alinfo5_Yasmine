package tn.esprit.spring.springbootdatajpaentity.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tn.esprit.spring.springbootdatajpaentity.enums.CategorieProduit;

@Entity
public class DetailProduit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDetailProduit;
	@Temporal (TemporalType.TIME)
	private Date dateCreation;
	@Temporal (TemporalType.TIME)
	private Date dateDerniereModification;
	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;
	@OneToOne(mappedBy="detailProduit")
	private Produit produit;
	
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Long getIdDetailProduit() {
		return idDetailProduit;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}
	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	public CategorieProduit getCategorieProduit() {
		return categorieProduit;
	}
	public void setCategorieProduit(CategorieProduit categorieProduit) {
		this.categorieProduit = categorieProduit;
	}
	
	

}
