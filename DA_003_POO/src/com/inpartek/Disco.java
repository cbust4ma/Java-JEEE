package com.inpartek;

public class Disco {
	
	private	String	titulo;
	private	int		numcanciones;
	private String	grupo;
	
	public	Disco(String titulo, int numcanciones, String grupo)
	{
		this.titulo = titulo;
		this.numcanciones = numcanciones;
		this.grupo = grupo;
	}
	
	public	Disco()
	{
		this.titulo = "";
		this.numcanciones = 0;
		this.grupo ="";
	}
	
	public	String gettitulo()
	{
		return titulo;
	}
	
	public void settitulo(String titulo)
	{
		this.titulo = titulo;
	}
	
	public	int getnumcanciones()
	{
		return numcanciones;
	}
	
	public void setnumcaciones(int numcanciones)
	{
		this.numcanciones = numcanciones;
	}
	
	public	String getgrupo()
	{
		return grupo;
	}
	
	public void setgrupo(String grupo)
	{
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Disco [titulo=" + titulo + ", numcanciones=" + numcanciones + ", grupo=" + grupo + "]";
	}
	
}
