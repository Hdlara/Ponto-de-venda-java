package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.Cliente;
import com.example.demo.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente("4564564", 0L, "Henrique", "Henriquediaslara@Hotmail.com", "44985064807", "449850312645", "994589258", "RUA CINCO", "Jardim ype", "Nova odessa", "sp", null, "40", "13460000");
		Cliente c2 = new Cliente("5645", 0L, "Jorge", "jorgebemjor@com", "2134564", "12312313", "1999458931", "rua dois", "Centro", "Nova Odessa", "minas", "Sobrado", "1b", "5456456564");
		
		clienteRepository.saveAll(Arrays.asList(c1,c2));
	}

}
