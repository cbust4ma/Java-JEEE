package com.ipartek.clases;

public class Moto extends Vehiculo{
	
	private boolean estrial;
	private	boolean	tienemarchas;
	
	
	public Moto(String matricula, int potencia, boolean estrial, boolean tienemarchas) {
		super(matricula, potencia);
		this.estrial = estrial;
		this.tienemarchas = tienemarchas;
	}
	
	public Moto() {
		super();
		this.estrial = false;
		this.tienemarchas = false;
	}
	
	public Moto(boolean estrial, boolean tienemarchas) {
		super();
		this.estrial = estrial;
		this.tienemarchas = tienemarchas;
	}

	public boolean isEstrial() {
		return estrial;
	}

	public void setEstrial(boolean estrial) {
		this.estrial = estrial;
	}

	public boolean isTienemarchas() {
		return tienemarchas;
	}

	public void setTienemarchas(boolean tienemarchas) {
		this.tienemarchas = tienemarchas;
	}

	@Override
	public String toString() {
		return matricula+";"+potencia+";"+estrial+";"+tienemarchas;
	}
	
	
	
	
	
	

}
