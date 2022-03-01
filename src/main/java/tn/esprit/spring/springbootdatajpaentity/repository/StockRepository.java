package tn.esprit.spring.springbootdatajpaentity.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.springbootdatajpaentity.entity.Stock;

public interface StockRepository  extends CrudRepository<Stock, Long>{

}
