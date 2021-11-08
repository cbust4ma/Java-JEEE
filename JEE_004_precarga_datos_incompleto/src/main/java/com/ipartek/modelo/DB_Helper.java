package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Usuario;



public class DB_Helper implements I_Conexion{
	
	
	@Override
	public Connection conectar() {
		Connection con=null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(conexion,user,pass);
			System.out.println("Conexion OK");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL JAR");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO CONECTAR");
		}
		return con;	
	}

	@Override
	public void desconectar(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
		
	}
	
	
	public List<Usuario> obtenerlogin(Connection con)
	{
		List<Usuario> login = new ArrayList<Usuario>();

		try {
			String sql = "select * from login;";
			Statement stmt = con.createStatement();
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				Usuario select = new Usuario();
				
				select.setId(rs.getInt("id"));
				select.setUsuario(rs.getString("users"));
				select.setPassword(rs.getString("passwords"));
				login.add(select);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return login;
	}

	
}
