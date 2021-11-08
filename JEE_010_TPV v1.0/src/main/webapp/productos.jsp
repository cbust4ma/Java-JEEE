<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ipartek.modelo.dto.Producto" %>

List<Producto> listado = new ArrayList<Producto>();
if(request.getAttribute("lista")!=null)
{
	listado=(Producto)request.getAttribute("lista");
}


<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		<header>
			<h1>FACTURATRON 3000 plus</h1>
		</header>
		
		<main>
		<%for(Producto pr:listado)
			{
			
		%>
		<!-- Este es el bloque que se repetira por cada articulo -->
			<article>
				<form method ="get" action ="AgregarProdALTicket?id=77">
					<!-- SPOILER -->
					<h2><%=pr.getNombre()%></h2>
					<img src="img/<%=pr.getFoto() %>" alt="img" height="149px" width="227px">
					<p><%=pr.getPrecio() %></p>
					<input type="number" min="0" name ="cantidad" value="0">
					<input type="submit" value="Añadir">
				</form>
			</article>
			<%
			}
			%>
		
		<!-- ya no estariamos en el bucle -->
			<a href="">GENERAR TICKET</a>
		
		
		
		
		
		
		</main>
	
	
	
	
	
	
	
	</body>
</html>