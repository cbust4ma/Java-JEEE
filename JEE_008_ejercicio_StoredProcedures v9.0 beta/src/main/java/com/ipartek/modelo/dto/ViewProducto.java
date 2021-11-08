package com.ipartek.modelo.dto;

public class ViewProducto {
	private int id;
	private String nombre;
	private double precio;
	private String descripcion;
	private int FK_tipo;
	private String tipo;
	private int FK_iva;
	private String iva;
	private double valor;

	public ViewProducto(int id, String nombre, double precio, String descripcion, int fK_tipo, String tipo, int fK_iva,
			String iva, double valor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.FK_tipo = fK_tipo;
		this.tipo = tipo;
		this.FK_iva = fK_iva;
		this.iva = iva;
		this.valor = valor;
	}

	public ViewProducto() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = 0.0;
		this.descripcion = "";
		this.FK_tipo = 0;
		this.tipo = "";
		this.FK_iva = 0;
		this.iva = "";
		this.valor = 0.0;
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

	@Override
	public String toString() {
		return "ViewProducto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", FK_tipo=" + FK_tipo + ", tipo=" + tipo + ", FK_iva=" + FK_iva + ", iva=" + iva + ", valor=" + valor
				+ "]";
	}

}
