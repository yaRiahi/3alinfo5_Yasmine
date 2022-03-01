package tn.esprit.spring.springbootdatajpaentity.service;

import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootdatajpaentity.entity.Rayon;

@Service
public interface RayonService {
	
	public Rayon getRayonById(Long id);

}
