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

@WebServlet("/AdmProductoModificar")
public class AdmProductoModificar extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AdmProductoModificar() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
		
		//4.2 obtener todos los ivas
		List<Iva> listaIvas=db.obtenerTodosIvas(con);
		
		//4.3 obtener el producto con la id que nos han pasado
		ViewProducto prod = db.obtenerParaModificarProductoId(con,identificador);
		
		db.desconectar(con);
		
		//mochila
		request.setAttribute("listaTipos",listaTipos );
		request.setAttribute("listaIvas",listaIvas );
		request.setAttribute("datosProducto",prod );
		
		request.getRequestDispatcher("crud_productos_form_modificar.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
