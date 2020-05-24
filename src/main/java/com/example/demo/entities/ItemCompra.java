package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.entities.pk.ItemCompraPk;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_item_compra")
public class ItemCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemCompraPk id = new ItemCompraPk();
	private Integer quantidade;
	private double price;
	
	public ItemCompra() {
	}

	public ItemCompra( Compra compra, Produto produto, Integer quantidade, double price) {
		super();
		id.setCompra(compra);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.price = price;
	}
	@JsonIgnore
	public Compra getCompra() {
		return id.getCompra();
	}
	
	public void setCompra(Compra compra) {
		id.setCompra(compra);
	}
	public Produto getProduto() {
		return id.getProduto();
	}
	
	public void setProduto(Produto produto) {
		id.setProduto(produto);;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ItemCompra other = (ItemCompra) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
