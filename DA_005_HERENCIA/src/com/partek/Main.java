package com.partek;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.clases.Coche;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Coche> listac = new ArrayList<Coche>();
		
		//constructor vacio
		Coche coche1 = new Coche();
		coche1.setMatricula("1234abc");
		coche1.setPotencia(75);
		coche1.setTieneaire(true);
		coche1.setNumpuertas(5);
		coche1.setCapacidadmaletero(200);
		
		listac.add(coche1);
		
		//constructor medio.
		Coche coche2 = new Coche(true, 3, 150);
		
		listac.add(coche2);
		
		//constructor completo
		
		Coche coche3 = new Coche("1255BGD",150, true, 5, 350);
		
		listac.add(coche3);
		
		for (Coche cochec : listac)
		{
			System.out.println(cochec);
		}

	}

}
