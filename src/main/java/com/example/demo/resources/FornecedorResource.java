package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Fornecedor;
import com.example.demo.services.FornecedorService;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResource {
	
	@Autowired
	private FornecedorService service; 
	
	@GetMapping
	public ResponseEntity<List<Fornecedor>> findall(){
		List<Fornecedor> list = service.findAll();

		return ResponseEntity.ok().body(list);
	
	
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Fornecedor> findById(@PathVariable long id){
		Fornecedor obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}