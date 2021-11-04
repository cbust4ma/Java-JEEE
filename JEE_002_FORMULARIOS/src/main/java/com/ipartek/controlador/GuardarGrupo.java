package com.ipartek.controlador;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.dto.Grupo;


@WebServlet("/GuardarGrupo")
public class GuardarGrupo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GuardarGrupo() {
        super();
 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1 obtener los datos
		
		String nombre = "";
		if (request.getParameter("nombre") != null)
		{
			nombre = request.getParameter("nombre");
		}
		
		String ndiscos = "";
		int ndiscosn = 0;
		if (request.getParameter("ndiscos") != null)
		{
			ndiscos = request.getParameter("ndiscos");
			ndiscosn = Integer.parseInt(ndiscos);
		}
		
		String nintegrantes = "";
		int nintegrantesn = 0;
		if (request.getParameter("nintegrantes") != null)
		{
			nintegrantes = request.getParameter("nintegrantes");
			nintegrantesn = Integer.parseInt(nintegrantes);
		}
		
		//2 maquetarlos en dto
		Grupo grupo = new Grupo(0, nombre, ndiscosn, nintegrantesn);
		System.out.println(grupo);
		//3 conectar a la base de datos.
		
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		//4 Guardar y recoger respuesta en la base de datos.
		
		int nelementosg = db.guardarg(con, grupo);
		System.out.println(nelementosg);
		
		//5 cerrar la conexion  a la bd
		db.desconectar(con);
		//6 preparar la vista. mochila
		
		request.setAttribute("resultado", nelementosg);
		
		//6.1 redirigir
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
