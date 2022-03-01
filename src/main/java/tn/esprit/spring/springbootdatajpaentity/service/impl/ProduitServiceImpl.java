package tn.esprit.spring.springbootdatajpaentity.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tn.esprit.spring.springbootdatajpaentity.entity.DetailProduit;
import tn.esprit.spring.springbootdatajpaentity.entity.Produit;
import tn.esprit.spring.springbootdatajpaentity.entity.Stock;
import tn.esprit.spring.springbootdatajpaentity.repository.ProduitRepository;
import tn.esprit.spring.springbootdatajpaentity.repository.StockRepository;
import tn.esprit.spring.springbootdatajpaentity.service.DetailProduitService;
import tn.esprit.spring.springbootdatajpaentity.service.ProduitService;
import tn.esprit.spring.springbootdatajpaentity.service.RayonService;
import tn.esprit.spring.springbootdatajpaentity.service.StockService;


@Component
public class ProduitServiceImpl implements ProduitService{
	
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	DetailProduitService detailProduitService;
	@Autowired
	RayonService rayonService;
	@Autowired
	StockService stockService;
	@Autowired
	StockRepository stockrepo;

	@Override
	public List<Produit> retrieveAllProduits() {
		return StreamSupport.stream(produitRepository.findAll().spliterator(), false)
			    .collect(Collectors.toList());
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		if(p!=null) {
			p.setRayon(rayonService.getRayonById(idRayon));
			p.setStock(stockService.retrieveStock(idStock));
			DetailProduit detailProduit = new DetailProduit();
			//if the product has already an attached detail
			if(p.getDetailProduit() != null) {
				detailProduit = p.getDetailProduit();
			}
			detailProduit.setDateCreation(new Date());
			p.setDetailProduit(detailProduitService.addDetailProduit(detailProduit));
		}
		return produitRepository.save(p);
	}

	@Override
	public Produit retrieveProduit(Long id) {
		return produitRepository.findById(id).orElse(null);
	}

	@Override
	public void assignProduitToStock(Long idProduit, Long idStock) {
		
		Produit p = produitRepository.findById(idProduit).orElse(null);
		Stock s = stockrepo.findById(idStock).orElse(null);
		/*
		 * s.getProduits().add(p); stockrepo.save(s);
		 */
		p.setStock(s);
		produitRepository.save(p);
	}

}
