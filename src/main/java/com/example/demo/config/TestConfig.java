package com.example.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.Categoria;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Compra;
import com.example.demo.entities.Fornecedor;
import com.example.demo.entities.Funcionario;
import com.example.demo.entities.ItemCompra;
import com.example.demo.entities.ItemVenda;
import com.example.demo.entities.Pagamento;
import com.example.demo.entities.PagamentoC;
import com.example.demo.entities.Produto;
import com.example.demo.entities.Testeee;
import com.example.demo.entities.Venda;
import com.example.demo.entities.enums.StatusCompra;
import com.example.demo.entities.enums.StatusVenda;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.CompraRepository;
import com.example.demo.repositories.FornecedorRepository;
import com.example.demo.repositories.FuncionarioRepository;
import com.example.demo.repositories.ItemCompraRepository;
import com.example.demo.repositories.ItemVendaRepository;
import com.example.demo.repositories.ProdutoRepository;
import com.example.demo.repositories.TesteeeRepository;
import com.example.demo.repositories.VendaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Autowired
	private VendaRepository vendaRepository;

	@Autowired
	private CompraRepository compraRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private TesteeeRepository testeeeRepository;

	// @Autowired
	// private LocalRepository localRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ItemCompraRepository itemCompraRepository;

	@Autowired
	private ItemVendaRepository itemVendaRepository;

	@Override
	public void run(String... args) throws Exception {

		

		Testeee t1 = new Testeee(0L, "Henrique", "laall", "456465", "445456", "464564", 0L, "laal", "nansnas", null, null, "asaa", 45646, 0L, 0L, "çaslaçl", "akssla");
		
		testeeeRepository.saveAll(Arrays.asList(t1));
		
		Cliente u1 = new Cliente(0L, "Henrique", 0L, "João", "ajskaj@hotmail.com", "445697946", "654564", 
		"19994589258");
		Cliente u2 = new Cliente(0L, "Jordão ",0L, "Henrique Dias ", "Henriquediaslara@Hotmail.com ", "44985064807 ",
				"449850312645 ", "994589258 ");		
		Cliente u3 = new Cliente( 0L, "Leo", 0L , "NAKSAN", "HNAKSI@Hotmail.com", "21231654148",
				"23156498", "654654");
				
		Fornecedor f1 = new Fornecedor(0L, "lksxo", 0L, "abcextintores", "abcgmail.com", null, "546465456", "xx-xxxx-xxxx");
		Fornecedor f2 = new Fornecedor(0L, "abcdls", 0L, "eiditos", "oidoicgmail.com", null, "789798798", "xx-64654-5646");
		Fornecedor f3 = new Fornecedor(0L, "lala", 0L, "akxja", "lalalgmail.com", null, "123123132", "xx-asas-asas");
		
		Funcionario fu1 = new Funcionario(0L, "Ivan", 0L, "ivan", "ivanlala@hotmail.com", "985326548", "aixurays", 
				"5645646");
		Funcionario fu2 = new Funcionario(0L, "jess", 0L, "jessica", "jessica@hotmail.com", "546165", "torzeta", 
				"321879");
		Funcionario fu3 = new Funcionario(0L, "bela", 0L, "izabela", "izabela@hotmail.com", "3126548", "xablau", 
				"321654");
		
		Compra c1 = new Compra(0L, Instant.parse("2019-06-20T19:53:07Z"), StatusCompra.ENTREGE, f1, fu2);
		Compra c2 = new Compra(0L, Instant.parse("2019-08-20T19:53:07Z"), StatusCompra.AGUARDANDO_ENVIO, f2, fu2);
		Compra c3 = new Compra(0L, Instant.parse("2019-07-22T15:21:22Z"), StatusCompra.ENTREGE, f3, fu3);
		//Compra c4 = new Compra(0L, Instant.parse("2019-08-20T19:53:07Z"), StatusCompra.ENTREGE, u3, fu1);
		//Compra c5 = new Compra(0L, Instant.parse("2019-11-21T03:42:10Z"), StatusCompra.AGUARDANDO_ENVIO, u2, fu1);
		//Compra c6 = new Compra(0L, Instant.parse("2019-07-22T15:21:22Z"), StatusCompra.AGUARDANDO_ENVIO, u1, fu1);		
				
		Venda v1 = new Venda(0L, Instant.parse("2019-06-20T19:53:07Z"), StatusVenda.ENTREGE, u1, fu1);
		Venda v2 = new Venda(0L, Instant.parse("2019-07-21T03:42:10Z"), StatusVenda.AGUARDANDO_ENVIO, u2, fu1);
		Venda v3 = new Venda(0L, Instant.parse("2019-07-22T15:21:22Z"), StatusVenda.ENTREGE, u3, fu1);
		Venda v4 = new Venda(0L, Instant.parse("2019-08-20T19:53:07Z"), StatusVenda.ENTREGE, u3, fu1);
		Venda v5 = new Venda(0L, Instant.parse("2019-11-21T03:42:10Z"), StatusVenda.AGUARDANDO_ENVIO, u2, fu1);
		Venda v6 = new Venda(0L, Instant.parse("2019-07-22T15:21:22Z"), StatusVenda.CANCELADO, u1, fu1);
		
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
		fornecedorRepository.saveAll(Arrays.asList(f1, f2, f3));
		compraRepository.saveAll(Arrays.asList(c1, c2, c3));
		funcionarioRepository.saveAll(Arrays.asList(fu1, fu2, fu3));
		
		/*Local l1 = new Local(0L, "RUA CINCO", "VILA AZENHA", "NOVA ODESSA", "SÃO PAULO", null, 40, 45464564654L, u1);
		Local l2 = new Local(0L, "RUA oliveira", "jd mirandola", "suruguai", "oeste",null, 71, 78979567L, u2);
		Local l3 = new Local(0L, "RUA HENRIQUE ", "CENTRO ", "AMERICANA ", "RIO DE JANEIRO","só por colocar ", 78, 7897987987L, u3);

		u1.setLocal(l1);
		u2.setLocal(l2);
		u3.setLocal(l3);*/
		
		clienteRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		p1.getCategoria().add(cat3);
		p2.getCategoria().add(cat1);
		p2.getCategoria().add(cat3);
		p3.getCategoria().add(cat3);
		p4.getCategoria().add(cat1);
		p5.getCategoria().add(cat3);
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));		

		ItemCompra ic1 = new ItemCompra(c1, p1, 2, p1.getVcompra());
		ItemCompra ic2 = new ItemCompra(c1, p3, 1, p3.getVcompra());
		ItemCompra ic3 = new ItemCompra(c2, p3, 5, p3.getVcompra());
		ItemCompra ic4 = new ItemCompra(c3, p5, 2, p5.getVcompra());
		
		ItemVenda iv1 = new ItemVenda(v1, p1, 3, p1.getVvenda());
		ItemVenda iv2 = new ItemVenda(v1, p3, 9, p3.getVvenda());
		ItemVenda iv3 = new ItemVenda(v2, p3, 7, p3.getVvenda());
		ItemVenda iv4 = new ItemVenda(v3, p5, 2, p5.getVvenda());
		
		itemCompraRepository.saveAll(Arrays.asList(ic1, ic2, ic3, ic4));
		itemVendaRepository.saveAll(Arrays.asList(iv1, iv2, iv3, iv4));
	
		Pagamento pai1 = new Pagamento(0L, Instant.parse("2019-06-20T21:53:07Z"), v1);
		Pagamento pai2 = new Pagamento(0L, Instant.parse("2019-08-20T20:53:07Z"), v3);
		Pagamento pai3 = new Pagamento(0L, Instant.parse("2019-07-22T16:21:22Z"), v4);
		v1.setPagamento(pai1);
		v4.setPagamento(pai2);
		v3.setPagamento(pai3);
															
		PagamentoC paic1 = new PagamentoC(0L, Instant.parse("2019-06-20T21:53:07Z"), c1);
		PagamentoC paic2 = new PagamentoC(0L, Instant.parse("2019-08-20T20:53:07Z"), c3);
		PagamentoC paic3 = new PagamentoC(0L, Instant.parse("2019-07-22T16:21:22Z"), c2);
		c1.setPagamentoC(paic1);
		c2.setPagamentoC(paic2);
		c3.setPagamentoC(paic3);
		
		vendaRepository.saveAll(Arrays.asList(v1, v3, v4));
		compraRepository.saveAll(Arrays.asList(c1, c2, c3));
		
	}

}
