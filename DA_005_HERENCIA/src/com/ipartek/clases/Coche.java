package com.ipartek.clases;

public class Coche extends Vehiculo {
	
	private	boolean	tieneaire;
	private	int		numpuertas;
	private int		capacidadmaletero;
	
	
	public Coche(String matricula, int potencia, boolean tieneaire, int numpuertas, int capacidadmaletero) {
		super(matricula, potencia);
		this.tieneaire = tieneaire;
		this.numpuertas = numpuertas;
		this.capacidadmaletero = capacidadmaletero;
	}
	
	public Coche() {
		super();
		this.tieneaire = true;
		this.numpuertas = 4;
		this.capacidadmaletero = 0;
	}
	
	public Coche(boolean tieneaire, int numpuertas, int capacidadmaletero) {
		super();
		this.tieneaire = tieneaire;
		this.numpuertas = numpuertas;
		this.capacidadmaletero = capacidadmaletero;
	}

	public boolean getTieneaire() {
		return tieneaire;
	}

	public void setTieneaire(boolean tieneaire) {
		this.tieneaire = tieneaire;
	}

	public int getNumpuertas() {
		return numpuertas;
	}

	public void setNumpuertas(int numpuertas) {
		this.numpuertas = numpuertas;
	}

	public int getCapacidadmaletero() {
		return capacidadmaletero;
	}

	public void setCapacidadmaletero(int capacidadmaletero) {
		this.capacidadmaletero = capacidadmaletero;
	}

	@Override
	public String toString() {
		return	matricula+";"+ potencia+";"+tieneaire+";"+numpuertas+";"+capacidadmaletero;
	}
	
	
	
}
