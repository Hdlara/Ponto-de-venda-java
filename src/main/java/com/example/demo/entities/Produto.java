package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto extends Categoria implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idp;
	private String nome;
	private int quantidade;
	private Double vcompra;
	private Double vvenda;
	
	
	public Produto() {
		super();
	}


	public Produto(long idc, String departamento, long idp, String nome, int quantidade, Double vcompra,
			Double vvenda) {
		super(idc, departamento);
		this.idp = idp;
		this.nome = nome;
		this.quantidade = quantidade;
		this.vcompra = vcompra;
		this.vvenda = vvenda;
	}


	public long getIdp() {
		return idp;
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


	
	
}
