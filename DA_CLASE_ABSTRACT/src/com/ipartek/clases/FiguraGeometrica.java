package com.ipartek.clases;

public class FiguraGeometrica {
	
	private String 	nombre;
	private boolean esregular;
	
	
	public FiguraGeometrica(String nombre, boolean dosd) {
		super();
		this.nombre = nombre;
		this.esregular = dosd;
	}
	
	public FiguraGeometrica() {
		super();
		this.nombre = "";
		this.esregular = true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isDosd() {
		return esregular;
	}

	public void setDosd(boolean dosd) {
		this.esregular = dosd;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [nombre=" + nombre + ", dosd=" + esregular + "]";
	}
	
	public abstract double calcularArea();
	public abstract double calcularp();
	
	

}
