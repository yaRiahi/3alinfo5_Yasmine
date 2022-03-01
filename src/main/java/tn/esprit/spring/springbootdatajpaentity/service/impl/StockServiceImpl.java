package tn.esprit.spring.springbootdatajpaentity.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tn.esprit.spring.springbootdatajpaentity.entity.Stock;
import tn.esprit.spring.springbootdatajpaentity.repository.StockRepository;
import tn.esprit.spring.springbootdatajpaentity.service.StockService;

@Component
public class StockServiceImpl implements StockService{
	
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		return StreamSupport.stream(stockRepository.findAll().spliterator(), false)
			    .collect(Collectors.toList());
	}

	@Override
	public Stock addStock(Stock s) {
		return stockRepository.save(s);
	}

	@Override
	public Stock updateStock(Stock u) {
		return stockRepository.save(u);
	}

	@Override
	public Stock retrieveStock(Long id) {
		return stockRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteStock(Long id) {
		stockRepository.deleteById(id);
	}

	@Override
	 public void deletePdtetstocks(Long idStock) 
		{ 

			Stock s = stockRepository.findById(idStock).get();
			stockRepository.delete(s);
		}
}
