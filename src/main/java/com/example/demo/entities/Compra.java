/*package com.example.demo.entities;

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
	@JoinColumn(name = "fornecedor_id")
	private Fornecedor fornecedo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "funcionari_id")
	private Funcionario funcionari;

	@OneToMany(mappedBy = "id.compra")
	private Set<ItemCompra> itemsc = new HashSet<>();
	
	@OneToOne (mappedBy = "compra", cascade = CascadeType.ALL)
	private PagamentoC pagamentoC;
	
	public Compra() {
	}

	public Compra(long id, Instant moment, StatusCompra statusCompra, Fornecedor fornecedo, Funcionario funcionari) {
		super();
		this.id = id;
		this.moment = moment;
		setStatusCompra(statusCompra);
		this.fornecedo = fornecedo;
		this.funcionari = funcionari;
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

	public Fornecedor getFornecedo() {
		return fornecedo;
	}

	public void setFornecedo(Fornecedor fornecedo) {
		this.fornecedo = fornecedo;
	}
	
	public Funcionario getFuncioanri() {
		return funcionari;
	}

	public void setFuncionario(Funcionario funcionari) {
		this.funcionari = funcionari;
	}
	
	public Set<ItemCompra> getItemsc() {
		return itemsc;
	}
	
	public PagamentoC getPagamentoC() {
		return pagamentoC;
	}

	public void setPagamentoC(PagamentoC pagamentoC) {
		this.pagamentoC = pagamentoC;
	}
	
	public double getTotal() {
		double som = 0;
		for(ItemCompra x : itemsc ) {
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
		Compra other = (Compra) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}*/