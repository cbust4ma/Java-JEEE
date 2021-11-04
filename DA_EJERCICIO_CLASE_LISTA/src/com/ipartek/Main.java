package com.ipartek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean yn = true;
		String pregunta;
		
		pregunta = "yes";
		Scanner sc = new Scanner(System.in);
		List<Mascota> lista = new ArrayList<Mascota>();

		System.out.println("Mete el nombre y la edad de una mascota");
		while (yn) {
			
			Mascota mascotas = new Mascota();

			if ((pregunta.equals("yes"))) {
				System.out.println("Introduce el nombre de la mascota :");
				
				mascotas.setNombre(sc.nextLine());

				System.out.println("Introduce la edad de la mascota :");
				
				mascotas.setEdad(Integer.parseInt(sc.nextLine()));
				lista.add(mascotas);
				

				System.out.println("Quieres seguir miendo mascotas? yes or no");
				pregunta = sc.nextLine().toLowerCase();

			} else if (pregunta.equals("no")) {
				System.out.println("Agur");
				yn = false;
			} else {
				while (!(pregunta.equals("yes") || pregunta.equals("no"))) {
					System.out.println("Solo se admite yes or no :");
					pregunta = sc.nextLine().toLowerCase();
				}
			}
		}
		sc.close();
		for (Mascota mascotas : lista) {
			System.out.println(mascotas);
		}
		
	}

}
