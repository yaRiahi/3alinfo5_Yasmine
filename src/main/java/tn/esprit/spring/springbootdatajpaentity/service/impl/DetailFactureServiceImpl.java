package tn.esprit.spring.springbootdatajpaentity.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tn.esprit.spring.springbootdatajpaentity.entity.DetailFacture;
import tn.esprit.spring.springbootdatajpaentity.repository.DetailFactureRepository;
import tn.esprit.spring.springbootdatajpaentity.service.DetailFactureService;

@Component
public class DetailFactureServiceImpl implements DetailFactureService{
	
	@Autowired
	DetailFactureRepository detailFactureRepository;

	@Override
	public List<DetailFacture> retrieveAllDetailFactures() {
		return StreamSupport.stream(detailFactureRepository.findAll().spliterator(), false)
			    .collect(Collectors.toList());
	}

	@Override
	public DetailFacture addDetailFacture(DetailFacture c) {
		return detailFactureRepository.save(c);
	}

	@Override
	public void deleteDetailFacture(Long id) {
		detailFactureRepository.deleteById(id);
		
	}

	@Override
	public DetailFacture updateDetailFacture(DetailFacture c) {
		return detailFactureRepository.save(c);
	}

	@Override
	public DetailFacture retrieveDetailFacture(Long id) {
		return detailFactureRepository.findById(id).orElse(null);
	}

}
