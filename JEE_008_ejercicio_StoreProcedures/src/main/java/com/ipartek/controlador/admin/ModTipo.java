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


/**
 * Servlet implementation class ModTipo
 */
@WebServlet("/ModTipo")
public class ModTipo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModTipo() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ident=0;
		if(request.getParameter("id")!=null)
		{
			ident=Integer.parseInt(request.getParameter("id"));
		}
		
		DB_Helper db= new DB_Helper();
		Connection con= db.conectar();
		
		//operaciones... pensar..pensarlo bien
		//operaciones
		
		//4.1 obtener todos los tipos
		
		
		Tipo tip = db.obteneIdTipo(con, ident);
		
		
		db.desconectar(con);
		
		//mochila
		request.setAttribute("datosLista",tip );
		
		
		
		request.getRequestDispatcher("modificartipo.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		
	}

}
