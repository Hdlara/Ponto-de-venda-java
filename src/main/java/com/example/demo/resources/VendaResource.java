package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Venda;
import com.example.demo.services.VendaService;

@RestController
@RequestMapping(value = "/vendas")
public class VendaResource {
	
	@Autowired
	private VendaService service; 
	
	@GetMapping
	public ResponseEntity<List<Venda>> findall(){
		List<Venda> list = service.findAll();

		return ResponseEntity.ok().body(list);
	
	
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Venda> findById(@PathVariable long id){
		Venda obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}