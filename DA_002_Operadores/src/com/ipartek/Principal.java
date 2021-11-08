package com.ipartek;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int resultado;
		double resultado2;

		num1 = 35;
		num2 = 9;
		resultado = num1 + num2;
		System.out.println("esto es una suma:" + resultado);
		resultado = num1 - num2;
		System.out.println("esto es una resta:" + resultado);
		resultado = num1 * num2;
		System.out.println("esto es una multiplicacion:" + resultado);
		resultado2 = (double) num1 / num2;
		System.out.println("Esto es una division:" + resultado2);
		resultado2 = (double) num1 % (double) num2;
		System.out.println("Esto es el modulo de la division:" + resultado2);

		///////////////////////////////////////////////////////
		double d1;
		double d2;
		double d3;
		double d4;
		double r1;
		double r2;

		d1 = 3;
		d2 = 2;
		d3 = 6;
		d4 = 4;

		r1 = d1 / d2;
		r2 = d3 / d4 + 1;

		if (r1 == r2)
			System.out.println("r1 = " + r1 + " es igual a " + "r2 = " + r2);
		else if (r1 > r2)
			System.out.println("r1 es mayor que r2");
		else if (r1 < r2)
			System.out.println("R2 es mayor que r1");
		else
			System.out.println("No son iguales.");
		
		////////////////////////////////////////////////////////////////
		
		boolean	estado;
		boolean	estado2;
		boolean resultado3;
		
		estado = (true && true);
		estado2 = (true || false);
		resultado3 = true && false || true;
		
		//////////////////////////////////////////////////////////////////
		int	numeroDado;
		
		numeroDado = 9;
		switch (numeroDado)
		{
		case 1:
			System.out.println("Ha salido el numero 1");
			System.out.println("Que No Pare");
			break;
		case 2:
			System.out.println("Ha Salido El Dos");
			System.out.println("Nos Movemos Los Dos");
			break;
		case 3:
			System.out.println("Ha Salido El Tres");
			System.out.println("Lo Mismo Pero Del Reves");
			break;
		case 4:
			System.out.println("Ha salido el numero 4");
			System.out.println("Me Voy A La Farra Un Rato");
			break;
		case 5:
			System.out.println("Ha Salido El 5");
			System.out.println("Pego Un Brinco");
			break;
		case 6:
			System.out.println("Ha Salido El 6");
			System.out.println("Ahora No Me Veis");
			break;
		default:
			System.out.println("No Es Valido");
			System.out.println("Repite");
			break;
		}
	}

}
