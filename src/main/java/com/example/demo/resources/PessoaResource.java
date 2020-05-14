package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Pessoa;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {

	@GetMapping
	public ResponseEntity<Pessoa> findall(){
		
		Cliente c = new Cliente(null, 0L, null, null, null, null, null, null, null, null, null, null, null, null);
		return ResponseEntity.ok().body(c);
		//Pessoa u = new Pessoa(null, null, null, null, null, null, null, null, null, null, null, null);
		//return ResponseEntity.ok().body(u);
		
	
	}
	
}
