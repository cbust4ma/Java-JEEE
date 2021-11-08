package com.ipartek.modelo.dto;

public class Producto {
	
	private int id;
	private String nombre;
	private double precio;
	private String descripcion;
	private int fk_tipo;
	private int fk_iva;
	
	
	public Producto(int id, String nombre, double precio, String descripcion, int fk_tipo, int fk_iva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.fk_tipo = fk_tipo;
		this.fk_iva = fk_iva;
	}
	
	public Producto() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = 0;
		this.descripcion = "";
		this.fk_tipo = 0;
		this.fk_iva = 0;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getFk_tipo() {
		return fk_tipo;
	}

	public void setFk_tipo(int fk_tipo) {
		this.fk_tipo = fk_tipo;
	}

	public int getFk_iva() {
		return fk_iva;
	}

	public void setFk_iva(int fk_iva) {
		this.fk_iva = fk_iva;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", fk_tipo=" + fk_tipo + ", fk_iva=" + fk_iva + "]";
	}
	
	
	
	

}
