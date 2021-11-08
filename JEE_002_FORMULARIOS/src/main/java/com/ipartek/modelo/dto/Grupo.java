package com.ipartek.modelo.dto;

public class Grupo {
	
	private int id;
	private String nombre;
	private int ndiscos;
	private int nintegrantes;
	
	
	public Grupo(int id, String nombre, int ndiscos, int nintegrantes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ndiscos = ndiscos;
		this.nintegrantes = nintegrantes;
	}
	
	public Grupo() {
		super();
		this.id = 0;
		this.nombre = "";
		this.ndiscos = 0;
		this.nintegrantes = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNdiscos() {
		return ndiscos;
	}

	public void setNdiscos(int ndiscos) {
		this.ndiscos = ndiscos;
	}

	public int getNintegrantes() {
		return nintegrantes;
	}

	public void setNintegrantes(int nintegrantes) {
		this.nintegrantes = nintegrantes;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nombre=" + nombre + ", ndiscos=" + ndiscos + ", nintegrantes=" + nintegrantes
				+ "]";
	}
	
	
	

}
