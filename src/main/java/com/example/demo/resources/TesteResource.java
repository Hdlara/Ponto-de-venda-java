package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Testeee;
import com.example.demo.services.TesteeeService;

@RestController
@RequestMapping(value = "/Testes")
public class TesteResource {
	
	@Autowired
	private TesteeeService service; 
	
	@GetMapping
	public ResponseEntity<List<Testeee>> findall(){
		List<Testeee> list = service.findAll();

		return ResponseEntity.ok().body(list);
	
	
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Testeee> findById(@PathVariable long id){
		Testeee obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}