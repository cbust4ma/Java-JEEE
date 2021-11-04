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
import com.ipartek.modelo.dto.Usuario;


@WebServlet("/IniciarWeb")
public class IniciarWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public IniciarWeb() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//3 conectar
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		//4 operar
		
		List<Usuario> listlogin = db.obtenerlogin(con);
		System.out.println("Tamaño: "+listlogin.size());
		//5 desconectar
		db.desconectar(con);
		
		//6 mochila
		request.setAttribute("lista", listlogin);
		//redirigir
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
