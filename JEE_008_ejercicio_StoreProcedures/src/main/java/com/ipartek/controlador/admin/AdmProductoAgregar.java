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
import com.ipartek.modelo.dto.Producto;
import com.ipartek.modelo.dto.Tipo;
import com.ipartek.modelo.dto.ViewProducto;


@WebServlet("/AdmProductoAgregar")
public class AdmProductoAgregar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AdmProductoAgregar() {
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
		
		
		double precio = 0;
		if (request.getParameter("precio") != null)
		{
			precio = Double.parseDouble(request.getParameter("precio"));
		}
		String descripcion ="";
		if (request.getParameter("descripcion") != null)
		{
			descripcion = request.getParameter("descripcion");
		}
		
		int tipo = 0;
		
		if (request.getParameter("tipo") != null)
		{
			tipo = Integer.parseInt(request.getParameter("tipo"));
		}
		
		int iva = 0;
		if (request.getParameter("iva") != null)
		{
			iva = Integer.parseInt(request.getParameter("iva"));
		}
		
		//2
		Producto prod = new Producto(0,nombre, precio, descripcion, tipo, iva );
		
		//3 ,4 y 5
		
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		boolean agregado =db.insertarProductoNuevo(con,prod);

		// 4,1 obetner datos


		db.desconectar(con);


		request.setAttribute("agregado", agregado);
		// redirigir
		request.getRequestDispatcher("Admin_inicio_Admin").forward(request, response);
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
