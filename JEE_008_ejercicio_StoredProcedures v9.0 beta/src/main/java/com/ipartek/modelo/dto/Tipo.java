package com.ipartek.modelo.dto;

public class Tipo {

	private int id;
	private String tipo;

	public Tipo(int id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}

	public Tipo() {
		super();
		this.id = 0;
		this.tipo = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Tipo [id=" + id + ", tipo=" + tipo + "]";
	}
}
