package com.ipartek.modelo;

import java.sql.Connection;

public interface I_Conexion {
	
	//constantes
	 String driver="com.mysql.jdbc.Driver";
	 String user="root";
	 String pass="admin";
	 String bd = "db_login";
	 String conexion="jdbc:mysql://localhost:3306/"+bd+"";
	
	String tabla = "login";

	
	//definiciones
	public Connection conectar();
	public void desconectar(Connection con);
	
	
}
