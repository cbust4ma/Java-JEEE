package com.ipartek.controlador;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.dto.Producto;


@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Insert() {
        super();
    
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1 obtener los datos
		
		String nombre = "";
		if (request.getParameter("nombre") != null)
		{
			nombre = request.getParameter("nombre");
		}
		
		String precio = "";
		
		if (request.getParameter("precio") != null)
		{
			precio = request.getParameter("precio");
			
		}
		
		String stock = "";
		
		if (request.getParameter("sotck") != null)
		{
			stock = request.getParameter("stock");
			
		}

		
		
		//2 maquetarlos en dto
		Producto producto = new Producto(0, nombre, precio, stock);
		System.out.println(producto);
		//3 conectar a la base de datos.
		
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		//4 Guardar y recoger respuesta en la base de datos.
		
		int elementpr = db.guardarp(con, producto);
		System.out.println(elementpr);
		
		//5 cerrar la conexion  a la bd
		db.desconectar(con);
		//6 preparar la vista. mochila
		
		request.setAttribute("resultado", elementpr);
		
		//6.1 redirigir
		request.getRequestDispatcher("insert.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
