package tn.esprit.spring.springbootdatajpaentity.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	private String code;
	private String libelle;
	private float prixUnitaire;
	@ManyToMany
	private List<Fournisseur> fournisseurs;
	@ManyToOne
	private Rayon rayon;
	@OneToMany(mappedBy="produit")
	private List<DetailFacture> detailFactures;
	@OneToOne
	private DetailProduit detailProduit;
	@ManyToOne
	private Stock stock;
	
	
	
	public Produit() {
		super();
	}
	
	

	public List<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}



	public void setFournisseurs(List<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}



	public Rayon getRayon() {
		return rayon;
	}



	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}



	public List<DetailFacture> getDetailFactures() {
		return detailFactures;
	}



	public void setDetailFactures(List<DetailFacture> detailFactures) {
		this.detailFactures = detailFactures;
	}



	public DetailProduit getDetailProduit() {
		return detailProduit;
	}



	public void setDetailProduit(DetailProduit detailProduit) {
		this.detailProduit = detailProduit;
	}



	public Stock getStock() {
		return stock;
	}



	public void setStock(Stock stock) {
		this.stock = stock;
	}



	public Produit(Long idProduit, String code, String libelle, float prixUnitaire) {
		super();
		this.idProduit = idProduit;
		this.code = code;
		this.libelle = libelle;
		this.prixUnitaire = prixUnitaire;
	}

	public Long getIdProduit() {
		return idProduit;
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

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	
	
	
}
