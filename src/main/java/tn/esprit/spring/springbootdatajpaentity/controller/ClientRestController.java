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
import tn.esprit.spring.springbootdatajpaentity.service.impl.ClientServiceImpl;

@RestController
public class ClientRestController {

	@Autowired 
	ClientServiceImpl clientService;
	// http://localhost:8888/SpringMVC/retrieve-all-clients
	@GetMapping("/retrieve-all-clients")
	@ResponseBody
	public List<Client> getClients(){
		List<Client> listClients = clientService.retrieveAllClients();
		return listClients;
	}
	//http://localhost:8888/SpringMVC/retrieve-client/1
	@GetMapping("/retrieve-client/{client-id}")
	@ResponseBody
	public Client retrieveClient(@PathVariable("client-id") Long clientid) {
		return clientService.retrieveClient(clientid);
	}
	
	
	//http://localhost:8888/SpringMVC/add-client
	@PostMapping("/add-client")
	@ResponseBody
	public Client addClient(@RequestBody Client c) {
		Client client = clientService.addClient(c);
		return client;
	}
	
}
