package com.ipartek.modelo.dto;

public class Producto {
	
	private int id;
	private String nombre;
	private String precio;
	private String stock;
	
	
	public Producto(int id, String nombre, String precio, String stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Producto() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = "";
		this.stock = "";
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

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
	
	

}
