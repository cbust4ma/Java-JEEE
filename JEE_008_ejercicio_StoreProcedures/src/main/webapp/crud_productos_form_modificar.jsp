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
List<Tipo> listadoTipos= new Tipo();
if(request.getAttribute("listaTipos")!=null)
{
	listadoTipos=(List<Tipo>)request.getAttribute("listaTipos");
}

List<Iva> listadoIvas= new ArrayList<Iva>();
if(request.getAttribute("listaIvas")!=null)
{
	listadoIvas=(List<Iva>)request.getAttribute("listaIvas");
}

ViewProducto productoId= new ViewProducto();
if(request.getAttribute("datosProducto")!=null)
{
	productoId=(ViewProducto)request.getAttribute("datosProducto");
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
	
		<%@include file="partes/admin_cabecera.jsp"%>
		
		<main>
			<section id="contenedorPrincipalAdmin">
				<h2>Modificacion de producto</h2>
				
				<form method="get" action="AdmProductoModificarFinal">
				
					<label for="nombre">ID del producto</label><br>
					<input type="text" name="id" id="id" value="<%=productoId.getId() %>" readonly ><br>
				
					<label for="nombre">Nombre del producto</label><br>
					<input type="text"  name="nombre" id="nombre" value="<%=productoId.getNombre() %>"><br>
					
					<label for="precio">Precio del producto</label><br>
					<input type="number" name="precio" id="precio" step="0.01" value="<%=productoId.getPrecio() %>"><br>
					
					<label for="descripcion">Descripcion del producto</label><br>
					<textarea name="descripcion" id="descripcion"><%=productoId.getDescripcion() %></textarea><br>
					
					<label for="tipo">Tipo del producto</label><br>
					<select name="tipo" id="tipo">
					
					<%
					for(Tipo t:listadoTipos)
					{
					%>	
						<option value="<%=t.getId() %>"    

						<%if(t.getId()==productoId.getFk_tipo())
						{
						%>	
							selected
						<%	
						}
						%>
						><%=t.getTipo() %></option>
					<%	
					}
					%>
					</select><br>
					
					<label for="iva">I.V.A. del producto</label><br>
					<select name="iva" id="iva">
					 <%
					for(Iva i:listadoIvas)
					{
						if(i.getId()==productoId.getFk_iva())
						{
							%>
							<option selected value="<%=i.getId()%>"><%=i.getIva()%> (<%=i.getValor()%> %) </option>
							<%
						}
						else
						{
							%>
							<option value="<%=i.getId()%>"><%=i.getIva()%> (<%=i.getValor()%> %) </option>
							<%
						}
					}
					%>
					</select><br>
					
					<input type="submit"  value="Modificar"></input>
                    
				</form>
			</section>
			
			
		</main>
	</body>
</html>


			





