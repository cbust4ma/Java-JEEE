package com.ipartek.modelo.dto;

public class Iva {

private int id;
private String iva;
private double valor;

public Iva(int id, String iva, double valor) {
	super();
	this.id = id;
	this.iva = iva;
	this.valor = valor;
}

public Iva() {
	super();
	this.id = 0;
	this.iva = "";
	this.valor = 0.0;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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
	return "Iva [id=" + id + ", iva=" + iva + ", valor=" + valor + "]";
}


	
}
