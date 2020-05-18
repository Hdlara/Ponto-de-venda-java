package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Local;
import com.example.demo.repositories.LocalRepository;

@Service
public class LocalService {
	
	@Autowired
	private LocalRepository repository;
	
	
	public List<Local> findAll(){
		return repository.findAll();
	}

	public Local findById(Long id) {
		Optional<Local> obj = repository.findById(id);
		return obj.get(); 
	}
}
