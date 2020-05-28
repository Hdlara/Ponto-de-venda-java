package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.entities.pk.ItemVendaPk;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_item_venda")
public class ItemVenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemVendaPk id = new ItemVendaPk();
	private Integer quantidade;
	private double price;
	
	public ItemVenda() {
	}

	public ItemVenda( Venda venda, Produto produto, Integer quantidade, double price) {
		super();
		id.setVenda(venda);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.price = price;
	}
	@JsonIgnore
	public Venda getVenda() {
		return id.getVenda();
	}
	
	public void setVenda(Venda venda) {
		id.setVenda(venda);
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
	
	public double getSubTot() {
		return price * quantidade;
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
		ItemVenda other = (ItemVenda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
