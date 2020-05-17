/*package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Local implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Long id;
	public String logradouro;
	public String bairro;
	public String cidade;
	public String estado;
	public String complemento;
	public int numero;
	public long cep;
	
	@OneToMany(mappedBy = "loca")
	private List<Pessoa> Pessoa = new ArrayList<>();
	
	public Local() {
	}

	public Local(Long id, String logradouro, String bairro, String cidade, String estado, String complemento,
			int numero, long cep, List<com.example.demo.entities.Pessoa> pessoa) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
		this.numero = numero;
		this.cep = cep;
		Pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public List<Pessoa> getPessoa() {
		return Pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		Pessoa = pessoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
*/