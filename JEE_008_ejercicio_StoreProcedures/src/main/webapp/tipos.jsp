
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.dto.Tipo"%>



<%
// recuperar las listas de iva y tipos

List<Tipo> listadoTipos = new ArrayList<Tipo>();

if (request.getAttribute("listaTipos") != null) {
	listadoTipos = (List<Tipo>) request.getAttribute("listaTipos");
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
			<h2>Gestion de Tipos</h2>
			<form method="get" action="">


				<label for="nombre">Nombre del Tipo</label><br /> <input
					type="text" placeholder="nombre" name="nombre" id="nombre">


				<input type="submit" formaction="AdmProductoAgregarTipo"
					value="Agregar"></input> <input type="submit" formaction="Search"
					value="Buscar"></input>


				<section id="contenedorPrincipalAdmin">

					<h2>Resultados</h2>

					<table border=1>
						<thead>
							<tr>
								<td>id</td>
								<td>nombre</td>
								<td>opciones</td>
							</tr>
						</thead>
						<%
						for (Tipo t : listadoTipos) {
						%>
						<tr>
							<td><%=t.getId()%></td>
							<td><%=t.getTipo()%></td>

							<td><a href="BorrarTipo?id=<%=t.getId()%>">borrar</a> <a
								href="ModTipo?id=<%=t.getId()%>">modificar</a></td>
						</tr>
						<%
						}
						%>


					</table>



				</section>






			</form>
		</section>
	</main>

</body>
</html>