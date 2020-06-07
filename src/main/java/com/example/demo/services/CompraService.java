/*package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Compra;
import com.example.demo.repositories.CompraRepository;

@Service
public class CompraService {
	
	@Autowired
	private CompraRepository repository;
	
	
	public List<Compra> findAll(){
		return repository.findAll();
	}

	public Compra findById(Long id) {
		Optional<Compra> obj = repository.findById(id);
		return obj.get(); 
	}
}
*/