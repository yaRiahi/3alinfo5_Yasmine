package tn.esprit.spring.springbootdatajpaentity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootdatajpaentity.entity.Facture;

@Service
public interface FactureService {
	
	List<Facture> retrieveAllFactures();
	
	void cancelFacture(Long id);
	
	Facture retrieveFacture(Long id);
	List<Facture> getFacturesByClient(Long idClient);
	
	Facture addFacture(Facture f, long idClient);
}
