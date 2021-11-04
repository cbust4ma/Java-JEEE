package com.ipartek.modelo.dto;

import java.util.GregorianCalendar;


public class Ticket {
	private int id;
	private String fecha;
	
	
	public Ticket(int id, String fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}
	public Ticket() {
		super();
		this.id = 0;
		this.fecha = "";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", fecha=" + fecha + "]";
	}
	
	

}
