package com.ipartek.modelo.dto;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	private String descripcion;
	private int FK_tipo;
	private int FK_iva;
	
	public Producto(int id, String nombre, double precio, String descripcion, int fK_tipo, int fK_iva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		FK_tipo = fK_tipo;
		FK_iva = fK_iva;
	}
	public Producto() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = 0;
		this.descripcion = "";
		FK_tipo = 0;
		FK_iva = 0;
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
	public int getFK_tipo() {
		return FK_tipo;
	}
	public void setFK_tipo(int fK_tipo) {
		FK_tipo = fK_tipo;
	}
	public int getFK_iva() {
		return FK_iva;
	}
	public void setFK_iva(int fK_iva) {
		FK_iva = fK_iva;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", FK_tipo=" + FK_tipo + ", FK_iva=" + FK_iva + "]";
	}
	
	
	
	
}
