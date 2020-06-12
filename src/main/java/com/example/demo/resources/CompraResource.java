package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Compra;
import com.example.demo.services.CompraService;

@RestController
@RequestMapping(value = "/compras")
public class CompraResource {
	
	@Autowired
	private CompraService service; 
	
	@GetMapping
	public ResponseEntity<List<Compra>> findall(){
		List<Compra> list = service.findAll();

		return ResponseEntity.ok().body(list);
	
	
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Compra> findById(@PathVariable long id){
		Compra obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}