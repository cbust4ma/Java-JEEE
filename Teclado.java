package com.ipartek.auxiliar;

import java.util.Scanner;

public class Teclado {

	private static Scanner sc = new Scanner(System.in);

	private static final String RX_NUMERO_ENTERO = "[+-]?[0-9]*";
	private static final String RX_NUMERO_ENTERO_POS = "[+]?[0-9]*";
	private static final String RX_NUMERO_ENTERO_NEG = "[-][0-9]*";

	public static int pedirNumeroEntero(String msg) {

		// pedir numero
		System.out.println(msg);
		String textoParaValidar = sc.nextLine().trim();

		// validar que solo tenga caracteres numericos
		boolean correcto = textoParaValidar.matches(RX_NUMERO_ENTERO);

		// mientras no sea un numero entero, volver a pedir
		while (correcto == false) {
			System.out.println("el dato es erroneo");
			System.out.println(msg + ", otra vez...");

			textoParaValidar = sc.nextLine();
			correcto = textoParaValidar.matches(RX_NUMERO_ENTERO);
		}

		if (!textoParaValidar.isEmpty()) {
			return Integer.parseInt(textoParaValidar);
		} else {
			return 0;
		}
	}

	public static int pedirNumeroEnteroPosivito(String msg) {
		// pedir numero
		System.out.println(msg);
		String textoParaValidar = sc.nextLine().trim();

		// validar que solo tenga caracteres numericos
		boolean correcto = textoParaValidar.matches(RX_NUMERO_ENTERO_POS);

		// mientras no sea un numero entero, volver a pedir
		while (correcto == false) {
			System.out.println("el dato es erroneo");
			System.out.println(msg + ", otra vez...");

			textoParaValidar = sc.nextLine();
			correcto = textoParaValidar.matches(RX_NUMERO_ENTERO_POS);
		}
		return Integer.parseInt(textoParaValidar);
	}

	public static int pedirNumeroEnteroNegativo(String msg) {
		// pedir numero
		System.out.println(msg);
		String textoParaValidar = sc.nextLine().trim();

		// validar que solo tenga caracteres numericos
		boolean correcto = textoParaValidar.matches(RX_NUMERO_ENTERO_NEG);

		// mientras no sea un numero entero, volver a pedir
		while (correcto == false) {
			System.out.println("el dato es erroneo");
			System.out.println(msg + ", otra vez...");

			textoParaValidar = sc.nextLine();
			correcto = textoParaValidar.matches(RX_NUMERO_ENTERO_NEG);
		}
		return Integer.parseInt(textoParaValidar);
	}

	public static int pedirNumeroEnteroAcotado(String msg, int base, int tope) {
		int numero = 0;

		// pedir numero
		System.out.println(msg);
		String textoParaValidar = sc.nextLine().trim();

		boolean correcto = textoParaValidar.matches(RX_NUMERO_ENTERO);
		while (correcto == false) {

			System.out.println("el dato es erroneo");
			System.out.println(msg + ", otra vez...");

			textoParaValidar = sc.nextLine();
			correcto = textoParaValidar.matches(RX_NUMERO_ENTERO);

		}

		if (!textoParaValidar.isEmpty()) {
			numero = Integer.parseInt(textoParaValidar);
		}

		if (numero > tope || numero < base) {
			numero = pedirNumeroEnteroAcotado(msg, base, tope);
		}

		return numero;

	}

	public static int pedirNumeroEnteroRegex(String msg, String regex) {
		String leido = "";
		do {
			System.out.println(msg);
			leido = sc.nextLine();
		} while (leido.matches(regex) == false);
		return Integer.parseInt(leido);
	}

	public static String pedirTexto(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	public static double pedirNumeroReal(String msg) {
		String leido = "";
		String regex="^[0-9]+([.][0-9]+)?$";
		do {
			System.out.println(msg);
			leido = sc.nextLine();
		} while (leido.matches(regex) == false);
		return Double.parseDouble(leido);
	}

}
