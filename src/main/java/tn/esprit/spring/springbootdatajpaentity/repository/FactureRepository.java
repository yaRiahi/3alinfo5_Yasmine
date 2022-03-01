package tn.esprit.spring.springbootdatajpaentity.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.springbootdatajpaentity.entity.Facture;

public interface FactureRepository extends CrudRepository<Facture, Long>{

	@Query(value ="UPDATE Facture set active=0 WHERE id_facture=?1")
	void cancelFacture(Long id);

}
