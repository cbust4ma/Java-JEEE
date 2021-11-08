package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_Helper implements I_Conexion{
	

	@Override
	public Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(conexion, user, pass);
			System.out.println("Estoy dentro");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encontro el jar");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se pudo conectar");
		}

		return con;

	}

	@Override
	public void desconectar(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Se ha desconectado");
		}
	}
	

	 public static void select(String[] args) {
		
		 
		 try (
				 Connection con = DriverManager.getConnection(conexion, user, pass);
				 Statement stmt = con.createStatement();
				 
				 
				 
			)
		 {
			 
			 String queryD = "Drop procedure if exists select_p";
			 String QueryCreate = "Create procedure select_p (IN id int, nombre varchar, precio varchar, stock varchar) ";
	            QueryCreate += "BEGIN ";
	            QueryCreate += "select * from producto ";
	            QueryCreate += "END";

	            stmt.execute(queryD);
	 
	          
	            stmt.execute(QueryCreate);
	 
	            stmt.close();
	 
	            System.out.println("Ondo!");
	 
	        } catch (SQLException ex) {
	            ex.printStackTrace();
			 
		 }
		 
		 
	 }
	

	

}
