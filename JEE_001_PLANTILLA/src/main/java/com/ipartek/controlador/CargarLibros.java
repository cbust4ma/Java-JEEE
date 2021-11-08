package com.ipartek.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.dto.Libro;


@WebServlet("/CargarLibros")
public class CargarLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CargarLibros() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		//4 hacer cosas
		
		List<Libro> listalibros = db.obtenerTodosLibros(con);
		
		System.out.println("Tamaño: "+listalibros.size());
		
		// 5 desconectar
		
		db.desconectar(con);
		
		//6 Preparar informacion a enviar
		
		request.setAttribute("lista", listalibros);
		
		//7 redirigir vista
		
		request.getRequestDispatcher("mostrar.jsp").forward(request,response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
