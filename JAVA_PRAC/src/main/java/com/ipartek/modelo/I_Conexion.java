package com.ipartek.modelo;

import java.sql.Connection;

public interface I_Conexion {
	
	//constantes
	 
	 String driver="com.mysql.jdbc.Driver";
	 String user="root";
	 String pass="admin";
	 String bd = "db_login";
	 String conexion="jdbc:mysql://localhost:3306/"+bd+"";

	 
	 //datos dto 
	 String tabla = "login";
	 String users = "users";
	 String passwords = "passwords";
	 String users2 = "users";
	 String passwords2 = "passwords";
	 //definiciones
	void desconectar(Connection con);

	public Connection conectar();

}
