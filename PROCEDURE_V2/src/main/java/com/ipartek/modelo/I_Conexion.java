package com.ipartek.modelo;

import java.sql.Connection;

public interface I_Conexion {
	
	 String driver="com.mysql.jdbc.Driver";
	 String user="root";
	 String pass="admin";
	 String bd = "db_productos";
	 String conexion="jdbc:mysql://localhost:3306/"+bd+"";
	 
		void desconectar(Connection con);

		public Connection conectar();
		 

}
