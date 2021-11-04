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
import com.ipartek.modelo.dto.Iva;
import com.ipartek.modelo.dto.Tipo;
import com.ipartek.modelo.dto.ViewProducto;

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int identificador=0;
		if(request.getParameter("id")!=null)
		{
			identificador=Integer.parseInt(request.getParameter("id"));
		}
		
		DB_Helper db= new DB_Helper();
		Connection con= db.conectar();
		
		//operaciones... pensar..pensarlo bien
		//operaciones
		//4.1 obtener todos los tipos
		List<Tipo> listaTipos=db.obtenerTodosTipos(con);
		
		List<Tipo> listaTipos = db.Mod
	
		
		
		db.desconectar(con);
		
		//mochila
		request.setAttribute("listaTipos",listaTipos );
		
		
		
		request.getRequestDispatcher("crud_productos_form_modificar.jsp").forward(request, response);
	}

}
