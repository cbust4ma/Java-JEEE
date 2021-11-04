package com.ipartek.modelo.dto;

public class ProductosTicket {

	private int id;
	private int FK_Producto;
	private int FK_ticket;
	private int cantidad;
	
	public ProductosTicket(int id, int fK_Producto, int fK_ticket, int cantidad) {
		super();
		this.id = id;
		FK_Producto = fK_Producto;
		FK_ticket = fK_ticket;
		this.cantidad = cantidad;
	}
	
	public ProductosTicket() {
		super();
		this.id = 0;
		FK_Producto = 0;
		FK_ticket = 0;
		this.cantidad = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFK_Producto() {
		return FK_Producto;
	}

	public void setFK_Producto(int fK_Producto) {
		FK_Producto = fK_Producto;
	}

	public int getFK_ticket() {
		return FK_ticket;
	}

	public void setFK_ticket(int fK_ticket) {
		FK_ticket = fK_ticket;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ProductosTicket [id=" + id + ", FK_Producto=" + FK_Producto + ", FK_ticket=" + FK_ticket + ", cantidad="
				+ cantidad + "]";
	}
	
	
	
	
	
	
	
}
