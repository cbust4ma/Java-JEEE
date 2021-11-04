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
 * Servlet implementation class BorrarTipo
 */
@WebServlet("/BorrarTipo")
public class BorrarTipo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrarTipo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 recibir datos
		int ident=0;
		if(request.getParameter("id")!=null)
		{
			ident=Integer.parseInt(request.getParameter("id"));
		}

		DB_Helper db= new DB_Helper();
		Connection con = db.conectar();
		
		//DO THINGS
		boolean borrado=db.BorrarTipo(con, ident);
		
		//4.1 obtener todos los tipos
		List<Tipo> listaTipos=db.obtenerTodosTipos(con);
		
	
		db.desconectar(con);
		
		//6 mochila
		request.setAttribute("listaTipos",listaTipos );
		
		//7 redirigir
		request.getRequestDispatcher("tipos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
