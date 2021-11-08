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


@WebServlet("/AdmProductoModificarFinal")
public class AdmProductoModificarFinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AdmProductoModificarFinal() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//
		//hacer que si cambiamos algo, lo modifique en la BD
		//
		
		//1
		int id=0;
		if(request.getParameter("id")!=null)
		{
			id=Integer.parseInt(request.getParameter("id"));
		}

		String nombre="";
		if(request.getParameter("nombre")!=null)
		{
			nombre=request.getParameter("nombre");
		}
		
		double precio=0;
		if(request.getParameter("precio")!=null)
		{
			precio=Double.parseDouble(request.getParameter("precio"));
		}
		
		String descripcion="";
		if(request.getParameter("descripcion")!=null)
		{
			descripcion=request.getParameter("descripcion");
		}
		
		int tipo=0;
		if(request.getParameter("tipo")!=null)
		{
			tipo=Integer.parseInt(request.getParameter("tipo"));
		}
		
		int iva=0;
		if(request.getParameter("iva")!=null)
		{
			iva=Integer.parseInt(request.getParameter("iva"));
		}
		
		//2
		Producto prod= new Producto(id, nombre, precio, descripcion, tipo, iva);
		
	
		//3, 4 y 5
		DB_Helper db= new DB_Helper();
		Connection con= db.conectar();
	
		//operaciones
		//4.0 modificar
		boolean resultado= db.modificarProducto(con,prod );
		
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
		
		request.getRequestDispatcher("crud_productos.jsp").forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
