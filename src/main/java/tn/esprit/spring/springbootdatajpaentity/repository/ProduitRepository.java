package tn.esprit.spring.springbootdatajpaentity.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.springbootdatajpaentity.entity.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
