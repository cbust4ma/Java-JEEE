<%@page import="com.ipartek.modelo.dto.ViewProducto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ipartek.modelo.dto.Iva" %>
<%@ page import="com.ipartek.modelo.dto.Tipo" %>
<%@ page import="com.ipartek.modelo.dto.ViewProducto" %>

<%
//recuperar las listas de iva y tipos
List<Tipo> listadoTipos= new ArrayList<Tipo>();
if(request.getAttribute("listaTipos")!=null)
{
	listadoTipos=(List<Tipo>)request.getAttribute("listaTipos");
}

List<Iva> listadoIvas= new ArrayList<Iva>();
if(request.getAttribute("listaIvas")!=null)
{
	listadoIvas=(List<Iva>)request.getAttribute("listaIvas");
}

List<ViewProducto> listadoViewProductos= new ArrayList<ViewProducto>();
if(request.getAttribute("listaViewProductos")!=null)
{
	listadoViewProductos=(List<ViewProducto>)request.getAttribute("listaViewProductos");
}
%>	
	
	
	
	
	
	
	
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/styleCabecera.css">
		<link rel="stylesheet" href="css/styleCuerpo.css">
		<link rel="stylesheet" href="css/stylePie.css">
	</head>
	
	<body>
	
		<%@include file="partes/adm_cabecera.jsp"%>
		
		<main>
			<section id="contenedorPrincipalAdmin">
				<h2>Gestion de productos</h2>
				
				<form method="get" >
				
					<label for="nombre">Nombre del producto</label><br>
					<input type="text" placeholder="nombre" name="nombre" id="nombre"><br>
					
					<label for="precio">Precio del producto</label><br>
					<input type="number" placeholder="precio" name="precio" id="precio" step="0.01"><br>
					
					<label for="descripcion">Descripcion del producto</label><br>
					<textarea name="descripcion" id="descripcion"></textarea><br>
					
					<label for="tipo">Tipo del producto</label><br>
					<select name="tipo" id="tipo">
					<%
					for(Tipo t:listadoTipos)
					{
					%>	
						<option value="<%=t.getId() %>"><%=t.getTipo() %></option>
					<%	
					}
					%>
					</select><br>
					
					<label for="iva">I.V.A. del producto</label><br>
					<select name="iva" id="iva">
					  	<%
					for(Iva i:listadoIvas)
					{
					%>	
						<option value="<%=i.getId() %>"><%=i.getIva()%> (<%=i.getValor()%> %) </option>
					<%	
					}
					%>
					</select><br>
					
					<input type="submit" formaction="AdmProductoAgregar" value="Agregar"></input>
                    <input type="submit" formaction="AdmProductoBuscar" value="Buscar"></input>
				</form>
			</section>
			
			<section id="contenedorPrincipalAdmin">
				<h2>Resultados</h2>
			
				<table border="1px solid">
					<thead>
					    <th>Id</th>
					    <th>Nombre</th>
					    <th>Descripcion</th>
					    <th>Precio</th>
					    <th>Tipo</th>
					    <th>I.V.A.</th>
					    <th>Opciones</th>
					</thead>
				  
				  <%
				  for(ViewProducto vp:listadoViewProductos) 
				  {
				  %>  
					<tr>
					   	<td><%=vp.getId() %></td>
					   	<td><%=vp.getNombre() %></td>
					   	<td><%=vp.getDescripcion() %></td>
					   	<td><%=vp.getPrecio() %></td>
					   	<td><%=vp.getTipo() %></td>
					   	<td><%=vp.getValor() %> %</td>
					   	<td>
						   	<a href="AdmProductoBorrar?id=<%=vp.getId()%>">Borrar</a>
						   	<a href="AdmProductoModificar?id=<%=vp.getId()%>">Modificar</a>
						</td>
					</tr>  					
				  <%  
				  }
				  %>
				  
					
				  
				</table>
			</section>
		</main>
	</body>
</html>