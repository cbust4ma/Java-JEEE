package com.ipartek.clases;

public class Vehiculo {
	
	protected String	matricula;
	protected	int		potencia;
	
	public Vehiculo(String matricula, int potencia) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
	}
	
	public Vehiculo() {
		super();
		this.matricula = "";
		this.potencia = 0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "vehiculo [matricula=" + matricula + ", potencia=" + potencia + "]";
	}
	
	
	

}
