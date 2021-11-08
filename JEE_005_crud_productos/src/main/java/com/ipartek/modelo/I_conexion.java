package com.ipartek.modelo;

import java.sql.Connection;

public interface I_conexion {

	
	//constantes
	 
	 String driver="com.mysql.jdbc.Driver";
	 String user="root";
	 String pass="admin";
	 String bd = "db_productos";
	 String conexion="jdbc:mysql://localhost:3306/"+bd+"";
	 
	 
	 //datos dto 
	 
	 String tabla = "producto";
	 String id = "id";
	 String nombre = "nombre";
	 String precio = "precio";
	 String stock = "stock";
	 //definiciones
	
	public Connection conectar();
	public void desconectar(Connection con);

	
	 
}
