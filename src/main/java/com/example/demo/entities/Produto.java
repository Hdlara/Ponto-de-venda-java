package com.example.demo.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private int quantidade;
	private Double vcompra;
	private Double vvenda;
	
	@ManyToMany
	@JoinTable(name = "tb_produto_categoria", 
	joinColumns = @JoinColumn(name = "produto_id"),
	inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	private Set<Categoria> categorias = new HashSet<>();
	
	public Produto() {
		super();
	}


	public Produto(long id, String nome, int quantidade, Double vcompra,
			Double vvenda) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.vcompra = vcompra;
		this.vvenda = vvenda;
	}


	public long getIdp() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Double getVcompra() {
		return vcompra;
	}


	public void setVcompra(Double vcompra) {
		this.vcompra = vcompra;
	}


	public Double getVvenda() {
		return vvenda;
	}


	public void setVvenda(Double vvenda) {
		this.vvenda = vvenda;
	}

	public  Set<Categoria> getCategoria(){
		return	categorias; 
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
}
