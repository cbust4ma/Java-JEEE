package com.ipartek.modelo;

import java.sql.Connection;
import java.util.List;

import com.ipartek.modelo.dto.Iva;
import com.ipartek.modelo.dto.Producto;
import com.ipartek.modelo.dto.Tipo;
import com.ipartek.modelo.dto.ViewProducto;

public interface I_conexion {

	String driver = "com.mysql.jdbc.Driver";
	String user = "root";
	String pass = "admin";
	String bd = "db_supermercados";
	String conexion = "jdbc:mysql://localhost:3306/" + bd + "";

	// constantes

	String tabla_iva = "iva";
	String ivas_id = "id";
	String ivas_iva = "iva";
	String ivas_valor = "valor";

	String tabla_tipos = "tipos";
	String tabla_id = "id";
	String tabla_tipo = "tipo";

	String tabla_producto = "producto";
	String productos_id = "id";
	String productos_nombre = "nombre";
	String productos_precio = "precio";
	String productos_descripcion = "descripcion";
	String productos_fk_tipo = "fk_tipo";
	String productos_fk_iva = "fk_iva";

	String view_productos_id = "id";
	String view_productos = "vi_productos_todos";
	String view_productos_nombre = "nombre";
	String view_precio = "precio";
	String view_descripcion = "descripcion";
	String view_fk_tipo = "idTipo";
	String view_tipo = "tipo";
	String view_iva = "iva";
	String view_valor = "valor";
	String view_fk_iva = "idIva";

	void desconectar(Connection con);
	public List<Producto> obtener(Connection con);
	public Connection conectar();
	public List<Iva> obtenerTodosIvas(Connection con);
	public List<Tipo> obtenerTodosTipos(Connection con);
	public List<ViewProducto> obtenerTodosViewProducto(Connection con);
	public boolean Borrar(Connection con, int identificador);
	public boolean insertarProductoNuevo(Connection con, Producto prod);
	//public ViewProducto modificar(Connection con, int identificador) ;
	public boolean borrarProducto(Connection con, int identificador);
	public ViewProducto obtenerParaModificarProductoId(Connection con, int identificador);
	public boolean modificarProducto(Connection con, Producto prod);
	public List<Tipo> obtener2(Connection con);
	public boolean insertarTipoNuevo(Connection con, Tipo tip);
	public boolean BorrarTipo(Connection con, int indent);
	public List<Tipo> modificarTipo (Connection con, int indent, Tipo tip);
	public Tipo obteneIdTipo(Connection con, int identificador) ;
	public List<Tipo> buscarTipo(Connection con, String search);
	
	

}
