package com.ipartek.modelo;

import java.sql.Connection;
import java.util.List;

import com.ipartek.modelo.dto.Iva;
import com.ipartek.modelo.dto.Producto;
import com.ipartek.modelo.dto.Tipo;
import com.ipartek.modelo.dto.ViewProducto;

public interface I_Conexion {
	
	//constantes
	String DRIVER="com.mysql.jdbc.Driver";
	String BD="db_supermercado";
	String USER="root";
	String PASS="admin";
	String CONEXION="jdbc:mysql://localhost:3306/"+BD+"?useSSL=false";
	
	//Constantes
	String TABLA_IVAS="ivas";
	String IVAS_ID="id";
	String IVAS_IVA="iva";
	String IVAS_VALOR="valor";
	
	String TABLA_TIPOS="tipos";
	String TIPOS_ID="id";
	String TIPOS_TIPO="tipo";
	
	String TABLA_PRODUCTOS="productos";
	String PRODUCTOS_ID="id";
	String PRODUCTOS_NOMBRE="nombre";
	String PRODUCTOS_PRECIO="precio";
	String PRODUCTOS_DESCRIPCION="descripcion";
	String PRODUCTOS_FK_TIPO="FK_tipo";
	String PRODUCTOS_FK_IVA="FK_iva";
	
	String VIEW_PRODUCTOS="vi_productos_todos";
	String VIEW_PRODUCTOS_ID="id";
	String VIEW_PRODUCTOS_NOMBRE="nombre";
	String VIEW_PRODUCTOS_PRECIO="precio";
	String VIEW_PRODUCTOS_DESCRIPCION="descripcion";
	String VIEW_PRODUCTOS_FK_TIPO="id_tipo";
	String VIEW_PRODUCTOS_TIPO="tipo";
	String VIEW_PRODUCTOS_FK_IVA="id_iva";
	String VIEW_PRODUCTOS_IVA="iva";
	String VIEW_PRODUCTOS_VALOR="valor";
	
	
	//definiciones
	public Connection conectar();
	public void desconectar(Connection con);
	
	List<Tipo> obtenerTodosTipos(Connection con);
	List<Iva> obtenerTodosIvas(Connection con);
	List<ViewProducto> obtenerTodosViewProducto(Connection con);
	boolean insertarProductoNuevo(Connection con, Producto prod);
	boolean borrarProducto(Connection con, int identificador);
	ViewProducto obtenerParaModificarProductoId(Connection con, int identificador);
	boolean modificarProducto(Connection con, Producto prod);
	
	
	
	
}
