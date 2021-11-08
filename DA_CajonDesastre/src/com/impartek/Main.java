package com.impartek;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	numero;
		
		Random r1 = new Random();
		numero = r1.nextInt(13) + 1;
		while (numero != 13)
			System.out.println("NO es un trece, es :" + numero++);

	}

}
