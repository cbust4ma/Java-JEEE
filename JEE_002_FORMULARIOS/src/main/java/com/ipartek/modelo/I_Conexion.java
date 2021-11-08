package com.ipartek.modelo;

import java.sql.Connection;

public interface I_Conexion {
	
	//constantes
	 
	 String driver="com.mysql.jdbc.Driver";
	 String user="root";
	 String pass="admin";
	 String bd = "db_grupos";
	 String conexion="jdbc:mysql://localhost:3306/"+bd+"";

	 
	 //datos dto 
	 
	 String TABLA_LIBROS = "libros";
	 String LIBROS_ID = "id";
	 String LIBROS_TITULO = "titulo";
	 //definiciones
	void desconectar(Connection con);

	public Connection conectar();
}
