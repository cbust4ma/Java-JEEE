package com.ipartek.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.dto.Producto;

@WebServlet("/CrearTicket")
public class CrearTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CrearTicket() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//obtener la fecha y hora
		Date fecha = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
		String currentDate = ft.format(fecha);

		System.out.println(currentDate);
		
		
		//conectar a la BD
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		//crear el ticket
		db.crearTicket(con, currentDate);
		
		//obtener el ID de ese ticket
		int identificador = db.obtenerlastid(con);
		
		//subirlo a la sesion
		HttpSession sesionweb = request.getSession();
		sesionweb.setAttribute("IdTicket", identificador);
		
		//obtener toda la lista de productos
		List<Producto> lista = db.obtenerallprod(con);
		
		//cerrar sesion
		db.desconectar(con);
		
		//mochila
		request.setAttribute("lista", lista);
		
		//redireccion
		request.getRequestDispatcher("producto.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
