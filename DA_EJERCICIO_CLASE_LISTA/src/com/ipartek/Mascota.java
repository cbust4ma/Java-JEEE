package com.ipartek;

public class Mascota {
	
	private String	nombre;
	private int		edad;
	
	public Mascota(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		
		
	}

	public Mascota() {
		super();
		this.nombre = "" ;
		this.edad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	

}
