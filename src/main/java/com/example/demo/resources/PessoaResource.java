package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Pessoa;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {

	@GetMapping
	public ResponseEntity<Pessoa> findall(){
		Pessoa u = new Pessoa("Henrique", "Henriquediaslara@hotmail.com", "44985064807", "451753768", "19994589258", "rua cinco nova odessa sp");
		return ResponseEntity.ok().body(u);
		
	
	}
	
}
