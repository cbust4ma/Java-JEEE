package com.ipartek;

public class Comic {
	
	private String	titulo;
	private double	precio;
	private	String	editorial;
	
	public Comic(String titulo, double precio, String editorial) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.editorial = editorial;
	}

	public Comic() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "comic [titulo=" + titulo + ", precio=" + precio + ", editorial=" + editorial + "]";
	}
	
}
