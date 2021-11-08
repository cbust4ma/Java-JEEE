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

@WebServlet("/Admin_inicio_Admin")
public class Admin_inicio_Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Admin_inicio_Admin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 3,4 y 5

		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();

		// 4,1 obetner datos
		List<Tipo> listaTipos = db.obtenerTodosTipos(con);

		// 4,2
		List<Iva> listaiva = db.obtenerTodosIvas(con);
		
		//4.3
		List<ViewProducto> listaViewProducto=db.obtenerTodosViewProducto(con);
		

		db.desconectar(con);

		// mochila

		request.setAttribute("listaTipos", listaTipos);
		request.setAttribute("listaiva", listaiva);
		request.setAttribute("listaViewProductos",listaViewProducto );
		// redirigir
		request.getRequestDispatcher("crud_productos.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
