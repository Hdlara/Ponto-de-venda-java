package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Testeee extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String sosos;
	public String kaak;
	public Testeee(Long id, String nome, String email, String cpf, String cnpj, String telefone, Long id3,
			String logradouro, String bairro, String cidade, String estado, String complemento, int numero, long cep,
			Long id2, String sosos, String kaak) {
		super(id, nome, email, cpf, cnpj, telefone);
		id = id2;
		this.sosos = sosos;
		this.kaak = kaak;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getSosos() {
		return sosos;
	}
	public void setSosos(String sosos) {
		this.sosos = sosos;
	}
	public String getKaak() {
		return kaak;
	}
	public void setKaak(String kaak) {
		this.kaak = kaak;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Testeee other = (Testeee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	

}
