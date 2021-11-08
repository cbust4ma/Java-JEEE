package com.ipartek.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Producto;


public class DB_Helper implements I_Conexion{
	
	
	@Override
	public Connection conectar() {
		Connection con=null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION,USER,PASS);
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
	
	public void crearTicket(Connection con, String strFechav)
	{
		try {
			String sql = "call pa_crear_ticket(?)";
			CallableStatement cStmt = con.prepareCall(sql);
			cStmt.setString(1, strFechav);
			cStmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se creo el ticket");
		}

		System.out.println("Se creo el ticket sin problemas");
	}
	public int obtenerlastid(Connection con)
	{
		int lastid = 0;
		try {
			String sql = "call pa_obtener_lastid(?)";
			CallableStatement cStmt = con.prepareCall(sql);
			ResultSet rs = cStmt.executeQuery();
			
			while (rs.next())
			{
				rs.getInt("id");
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se pudo obtener el ultimo id");
			return 0;
		}

		System.out.println("ultimo iid obtenido");
		return lastid;
	}
	
	public List<Producto> obtenerallprod (Connection con)
	{
		List<Producto> list = new ArrayList<Producto>();
		try {
			String sql = "call pa_obtener_all_p(?)";
			CallableStatement cStmt = con.prepareCall(sql);
			ResultSet rs = cStmt.executeQuery();
			
			while (rs.next())
			{
				Producto p = new Producto(rs.getInt("id"),
						rs.getString("nombre"),
						rs.getDouble("precio"),
						rs.getString("foto"));
						
				list.add(p);
				
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se pudo obtener el ultimo od");
			
		}

		System.out.println("Se creo el ticket sin problemas");
		return list;
		
	}
	
	
	
}
