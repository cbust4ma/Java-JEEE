package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.ipartek.modelo.dto.Grupo;

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

	public int guardarg (Connection con, Grupo gr)
	{
		int retorno = 0;
		try {
			String sql="insert into grupos(nombre,ndiscos,nintegrantes)"
					+ "values ('"+gr.getNombre()+"',"+gr.getNdiscos()+","+ gr.getNintegrantes()+");";
			Statement stmt = con.createStatement();
			System.out.println(sql);
			retorno = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
		return retorno;
	}

}
