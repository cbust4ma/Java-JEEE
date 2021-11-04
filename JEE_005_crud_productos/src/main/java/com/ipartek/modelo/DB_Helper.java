package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.ipartek.modelo.dto.Producto;

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

	public List<Producto> obtener(Connection con)
	{
		List<Producto> listaproduc = new ArrayList<Producto>();

		try {
			String sql = "select * from "+tabla;
			Statement stmt = con.createStatement();
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				Producto product = new Producto();
				product.setId(rs.getInt(id));
				product.setNombre(rs.getString(nombre));
				product.setPrecio(rs.getString(precio));
				product.setStock(rs.getString(stock));
				listaproduc.add(product);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaproduc;
	}

	public int guardarp (Connection con, Producto pr)
	{
		int retorno = 0;
		try {
			String sql="insert into productos(nombre,precio,stock)"
					+ "values ('"+pr.getNombre()+"',"+pr.getPrecio()+","+ pr.getStock()+");";
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
