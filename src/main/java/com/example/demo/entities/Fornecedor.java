package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_Fornecedor")
public class Fornecedor extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "fornecedo")
	private List<Compra> compras = new ArrayList<Compra>();
	
	public Fornecedor(){		
	}

	public Fornecedor(long id2, String password, Long id, String nome, String email, String cpf, String cnpj, String telefone) {
		super(id, nome, email, cpf, cnpj, telefone);
		id = id2;
		this.password = password;

	}
	
	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	/*public List<Compra> getCompras() {
		return compras;
	}*/
	
	public static long getSerialversionuid() {
		return serialVersionUID;
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
		Fornecedor other = (Fornecedor) obj;
		if (id != other.id)
			return false;
		return true;
	}


}
