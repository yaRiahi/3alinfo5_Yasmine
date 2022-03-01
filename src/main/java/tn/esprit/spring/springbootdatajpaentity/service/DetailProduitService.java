package tn.esprit.spring.springbootdatajpaentity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootdatajpaentity.entity.DetailProduit;

@Service
public interface DetailProduitService {
	
	public DetailProduit addDetailProduit(DetailProduit detailProduit);
	
	List<DetailProduit> retrieveAllDetailProduit();

	void deleteDetailProduit(Long id);

	DetailProduit updateDetailProduit(DetailProduit c);

	DetailProduit retrieveDetailProduit(Long id);

}
