package tn.esprit.spring.springbootdatajpaentity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootdatajpaentity.entity.DetailFacture;

@Service
public interface DetailFactureService {
	
	List<DetailFacture> retrieveAllDetailFactures();
	
	DetailFacture addDetailFacture(DetailFacture c);

	void deleteDetailFacture(Long id);

	DetailFacture updateDetailFacture(DetailFacture c);

	DetailFacture retrieveDetailFacture(Long id);

}
