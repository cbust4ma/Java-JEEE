package com.ipartek.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AgregarProdAlTicket")
public class AgregarProdAlTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AgregarProdAlTicket() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//obtener el id del ticket de la sesion
		
		//controlar errores de sesion
		
		//obtener la cantidad de producto
		
		//obtener el id del producto
		
		//maquetar el DTO adecuado
		
		//conectar a la BD
		
		//operar con la BD
			//varias operaciones
		
		//cerrar conexion
		
		//mochila
		
		//redireccion

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
