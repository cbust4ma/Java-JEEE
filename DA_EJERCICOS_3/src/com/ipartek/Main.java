package com.ipartek;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for (int i = 1; i < 11; i++)
			for (int j = 0; j < 11; j++)
				System.out.println(i+"X"+j+" = " + i*j);
		
		int n;
		
		n = 1;
		System.out.println("Introduce una opcion : \r\n"
				+ "•	1: calcular área de un triangulo\r\n"
				+ "•	2: calcular el área de un cuadrado\r\n"
				+ "•	3: calcular el área de un circulo\r\n"
				+ "•	4: calcular el área de un pentágono\r\n"
				+ "");
		while (n != 1)
		{
			System.out.println("Introduce una opcion : \r\n"
					+ "•	1: calcular área de un triangulo\r\n"
					+ "•	2: calcular el área de un cuadrado\r\n"
					+ "•	3: calcular el área de un circulo\r\n"
					+ "•	4: calcular el área de un pentágono\r\n"
					+ "");
		switch (n)
		{
		case 1:
			System.out.println("1: calcular área de un triangulo :");
			break;
		case 2:
			System.out.println("2: calcular el área de un cuadrado :");
			break;
		case 3:
			System.out.println("3: calcular el área de un circulo :");
			break;
		case 4:
			System.out.println("4: calcular el área de un pentágono :");
			break;
		default :
			System.out.println("FIN");
			break;
		}
		}

		

	}

}
