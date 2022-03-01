package tn.esprit.spring.springbootdatajpaentity.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.spring.springbootdatajpaentity.enums.CategorieClient;
import tn.esprit.spring.springbootdatajpaentity.enums.Profession;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFacture;
	private float montantRemise;
	private float montantFacture;
	@Temporal (TemporalType.TIME)
	private Date dateFacture;
	private Boolean active;
	@ManyToOne
	private Client client;
	@OneToMany(mappedBy="facture")
	private List<DetailFacture> detailFactures;
	
	
	
	
	
	public Facture(float montantRemise, float montantFacture, Date dateFacture, Boolean active) {
		super();
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.active = active;
	}
	

}
