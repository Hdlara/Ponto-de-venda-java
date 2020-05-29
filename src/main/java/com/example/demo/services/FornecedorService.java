package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Fornecedor;
import com.example.demo.repositories.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository repository;
	
	
	public List<Fornecedor> findAll(){
		return repository.findAll();
	}

	public Fornecedor findById(Long id) {
		Optional<Fornecedor> obj = repository.findById(id);
		return obj.get(); 
	}
	

	public Fornecedor insert(Fornecedor obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
