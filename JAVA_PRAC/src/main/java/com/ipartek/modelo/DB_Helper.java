package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.ipartek.modelo.dto.Login;

public class DB_Helper implements I_Conexion {
	
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

	public int login_u (Connection con, Login lgin)
	{
		int retorno = 0;
		try {
			
			String sql="insert ignore into login(users, passwords)"
					+ "values ('"+lgin.getUsers()+"','"+lgin.getPassword()+"');";
			Statement stmt = con.createStatement();
			System.out.println(sql);
			retorno = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
		return retorno;
	}
	
	public List<Login> obtenerlogin(Connection con)
	{
		List<Login> login = new ArrayList<Login>();

		try {
			String sql = "Select * from "+tabla;
			Statement stmt = con.createStatement();
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				Login select = new Login();
				
				select.setId(rs.getInt("id"));
				select.setUsers(rs.getString("users"));
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
