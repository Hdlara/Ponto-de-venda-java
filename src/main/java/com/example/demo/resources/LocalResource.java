package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Local;
import com.example.demo.services.LocalService;

@RestController
@RequestMapping(value = "/locais")
public class LocalResource {
	
	@Autowired
	private LocalService service; 
	
	@GetMapping
	public ResponseEntity<List<Local>> findall(){
		List<Local> list = service.findAll();

		return ResponseEntity.ok().body(list);
	
	
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Local> findById(@PathVariable long id){
		Local obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}