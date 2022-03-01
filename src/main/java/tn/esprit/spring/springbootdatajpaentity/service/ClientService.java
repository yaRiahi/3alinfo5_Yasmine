package tn.esprit.spring.springbootdatajpaentity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.springbootdatajpaentity.entity.Client;

@Service
public interface ClientService {
	
	List<Client> retrieveAllClients();
	
	Client addClient(Client c);

	void deleteClient(Long id);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
	String hello(String msg);
}
