
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.ipartek.modelo.dto.Libro"%>
<!DOCTYPE html>

<%
List<Libro> listado = new ArrayList<Libro>();

if (request.getAttribute("lista") != null) {
	listado = (List<Libro>) request.getAttribute("lista");
}
System.out.println("En el jsp la lista tiene :" + listado.size());
%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Yata!!</h1>


	<table border=1>
		<tr>
			<th>id</th>
			<th>titulo</th>
		</tr>
		<%
		for (Libro libro : listado)
		{
		%>

		<tr>
			<td> 
				<%=  libro.getId()%>
			</td>
			<td>
				<%= (libro.getTitulo())
				%>
			</td>
		</tr>
		<%
		}
		%>

		</table>


</body>
</html>