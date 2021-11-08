package com.ipartek.modelo;

import java.sql.Connection;

public interface I_Conexion {
	
	//constantes
	String DRIVER="com.mysql.jdbc.Driver";
	String BD="db_tpv";
	String USER="root";
	String PASS="admin";
	String CONEXION="jdbc:mysql://localhost:3306/"+BD+"?useSSL=false";
	
	
	//definiciones
	public Connection conectar();
	public void desconectar(Connection con);
	
	
}
