package tn.esprit.spring.springbootdatajpaentity.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tn.esprit.spring.springbootdatajpaentity.entity.DetailProduit;
import tn.esprit.spring.springbootdatajpaentity.repository.DetailProduitRepository;
import tn.esprit.spring.springbootdatajpaentity.service.DetailProduitService;

@Component
public class DetailProduitServiceImpl implements DetailProduitService{
	
	@Autowired
	DetailProduitRepository detailProduitRepository;

	@Override
	public DetailProduit addDetailProduit(DetailProduit detailProduit) {
		return detailProduitRepository.save(detailProduit);
	}

	@Override
	public List<DetailProduit> retrieveAllDetailProduit() {
		return StreamSupport.stream(detailProduitRepository.findAll().spliterator(), false)
			    .collect(Collectors.toList());
	}

	@Override
	public void deleteDetailProduit(Long id) {
		detailProduitRepository.deleteById(id);
		
	}

	@Override
	public DetailProduit updateDetailProduit(DetailProduit c) {
		return detailProduitRepository.save(c);
	}

	@Override
	public DetailProduit retrieveDetailProduit(Long id) {
		return detailProduitRepository.findById(id).orElse(null);
	}

}
