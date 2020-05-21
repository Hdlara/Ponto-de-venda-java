package com.example.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.Categoria;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Produto;
import com.example.demo.entities.Testeee;
import com.example.demo.entities.Venda;
import com.example.demo.entities.enums.StatusVenda;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.ProdutoRepository;
import com.example.demo.repositories.TesteeeRepository;
import com.example.demo.repositories.VendaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private VendaRepository vendaRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	@Autowired
	private TesteeeRepository testeeeRepository;
	
	
	//@Autowired
	//private LocalRepository localRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public void run(String... args) throws Exception {

		

		Testeee t1 = new Testeee(0L, "Henrique", "laall", "456465", "445456", "464564", 0L, "laal", "nansnas", null, null, "asaa", 45646, 0L, 0L, "çaslaçl", "akssla");
		
		testeeeRepository.saveAll(Arrays.asList(t1));
		
		Cliente u1 = new Cliente(0L, "Henrique", 0L, "João", "ajskaj@hotmail.com", "445697946", "654564", 
		"19994589258");
		//0L, "RUA CINCO", "VILA AZENHA", "NOVA ODESSA", "SÃO PAULO", null, 40, 45464564654L
				
		Cliente u2 = new Cliente(0L, "SENHA ",0L, "Henrique Dias ", "Henriquediaslara@Hotmail.com ", "44985064807 ",
				"449850312645 ", "994589258 ");
		//0L, "RUA HENRIQUE ", "CENTRO ", "AMERICANA ", "RIO DE JANEIRO","só por colocar ", 78, 7897987987L
		
		Cliente u3 = new Cliente( 0L, "difere", 0L , "NAKSAN", "HNAKSI@Hotmail.com", "21231654148",
				"23156498", "654654");
		//, 0L, "RUA oliveira", "jd mirandola", "suruguai", "oeste",null, 71, 78979567L
		
		
		
		Venda v1 = new Venda(0L, Instant.parse("2019-06-20T19:53:07Z"), StatusVenda.ENTREGE, u1);
		Venda v2 = new Venda(0L, Instant.parse("2019-07-21T03:42:10Z"), StatusVenda.AGUARDANDO_ENVIO, u2);
		Venda v3 = new Venda(0L, Instant.parse("2019-07-22T15:21:22Z"), StatusVenda.ENTREGE, u3);
		Venda v4 = new Venda(4L, Instant.parse("2019-08-20T19:53:07Z"), StatusVenda.ENTREGE, u3);
		Venda v5 = new Venda(5L, Instant.parse("2019-11-21T03:42:10Z"), StatusVenda.AGUARDANDO_ENVIO, u2);
		Venda v6 = new Venda(6L, Instant.parse("2019-07-22T15:21:22Z"), StatusVenda.CANCELADO, u1);
		
		Categoria cat1 = new Categoria(0L, "Electronics");
		Categoria cat2 = new Categoria(0L, "Books");
		Categoria cat3 = new Categoria(0L, "Computers"); 
		
		Produto p1 = new Produto(0L, "The Lord of the Rings", 5, 50.00 , 100.00);
		Produto p2 = new Produto(0L, "Smart TV", 3, 80.00 , 200.00);
		Produto p3 = new Produto(0L, "Macbook Pro", 50, 70.00 , 150.00);
		Produto p4 = new Produto(0L, "Electronics",  51, 90.00 , 170.00);
		Produto p5 = new Produto(0L, "Rails for Dummies", 53, 10.00 , 150.00); 
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		clienteRepository.saveAll(Arrays.asList(u1, u2, u3));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		vendaRepository.saveAll(Arrays.asList(v1, v2, v3, v4, v5, v6));
		
		p1.getCategoria().add(cat3);
		p2.getCategoria().add(cat1);
		p2.getCategoria().add(cat3);
		p3.getCategoria().add(cat3);
		p4.getCategoria().add(cat1);
		p5.getCategoria().add(cat3);
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));		
	}
}
