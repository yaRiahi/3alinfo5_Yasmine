package tn.esprit.spring.springbootdatajpaentity.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tn.esprit.spring.springbootdatajpaentity.entity.Client;
import tn.esprit.spring.springbootdatajpaentity.entity.Facture;
import tn.esprit.spring.springbootdatajpaentity.repository.ClientRepository;
import tn.esprit.spring.springbootdatajpaentity.repository.FactureRepository;
import tn.esprit.spring.springbootdatajpaentity.service.FactureService;

@Component
public class FactureServiceImpl implements FactureService{
	
	@Autowired
	FactureRepository factureRepository;
	@Autowired
	ClientRepository clientRepo;
	
	
	@Override
	public List<Facture> retrieveAllFactures() {
		return StreamSupport.stream(factureRepository.findAll().spliterator(), false)
			    .collect(Collectors.toList());
	}

	@Override
	public void cancelFacture(Long id) {
		factureRepository.cancelFacture(id);
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
		return factureRepository.findById(id).orElse(null);
	}

	@Override
	public List<Facture> getFacturesByClient(Long idClient) {
		
		Client c = clientRepo.findById(idClient).get();
		List<Facture> listfac = c.getListeFactures();
		return listfac;
	}
	
	@Transactional
	public Facture addFacture(Facture f, long idClient) {
		Client client=clientRepo.findById(idClient).get();
		f.setClient(client);
		return factureRepository.save(f);
		
	}

}
