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


@WebServlet("/Adm_Inicio_Admin")
public class Adm_Inicio_Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Adm_Inicio_Admin() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		
		
		//3, 4 y 5
		DB_Helper db= new DB_Helper();
		Connection con= db.conectar();
		
		//operaciones
			//4.1 obtener todos los tipos
			List<Tipo> listaTipos=db.obtenerTodosTipos(con);
			
			//4.2 obtener todos los ivas
			List<Iva> listaIvas=db.obtenerTodosIvas(con);
			
			//4.3 obtener todos los productos de la vista
			List<ViewProducto> listaViewProducto=db.obtenerTodosViewProducto(con);
			
		db.desconectar(con);
		
		//6 mochila
		request.setAttribute("listaTipos",listaTipos );
		request.setAttribute("listaIvas",listaIvas );
		request.setAttribute("listaViewProductos",listaViewProducto );
		
		//7 redirigir
		request.getRequestDispatcher("crud_productos.jsp").forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
