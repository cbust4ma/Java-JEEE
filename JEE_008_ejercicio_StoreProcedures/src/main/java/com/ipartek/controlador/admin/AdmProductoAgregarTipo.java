package com.ipartek.controlador.admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.DB_Helper;

import com.ipartek.modelo.dto.Tipo;



@WebServlet("/AdmProductoAgregarTipo")
public class AdmProductoAgregarTipo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AdmProductoAgregarTipo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1
		String nombre ="";
		if (request.getParameter("nombre") != null)
		{
			nombre = request.getParameter("nombre");
		}
		

		
		
	
		
		//2
		Tipo tip = new Tipo(0,nombre);
		
		//3 ,4 y 5
		
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		boolean agregado =db.insertarTipoNuevo(con, tip);

		// 4,1 obetner datos


		db.desconectar(con);


		request.setAttribute("agregado", agregado);
		// redirigir
		request.getRequestDispatcher("Stipos").forward(request, response);
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
