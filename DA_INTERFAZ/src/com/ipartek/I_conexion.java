package com.ipartek;

import java.sql.Connection;

public interface I_conexion {
	
	//definicion de constantes
	public static final String TABLA_USUARIO ="usuarios";
	public static final String USUARIO_NOMBRE = "nombre";
	public static final String USUARIO_PASSWD = "passwd";
	
	
	
	
	
	
	
	//definicion de funciones
	public Connection conectar();
	
	public void desconectar(Connection con);

}
