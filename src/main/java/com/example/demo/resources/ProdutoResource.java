package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produto;


@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@GetMapping
	public ResponseEntity<Produto> findall(){
		
		Produto u = new Produto(0L, "ALIMENTOS", 45L, "Coca Cola", 1 , 3.00, 9.00);
		return ResponseEntity.ok().body(u);

	}
}
