package com.example.demo.entities;

import java.io.Serializable;

public class Pessoa extends Local implements Serializable  {
	private static final long serialVersionUID = 1L;

	public String nome;
	public String email;
	public String cpf;
	public String cnpj;
	public String telefone;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String email, String cpf, String cnpj, String telefone, String logradouro, String bairro, String cidade, String estado, String complemento, String numero,
			String cep) {
		super(logradouro, bairro, cidade, estado, complemento, numero, cep);
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	
	
	
}
