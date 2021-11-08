package com.ipartek;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		asistenciaSanMames;
		byte	alumnosClase;
		short	numTotalProductos;
		long	numTotalCiudadanosEuropa;
		float	preciocoche;
		float	preciomoto;
		double	preciopaquetearroz;
		
		asistenciaSanMames = 12463; //4 bytes en memoria ram
		alumnosClase = 15; // 1 byte cuenta hasta 255
		numTotalProductos = 23865; // 2 bytes hasta 32000
		numTotalCiudadanosEuropa = 345098765;
		preciocoche = (float)5476.87; //chapuza, pero funciona.
		preciomoto = 21999.76f; //F final para que no de error
		preciopaquetearroz = 0.984;
		
		String	nalum; //cadena de caracteres
		char	lpiso;//no puede ser vacia.Es una letra
		
		nalum = "Alain Jafh";
		lpiso = 'c';
		
		boolean	estaencendido; //valor falso verdadero;
		boolean esazul;
		
		estaencendido = true;
		esazul = false;

	}

}
