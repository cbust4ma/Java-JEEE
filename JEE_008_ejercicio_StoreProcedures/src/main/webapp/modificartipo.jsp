<%@page import="com.ipartek.modelo.dto.ViewProducto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ipartek.modelo.dto.Tipo" %>


<%
//recuperar las listas de iva y tipos
Tipo listaTip= new Tipo();
if(request.getAttribute("datosLista")!=null)
{
	listaTip=(Tipo)request.getAttribute("datosLista");
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
				<h2>Modificacion de tipo</h2>
				
				<form method="get" action="ModificarTipoFinal">
				
				
					<label for="nombre">Nombre del Tipo</label><br>
					<input  type="text"  name="nombre" id="nombre" value="<%=listaTip.getTipo() %>"><br>
					
					<label for="id">id</label><br>
					<input  readonly type="text"  name="id" id="id" value="<%=listaTip.getId() %>"><br>
					
					<input type="submit"  value="Modificar"></input>
                    
				</form>
			</section>
			
			
		</main>
	</body>
</html>

