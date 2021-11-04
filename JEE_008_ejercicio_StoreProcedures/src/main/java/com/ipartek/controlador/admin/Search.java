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


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String nombre;
		
		nombre ="";
		if(request.getParameter("nombre")!=null)
		{
			nombre= request.getParameter("nombre");
		}
		
		DB_Helper db= new DB_Helper();
		Connection con= db.conectar();

		//do things
		
		List<Tipo> lista = db.buscarTipo(con,nombre);
		
		db.desconectar(con);
		
		request.setAttribute("listaTipos",lista);
		request.getRequestDispatcher("tipos.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
