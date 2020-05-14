package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String password;

	
	public Cliente(){		
	}
	
	

	public Cliente(String password,	long id, String nome, String email, String cpf, String cnpj, String telefone, String logradouro,
			String bairro, String cidade, String estado, String complemento, String numero, String cep) {
		super(nome, email, cpf, cnpj, telefone, logradouro, bairro, cidade, estado, complemento, numero, cep);
		this.password = password;
		this.id = id;
	}

	
	

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public long getId() {
		return id;
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
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
