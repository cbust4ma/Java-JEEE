package com.ipartek;

public class Temp  {
	
	private int	temp;

	public Temp(int temp) {
		super();
		this.temp = temp;
	}
	
	public Temp() {
		super();
		this.temp = 0;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Temp [temp=" + temp + "]";
	}
	
	

}
