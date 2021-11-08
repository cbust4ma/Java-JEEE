package com.ipartek;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	i;
		Comic[] array = new Comic[3];
		
		i = 0;
		Scanner sc = new Scanner(System.in);
		
		while (i < 3)
		{
			Comic comic = new Comic();
			System.out.println("Introduce el titulo :");
			comic.setTitulo(sc.nextLine());
			System.out.println("Introduce el precio :");
			comic.setPrecio(Double.parseDouble(sc.nextLine()));
			System.out.println("Introduce Editorial :");
			comic.setEditorial(sc.nextLine());
			array[i] = comic;
			i++;
		}
		i = 0;
		while (i < 3)
		{
			System.out.println(array[i]);
			i++;
		}
		
		
		sc.close();

	}

}
