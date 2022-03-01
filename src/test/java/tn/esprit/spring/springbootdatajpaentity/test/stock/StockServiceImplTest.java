package tn.esprit.spring.springbootdatajpaentity.test.stock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.springbootdatajpaentity.config.LoggingAspect;
import tn.esprit.spring.springbootdatajpaentity.entity.Client;
import tn.esprit.spring.springbootdatajpaentity.entity.Facture;
import tn.esprit.spring.springbootdatajpaentity.entity.Stock;
import tn.esprit.spring.springbootdatajpaentity.repository.StockRepository;
import tn.esprit.spring.springbootdatajpaentity.service.ClientService;
import tn.esprit.spring.springbootdatajpaentity.service.FactureService;
import tn.esprit.spring.springbootdatajpaentity.service.ProduitService;
import tn.esprit.spring.springbootdatajpaentity.service.StockService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StockServiceImplTest {
	@Autowired
	StockService stockService;
	@Autowired
	StockRepository stockRepo;
	@Autowired
	ProduitService produitservice;
	@Autowired
	FactureService factureservice;
	@Autowired
	ClientService clientService;
	/*
	 * @Test
	 * 
	 * @Order(1) public void testAddStock() { Stock s = new Stock();
	 * s.setLibelleStock("stock test"); s.setQte(10); s.setQteMin(100); Stock
	 * savedStock= stockService.addStock(s); assertNotNull(savedStock);
	 * assertNotNull(savedStock.getLibelleStock()); }
	 * 
	 * @Test
	 * 
	 * @Order(2) public void removeStock() { Stock savedStock=
	 * stockService.addStock(new Stock());
	 * stockService.deleteStock(savedStock.getIdStock());
	 * assertNull(stockService.retrieveStock(savedStock.getIdStock())); }
	 */
/*	@Test
	public void Test()throws ParseException{
		//produitservice.assignProduitToStock(1l, 1l);
		
		 * List<Facture> listf=factureservice.getFacturesByClient((long) 1); for(Facture
		 * fact:listf) { System.out.println("facture:" + fact.getMontantFacture()); }
		 
		//stockService.deletePdtetstocks((long) 1);
		SimpleDateFormat df =new SimpleDateFormat("dd/mm/yyyy");
		Date startdate=df.parse("15/01/1999");
		Date enddate=df.parse("15/01/2021");

		Facture f= new Facture (2,200,enddate,true);
		factureservice.addFacture(f, (long)1);
		
	}*/
/*
 * @Test public void Testlog() throws ParseException{ Client c=
 * clientService.retrieveClient((long)2); }
 */

	
	@Test
	public void testHello() throws ParseException {
		log.info(clientService.hello("Yasmine"));
	}
	
}
