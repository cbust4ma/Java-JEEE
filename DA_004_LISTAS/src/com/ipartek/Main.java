package com.ipartek;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Producto>	listc = new ArrayList<Producto>();
		
		Producto pro = new Producto("patatas", 1.22);
		listc.add(pro);
		
		Producto pro1 = new Producto("cebollas", 3.22);
		listc.add(pro1);
		
		Producto pro2 = new Producto("aceite", 2.55);
		listc.add(pro2);
		
		Producto pro3 = new Producto("sal", 5.42);
		listc.add(pro3);
		
		for (Producto producto:listc)
		{
			System.out.println(producto);
		}
			
		

	}

}
