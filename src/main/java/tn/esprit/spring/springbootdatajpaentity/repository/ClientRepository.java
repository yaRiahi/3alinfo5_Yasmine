package tn.esprit.spring.springbootdatajpaentity.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.springbootdatajpaentity.entity.Client;
import tn.esprit.spring.springbootdatajpaentity.enums.CategorieClient;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{
@Query("select sum(f.montantFacture) from Facture f join f.client c where c.categorieClient=:categorieClient and f.dateFacture between :d1 and :d2")
	public float getChiffreAffaireParCategorieClient(@Param("categorieClient") CategorieClient categorieClient,@Param("d1") Date startDate ,@Param("d2") Date endDate);




}
