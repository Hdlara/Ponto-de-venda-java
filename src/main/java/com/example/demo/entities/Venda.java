package com.example.demo.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.entities.enums.StatusVenda;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;
	private Integer statusVenda;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "client_id")
	private Cliente client;

	@OneToMany(mappedBy = "id.venda")
	private Set<ItemVenda> itemsv = new HashSet<>();
	
	@OneToOne (mappedBy = "venda", cascade = CascadeType.ALL)
	private Pagamento pagamento;
	
	public Venda() {
	}

	public Venda(long id, Instant moment, StatusVenda statusVenda, Cliente client) {
		super();
		this.id = id;
		this.moment = moment;
		setStatusVenda(statusVenda);
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
	
	public StatusVenda getStatusVenda() {
		return StatusVenda.valueOf(statusVenda);
	}

	public void setStatusVenda(StatusVenda statusVenda) {
		if (statusVenda != null) {
			this.statusVenda = statusVenda.getCode();
		}
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public Set<ItemVenda> getItemsv() {
		return itemsv;
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public double getTotal() {
		double som = 0;
		for(ItemVenda x : itemsv ) {
			som += x.getSubTot();		
		}
		return som;
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
		Venda other = (Venda) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}