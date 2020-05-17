package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Venda;
import com.example.demo.repositories.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository repository;
	
	
	public List<Venda> findAll(){
		return repository.findAll();
	}

	public Venda findById(Long id) {
		Optional<Venda> obj = repository.findById(id);
		return obj.get(); 
	}
}
