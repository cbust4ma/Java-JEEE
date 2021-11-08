package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Libro;

public class DB_Helper implements I_conexion {

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

	public List<Libro> obtenerTodosLibros(Connection con)
	{
		List<Libro> listalibros = new ArrayList<Libro>();

		try {
			String sql = "Select * from "+TABLA_LIBROS;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				listalibros.add(libro);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listalibros;
	}

}
