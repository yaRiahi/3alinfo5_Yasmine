package tn.esprit.spring.springbootdatajpaentity.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.springbootdatajpaentity.entity.Client;
import tn.esprit.spring.springbootdatajpaentity.repository.ClientRepository;
import tn.esprit.spring.springbootdatajpaentity.service.ClientService;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public List<Client> retrieveAllClients() {
		
	
		  return StreamSupport.stream(clientRepository.findAll().spliterator(), false)
		  .collect(Collectors.toList());
		 
	}

	@Override
	public Client addClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
		
	}

	@Override
	public Client updateClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public Client retrieveClient(Long id) {
		Client c = clientRepository.findById(id).get();
		log.info("le nom du client est "+ c.getNom());
		return c;
	}

	@Override
	public String hello(String msg) {

		return "Bonjour Esprit " + msg;
	}

}
