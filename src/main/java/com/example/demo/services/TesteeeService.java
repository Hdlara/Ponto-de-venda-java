package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Testeee;
import com.example.demo.repositories.TesteeeRepository;

@Service
public class TesteeeService {
	
	@Autowired
	private TesteeeRepository repository;
	
	
	public List<Testeee> findAll(){
		return repository.findAll();
	}

	public Testeee findById(Long id) {
		Optional<Testeee> obj = repository.findById(id);
		return obj.get(); 
	}
}
