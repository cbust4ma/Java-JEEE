package com.ipartek.controlador;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.DB_Helper;

import com.ipartek.modelo.dto.Login;

/**
 * Servlet implementation class Save
 */
@WebServlet("/Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Save() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		//1 obtener los datos
		
		String users = "";
		if (request.getParameter("users") != null)
		{
			users = request.getParameter("users");
		}
		
		String passwords = "";
		
		if (request.getParameter("passwords") != null)
		{
			passwords = request.getParameter("passwords");
			
		}
		
		
		//2 maquetarlos en dto
		Login login = new Login(0, users, passwords);
		System.out.println(login);
		//3 conectar a la base de datos.
		
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		//4 Guardar y recoger respuesta en la base de datos.
		
	
		
		
		int info = db.login_u(con, login);
		System.out.println(info);
		
		//5 cerrar la conexion  a la bd
		db.desconectar(con);
		//6 preparar la vista. mochila
		
		
		
		request.setAttribute("resultado", info);
		
		
		//6.1 redirigir
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
