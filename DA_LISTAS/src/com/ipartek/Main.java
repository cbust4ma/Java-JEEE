package com.ipartek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	i;
		int	t;
		
		i = 0;
		
		Scanner sc = new Scanner (System.in);
		
		List<Temp> lista = new ArrayList<Temp>();
		
		System.out.println("Introducir 8 temperaturas diferentes :");

		while (i < 8 )
		{
			Temp temp = new Temp();
			
			System.out.println("Introduce la  temperatura numero " + i +" :");
			t = Integer.parseInt(sc.nextLine());
			
			if (t >= -90 && t <= 75)
			{
				temp.setTemp(t);
				lista.add(temp);
				
			}
			else
			{
				i--;
				while ((!(t >= -90 && t <= 75)))
				{
					
					System.out.println("Error Numero No Admitido. Introduce otro :");
					t = Integer.parseInt(sc.nextLine());
					
				}
			}
			
			i++;
		}
		
		sc.close();
		
		
		int max = 100;
		int min = -100;
		
		Collections.sort(temp);
		for (Temp temp : lista)
		{
			if (temp.getTemp() >  max)
			{
				
			}
		}
	
	

	}

}
