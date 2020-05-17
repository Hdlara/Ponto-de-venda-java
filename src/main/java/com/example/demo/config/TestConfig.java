package com.example.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Venda;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.VendaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private VendaRepository vendaRepository;

	@Override
	public void run(String... args) throws Exception {

		

		Cliente u1 = new Cliente(0L, "João", "ajskaj@hotmail.com", "445697946", "654564", 
				"19994589258", "RUA CINCO", "VILA AZENHA", "NOVA ODESSA", "SÃO PAULO", 
				null, 40, 45464564654L, 0L, "Henrique");
				
		Cliente u2 = new Cliente(0L, "Henrique Dias", "Henriquediaslara@Hotmail.com", "44985064807",
				"449850312645", "994589258", "RUA HENRIQUE", "CENTRO", "AMERICANA", "RIO DE JANEIRO",
				null, 78, 7897987987L, 6L, "SENHA");
		
		Cliente u3 = new Cliente(0L, "NAKSAN", "HNAKSI@Hotmail.com", "21231654148",
				"23156498", "654654", "RUA oliveira", "jd mirandola", "suruguai", "oeste",
				null, 71, 78979567L, 665L, "difere");
	
		Venda v1 = new Venda(0L, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Venda v2 = new Venda(0L, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Venda v3 = new Venda(0L, Instant.parse("2019-07-22T15:21:22Z"), u3);
		Venda v4 = new Venda(4L, Instant.parse("2019-08-20T19:53:07Z"), u3);
		Venda v5 = new Venda(5L, Instant.parse("2019-11-21T03:42:10Z"), u2);
		Venda v6 = new Venda(6L, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		clienteRepository.saveAll(Arrays.asList(u1, u2, u3));
		vendaRepository.saveAll(Arrays.asList(v1, v2, v3, v4, v5, v6));
		
		
	}
}
