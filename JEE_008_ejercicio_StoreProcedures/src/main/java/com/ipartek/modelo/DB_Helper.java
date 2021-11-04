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

	@Override
	public List<Producto> obtener(Connection con) {
		List<Producto> listaproduc = new ArrayList<Producto>();

		try {
			String sql = "select * from " + tabla_producto;
			Statement stmt = con.createStatement();
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Producto product = new Producto();
				product.setId(rs.getInt(productos_id));
				product.setNombre(rs.getString(productos_nombre));
				product.setPrecio(rs.getDouble(productos_precio));
				product.setDescripcion(rs.getString(productos_descripcion));
				product.setFk_tipo(rs.getInt(productos_fk_tipo));
				product.setFk_iva(rs.getInt(productos_fk_iva));

				listaproduc.add(product);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaproduc;
	}

	@Override
	public List<Tipo> obtenerTodosTipos(Connection con) {

		List<Tipo> listado = new ArrayList<Tipo>();

		try {
			String sql = "{ call pa_tipos_todos}";
			CallableStatement cStmt = con.prepareCall(sql);
			ResultSet rs = cStmt.executeQuery();

			while (rs.next()) {
				Tipo t = new Tipo(rs.getInt(tabla_id), rs.getString(tabla_tipo));
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
			String sql = "{ call pa_ivas_todos() }";
			CallableStatement cStmt = con.prepareCall(sql);
			ResultSet rs = cStmt.executeQuery();

			while (rs.next()) {
				Iva i = new Iva(rs.getInt(ivas_id), rs.getString(tabla_iva), rs.getDouble(ivas_valor));
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
				vp.setId(rs.getInt(view_productos_id));
				vp.setNombre(rs.getString(view_productos_nombre));
				vp.setPrecio(rs.getDouble(view_precio));
				vp.setDescripcion(rs.getString(view_descripcion));
				vp.setFk_tipo(rs.getInt(view_fk_tipo));
				vp.setTipo(rs.getString(view_tipo));
				vp.setFk_iva(rs.getInt(view_fk_iva));
				vp.setIva(rs.getString(view_iva));
				vp.setValor(rs.getDouble(view_valor));

				listado.add(vp);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return new ArrayList<ViewProducto>();
		}
		return listado;
	}

	@Override
	public boolean Borrar(Connection con, int identificador) {

		try {
			String sql = " call pa_vi_producto_id(?) ";
			CallableStatement cStmt = con.prepareCall(sql);
			cStmt.setInt(1, identificador);
			cStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}

	@Override
	public boolean insertarProductoNuevo(Connection con, Producto prod) {
		try {
			String sql = "call pa_productos_insertar_nuevo(?,?,?,?,?)";
			CallableStatement cStmt = con.prepareCall(sql);
			cStmt.setString(1, prod.getNombre());
			cStmt.setDouble(2, prod.getPrecio());
			cStmt.setString(3, prod.getDescripcion());
			cStmt.setInt(4, prod.getFk_tipo());
			cStmt.setInt(5, prod.getFk_iva());
			cStmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
				vp.setId(rs.getInt(view_productos_id));
				vp.setNombre(rs.getString(view_productos_nombre));
				vp.setPrecio(rs.getDouble(view_precio));
				vp.setDescripcion(rs.getString(view_descripcion));
				vp.setFk_tipo(rs.getInt(view_fk_tipo));
				vp.setTipo(rs.getString(view_tipo));
				vp.setFk_iva(rs.getInt(view_fk_iva));
				vp.setIva(rs.getString(view_iva));
				vp.setValor(rs.getDouble(view_valor));
			}

		} catch (SQLException e) {
			return new ViewProducto();
		}

		return vp;
	}

	@Override
	public boolean modificarProducto(Connection con, Producto prod) {

		try {
			String sql = "call pa_productos_modificar(?,?,?,?,?,?)";
			CallableStatement cStmt = con.prepareCall(sql);

			cStmt.setInt(1, prod.getId());
			cStmt.setString(2, prod.getNombre());
			cStmt.setDouble(3, prod.getPrecio());
			cStmt.setString(4, prod.getDescripcion());
			cStmt.setInt(5, prod.getFk_tipo());
			cStmt.setInt(6, prod.getFk_iva());

			cStmt.executeUpdate();

		} catch (SQLException e) {
			return false;
		}

		return true;
	}

	@Override
	public List<Tipo> obtener2(Connection con) {
		List<Tipo> listatip = new ArrayList<Tipo>();

		try {
			String sql = "select * from " + tabla_tipos;
			Statement stmt = con.createStatement();
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Tipo tip = new Tipo();
				tip.setId(rs.getInt(tabla_id));
				tip.setTipo(rs.getString(tabla_tipo));

				listatip.add(tip);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listatip;
	}

	@Override
	public boolean insertarTipoNuevo(Connection con, Tipo tip) {
		try {
			String sql = "insert into " + tabla_tipos + " (tipo) values ('" + tip.getTipo() + "');";
			Statement stmt = con.createStatement();
			System.out.println(sql);
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}

		return true;

	}

	@Override
	public boolean BorrarTipo(Connection con, int indent) {
		try {
			String sql = "DELETE FROM " + tabla_tipos + " WHERE id =" + indent + ";";
			Statement stmt = con.createStatement();
			System.out.println(sql);
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}

		return true;

	}

	@Override
	public List<Tipo> modificarTipo(Connection con, int indent, Tipo tip) {

		List<Tipo> listatip = new ArrayList<Tipo>();

		try {
			String sql = "UPDATE " + tabla_tipos + " SET tipo ='" + tip.getTipo() + "' WHERE id = " + indent + ";";
			Statement stmt = con.createStatement();
			System.out.println(sql);
			stmt.executeUpdate(sql);

			listatip.add(tip);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("fallo el update");
		}

		return listatip;

	}

	@Override
	public Tipo obteneIdTipo(Connection con, int identificador) {

		Tipo tip = new Tipo();

		try {
			String sql = "call pa_vi_tipo_id(?)";
			CallableStatement cStmt = con.prepareCall(sql);

			cStmt.setInt(1, identificador);

			ResultSet rs = cStmt.executeQuery();

			while (rs.next()) {
				tip.setId(rs.getInt(tabla_id));
				tip.setTipo(rs.getString(tabla_tipo));

			}

		} catch (SQLException e) {
			return new Tipo();
		}

		return tip;
	}

	@Override
	public List<Tipo> buscarTipo(Connection con, String search) {

		List<Tipo> listatip = new ArrayList<Tipo>();
		

		try {
			String sql = "select * from tipos where tipo like '%" + search + "%';";
			Statement stmt = con.createStatement();
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Tipo tip = new Tipo();
				tip.setId(rs.getInt(tabla_id));
				tip.setTipo(rs.getString(tabla_tipo));
				listatip.add(tip);

			}

		} catch (SQLException e) {
			System.out.println("No ha pasado nada");
			return new ArrayList<Tipo>();
		}

		System.out.println("esta es la busqueda : " + search);
		return listatip;
	}

}
