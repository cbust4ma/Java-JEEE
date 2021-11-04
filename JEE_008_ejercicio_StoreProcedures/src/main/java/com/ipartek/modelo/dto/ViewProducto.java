package com.ipartek.modelo.dto;

public class ViewProducto {
	
	private int id;
	private String nombre;
	private double precio;
	private String descripcion;
	private int fk_tipo;
	private String tipo;
	private String iva;
	private double valor;
	private int fk_iva;
	
	
	
	public ViewProducto(int id, String nombre, double precio, String descripcion, int fk_tipo, String tipo, String iva,
			double valor, int fk_iva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.fk_tipo = fk_tipo;
		this.tipo = tipo;
		this.iva = iva;
		this.valor = valor;
		this.fk_iva = fk_iva;
	}
	
	public ViewProducto() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = 0.0;
		this.descripcion = "";
		this.fk_tipo = 0;
		this.tipo = "";
		this.iva = "";
		this.valor = 0;
		this.fk_iva = 0;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIva() {
		return iva;
	}

	public void setIva(String iva) {
		this.iva = iva;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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
		return "ViewProducto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", fk_tipo=" + fk_tipo + ", tipo=" + tipo + ", iva=" + iva + ", valor=" + valor + ", fk_iva=" + fk_iva
				+ "]";
	}

	
	
	
	
	

}
