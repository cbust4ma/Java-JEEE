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

/**
 * Servlet implementation class AdmProductoBorrar
 */
@WebServlet("/AdmProductoBorrar")
public class AdmProductoBorrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdmProductoBorrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int identificador = 0;
		if(request.getParameter("id") != null)
		{
			identificador = Integer.parseInt(request.getParameter("id"));
		}
		//3 ,4 y 5
		
				DB_Helper db = new DB_Helper();
				Connection con = db.conectar();
				
				boolean resultado = db.Borrar(con,identificador);

				// 4,1 obetner datos
				List<Tipo> listaTipos = db.obtenerTodosTipos(con);

				// 4,2
				List<Iva> listaiva = db.obtenerTodosIvas(con);
				
				//4.3
				List<ViewProducto> listaViewProducto=db.obtenerTodosViewProducto(con);
				List<Producto> produ = db.obtener(con);

				db.desconectar(con);

				// mochila
				request.setAttribute("produ", produ);

				request.setAttribute("listaTipos", listaTipos);
				request.setAttribute("listaiva", listaiva);
				request.setAttribute("listaViewProductos",listaViewProducto );
				// redirigir
				request.getRequestDispatcher("crud_productos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
