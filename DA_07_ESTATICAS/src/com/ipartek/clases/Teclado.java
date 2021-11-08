package com.ipartek.clases;

import java.util.Scanner;

public class Teclado {
	
	public static int oint(String mensaje)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		String read = sc.nextLine();
		
		while (read.matches("[+-]?[0-9]*") == false)
		{
			System.out.println("Valor erroneo ");
			System.out.println(mensaje);
			read = sc.nextLine();
		}
		sc.close();
		int ndevolver = Integer.parseInt(read);
		
		return ndevolver;
		
	}

}
