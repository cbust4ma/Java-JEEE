package com.ipartek.ej1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	a;
		int	b;
		int	c;
		int	d;
		int	e;
		
		a = 6;
		b = 8;
		c = 0;
		d = 8;
		e = 9;
		System.out.println("Pregunta 1");
		if (a > c)
		{
			System.out.println("La variable a:" + a + " Es mayor que c:" + c);
		}
		else if (a < c)
		{
			System.out.println("La variable c:" + c + " Es Mayor que a:" + a);
		}
		System.out.println("Pregunta 2");
		
		int[]	arrayN = {a,b,c,d,e};
		int	mayor;
		int	menor;
		
		mayor = 0;
		menor = 0;
		for (int i = 0; i < 5 ; i++)
		{
			if (arrayN[i] > mayor)
				mayor = arrayN[i];
			if (arrayN[i] < menor)
				menor = arrayN[i];
		}
		System.out.println("EL numero mayor es :" + mayor);
		System.out.println(" El menor es : " + menor);
		
		
		System.out.println("Pregunta 3");
		if (b == d)
			System.out.println("b :" + b + " Es igual d : " + d );
		else
			System.out.println("No Son Iguales.");
		
		System.out.println("Pregunta 4");
		if (c == 0)
			System.out.println("Operacion no valida");
		else
			System.out.println(a/c);
	

	}

}
