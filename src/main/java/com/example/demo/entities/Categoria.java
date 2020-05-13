package com.example.demo.entities;

public class Categoria {

	private long idc;
	private String departamento;
	
	public Categoria() {
	}

	public Categoria(long idc, String departamento) {
		super();
		this.idc = idc;
		this.departamento = departamento;
	}

	public long getIdc() {
		return idc;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idc ^ (idc >>> 32));
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
		Categoria other = (Categoria) obj;
		if (idc != other.idc)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
