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



@WebServlet("/ModificarTipoFinal")
public class ModificarTipoFinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ModificarTipoFinal() {
        super();
    
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//
		//hacer que si cambiamos algo, lo modifique en la BD
		//
		
		//1
		int ident=0;
		if(request.getParameter("id")!=null)
		{
			ident=Integer.parseInt(request.getParameter("id"));
		}

		String tipo="";
		if(request.getParameter("nombre")!=null)
		{
			tipo=request.getParameter("nombre");
		}
	
		
	
		
	
		
		//2
	
		Tipo tip = new Tipo(ident,tipo);
	
		//3, 4 y 5
		DB_Helper db= new DB_Helper();
		Connection con= db.conectar();
	
		//operaciones
		//4.0 modificar
		List<Tipo> listaTipos = db.modificarTipo(con, ident, tip);
		
		//4.1 obtener todos los tipos
		List<Tipo> listaTip=db.obtenerTodosTipos(con);

	
		db.desconectar(con);
		
		
		//6 mochila
		request.setAttribute("listaTipos",listaTipos );
		request.setAttribute("listaTip",listaTip );
		request.getRequestDispatcher("tipos.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
