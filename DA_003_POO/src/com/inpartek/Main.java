package com.inpartek;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//clase scanner
		
		Scanner sc = new Scanner(System.in);
		
		Libro libro = new Libro();
		
		System.out.println("Por favor, introduce el titulo del libro :");
		
		libro.setTitulo(sc.nextLine());
		
		System.out.println("Por favor, introduce el nombre del autor :");
		
		libro.setAutor(sc.nextLine());
		
		
		System.out.println("Por favor, introduce el isbn :");
		
		libro.setIsbn(sc.nextLine());
		
		System.out.println("Por favor, introduce si es nuevo :");
		
		//libro.setEsnuevo(sc.hasNext());
	
		
		System.out.println("Por favor, introduce el numero de paginas :");
		
		libro.setNumpaginas(Integer.parseInt(sc.nextLine()));
		
		
		System.out.println(libro);
		
		
		sc.close();
		
		

	}

}
