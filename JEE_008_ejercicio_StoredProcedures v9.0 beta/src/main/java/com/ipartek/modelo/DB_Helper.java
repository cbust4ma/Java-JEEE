package com.ipartek.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Iva;
import com.ipartek.modelo.dto.Producto;
import com.ipartek.modelo.dto.Tipo;
import com.ipartek.modelo.dto.ViewProducto;

public class DB_Helper implements I_Conexion {

	@Override
	public Connection conectar() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USER, PASS);
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
			System.out.println("Desconexion OK");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}

	}

	@Override
	public List<Tipo> obtenerTodosTipos(Connection con) {

		List<Tipo> listado = new ArrayList<Tipo>();

		try {
			String sql = "call pa_tipos_todos()";
			CallableStatement cStmt = con.prepareCall(sql);
			ResultSet rs = cStmt.executeQuery();

			while (rs.next()) {
				Tipo t = new Tipo(rs.getInt(TIPOS_ID), rs.getString(TIPOS_TIPO));
				listado.add(t);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return new ArrayList<Tipo>();
		}
		return listado;
	}

	@Override
	public List<Iva> obtenerTodosIvas(Connection con) {

		List<Iva> listado = new ArrayList<Iva>();

		try {
			String sql = "call pa_ivas_todos()";
			CallableStatement cStmt = con.prepareCall(sql);
			ResultSet rs = cStmt.executeQuery();
			while (rs.next()) {
				Iva i = new Iva(rs.getInt(IVAS_ID), rs.getString(IVAS_IVA), rs.getDouble(IVAS_VALOR));
				listado.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return new ArrayList<Iva>();
		}

		return listado;
	}

	@Override
	public List<ViewProducto> obtenerTodosViewProducto(Connection con) {

		List<ViewProducto> listado = new ArrayList<ViewProducto>();

		try {
			String sql = "call pa_vi_productos_todos()";
			CallableStatement cStmt = con.prepareCall(sql);
			ResultSet rs = cStmt.executeQuery();

			while (rs.next()) {
				ViewProducto vp = new ViewProducto();
				vp.setId(rs.getInt(VIEW_PRODUCTOS_ID));
				vp.setNombre(rs.getString(VIEW_PRODUCTOS_NOMBRE));
				vp.setPrecio(rs.getDouble(VIEW_PRODUCTOS_PRECIO));
				vp.setDescripcion(rs.getString(VIEW_PRODUCTOS_DESCRIPCION));
				vp.setFK_tipo(rs.getInt(VIEW_PRODUCTOS_FK_TIPO));
				vp.setTipo(rs.getString(VIEW_PRODUCTOS_TIPO));
				vp.setFK_iva(rs.getInt(VIEW_PRODUCTOS_FK_IVA));
				vp.setIva(rs.getString(VIEW_PRODUCTOS_IVA));
				vp.setValor(rs.getDouble(VIEW_PRODUCTOS_VALOR));

				listado.add(vp);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return new ArrayList<ViewProducto>();
		}
		return listado;
	}

	@Override
	public boolean insertarProductoNuevo(Connection con, Producto prod) {

		try {
			String sql = "call pa_productos_insertar_nuevo(?,?,?,?,?)";
			CallableStatement cStmt = con.prepareCall(sql);

			cStmt.setString(1, prod.getNombre());
			cStmt.setDouble(2, prod.getPrecio());
			cStmt.setString(3, prod.getDescripcion());
			cStmt.setInt(4, prod.getFK_tipo());
			cStmt.setInt(5, prod.getFK_iva());

			cStmt.executeUpdate();
		} catch (SQLException e) {
			return false;
		}

		return true;
	}

	@Override
	public boolean borrarProducto(Connection con, int identificador) {

		try {
			String sql = "call pa_productos_borrar_id(?)";
			CallableStatement cStmt = con.prepareCall(sql);

			cStmt.setInt(1, identificador);

			cStmt.executeUpdate();
		} catch (SQLException e) {
			return false;
		}

		return true;
	}


	@Override
	public ViewProducto obtenerParaModificarProductoId(Connection con, int identificador) {

		ViewProducto vp = new ViewProducto();

		try {
			String sql = "call pa_vi_producto_id(?)";
			CallableStatement cStmt = con.prepareCall(sql);

			cStmt.setInt(1, identificador);

			ResultSet rs = cStmt.executeQuery();

			while (rs.next()) {
				vp.setId(rs.getInt(VIEW_PRODUCTOS_ID));
				vp.setNombre(rs.getString(VIEW_PRODUCTOS_NOMBRE));
				vp.setPrecio(rs.getDouble(VIEW_PRODUCTOS_PRECIO));
				vp.setDescripcion(rs.getString(VIEW_PRODUCTOS_DESCRIPCION));
				vp.setFK_tipo(rs.getInt(VIEW_PRODUCTOS_FK_TIPO));
				vp.setTipo(rs.getString(VIEW_PRODUCTOS_TIPO));
				vp.setFK_iva(rs.getInt(VIEW_PRODUCTOS_FK_IVA));
				vp.setIva(rs.getString(VIEW_PRODUCTOS_IVA));
				vp.setValor(rs.getDouble(VIEW_PRODUCTOS_VALOR));
			}

		} catch (SQLException e) {
			return new ViewProducto();
		}

		return vp;
	}

	

	@Override	
	public boolean modificarProducto(Connection con, Producto prod) {
		
		try {
			String sql="call pa_productos_modificar(?,?,?,?,?,?)";
			CallableStatement cStmt = con.prepareCall(sql);
			
			cStmt.setInt(1, prod.getId());
			cStmt.setString(2, prod.getNombre());
			cStmt.setDouble(3, prod.getPrecio());
			cStmt.setString(4, prod.getDescripcion());
			cStmt.setInt(5, prod.getFK_tipo());
			cStmt.setInt(6, prod.getFK_iva());
			
			cStmt.executeUpdate();
			
			
		} catch (SQLException e) {
			return false;
		}
	
		return true;
	}

}
