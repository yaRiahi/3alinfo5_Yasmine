package tn.esprit.spring.springbootdatajpaentity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.springbootdatajpaentity.entity.Client;
import tn.esprit.spring.springbootdatajpaentity.entity.Stock;
import tn.esprit.spring.springbootdatajpaentity.service.impl.StockServiceImpl;

@RestController
public class StockRestController {
	@Autowired
	StockServiceImpl stockService;
	
	
	// http://localhost:8888/SpringMVC/retrieve-all-stocks
	@GetMapping("/retrieve-all-stocks")
	@ResponseBody
	public List<Stock> getStocks(){
		List<Stock> listStocks = stockService.retrieveAllStocks();
		return listStocks;
	}
	
	//http://localhost:8888/SpringMVC/retrieve-stock/1
		@GetMapping("/retrieve-stock/{stock-id}")
		@ResponseBody
		public Stock retrieveStock(@PathVariable("stock-id") Long stockid) {
			return stockService.retrieveStock(stockid);
		}
		
		
		//http://localhost:8888/SpringMVC/add-stock
		@PostMapping("/add-stock")
		@ResponseBody
		public Stock addStock(@RequestBody Stock s) {
			Stock stock = stockService.addStock(s);
			return stock;
		}
	
}
