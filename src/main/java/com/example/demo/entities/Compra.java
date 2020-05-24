package com.example.demo.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.entities.enums.StatusCompra;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;
	private Integer statusCompra;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "client_id")
	private Fornecedor client;

	public Compra() {
	}

	public Compra(long id, Instant moment, StatusCompra statusCompra, Fornecedor client) {
		super();
		this.id = id;
		this.moment = moment;
		setStatusCompra(statusCompra);
		this.client = client;
	}

	public long getId() {
		return id;
	}


	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	public StatusCompra getStatusCompra() {
		return StatusCompra.valueOf(statusCompra);
	}

	public void setStatusCompra(StatusCompra statusCompra) {
		if (statusCompra != null) {
			this.statusCompra = statusCompra.getCode();
		}
	}

	public Fornecedor getClient() {
		return client;
	}

	public void setClient(Fornecedor client) {
		this.client = client;
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
		Compra other = (Compra) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}