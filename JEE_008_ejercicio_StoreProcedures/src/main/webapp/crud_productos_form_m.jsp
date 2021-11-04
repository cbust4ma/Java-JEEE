
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.dto.Iva"%>
<%@page import="com.ipartek.modelo.dto.Tipo"%>
<%@ page import="com.ipartek.modelo.dto.ViewProducto"%>


<%
// recuperar las listas de iva y tipos

List<Tipo> listadoTipos = new ArrayList<Tipo>();
List<Iva> listadoIvas = new ArrayList<Iva>();
if (request.getAttribute("listaTipos") != null) {
	listadoTipos = (List<Tipo>) request.getAttribute("listaTipos");
}

if (request.getAttribute("listaiva") != null) {
	listadoIvas = (List<Iva>) request.getAttribute("listaiva");
}

List<ViewProducto> listadoViewProductos = new ArrayList<ViewProducto>();
if (request.getAttribute("listaViewProductos") != null) {
	listadoViewProductos = (List<ViewProducto>) request.getAttribute("listaViewProductos");
}
%>


<!DOCTYPE html>

<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
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
			<h2>Modificacion de productos</h2>
			<form method="get" action="">
			
			<label for="nombre">Nombre del producto</label><br /> <input
					type="text" placeholder="nombre" name="id" id="id">

				<label for="nombre">Nombre del producto</label><br /> <input
					type="text" placeholder="nombre" name="nombre" id="nombre">

				<label for="precio">Precio del producto</label><br /> <input
					type="text" placeholder="precio" name="precio" id="precio"
					step="0,01"> <label for="descripcion">Descripcion
					del producto</label><br />
				<textarea placeholder="descripcion" name="descripcion"
					id="descripcion"></textarea>

				<label for="tipo">Tipo del producto</label><br /> <select
					name="tipo" id="tipo">

					<%
					for (Tipo t : listadoTipos) {
					%>
					<option value="<%=t.getId()%>"><%=t.getTipo()%></option>
					<%
					}
					%>

				</select> <label for="iva">Tipo de IVA </label><br /> <select name="iva"
					id="iva">

					<%
					for (Iva i : listadoIvas) {
					%>

					<option value="<%=i.getId()%>"><%=i.getIva()%> (<%=i.getValor()%>)
					</option>
					<%
					}
					%>


				</select> <input type="submit" formaction="AdmProductoAgregar"
					value="modficar"></input> 

			</form>
		</section>
	</main>

</body>
</html>