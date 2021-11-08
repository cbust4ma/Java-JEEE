
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.ipartek.modelo.dto.Producto"%>
<!DOCTYPE html>

<%
List<Producto> listado = new ArrayList<Producto>();

if (request.getAttribute("lista") != null) {
	listado = (List<Producto>) request.getAttribute("lista");
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
			<th>nombre</th>
			<th>precio</th>
			<th>Stock</th>
		</tr>
		<%
		for (Producto proc : listado)
		{
		%>

		<tr>
			<td> 
				<%=  proc.getId()%>
			</td>
			<td>
				<%= (proc.getNombre())
				%>
			</td>
						<td>
				<%= (proc.getPrecio())
				%>
			</td>
						<td>
				<%= (proc.getStock())
				%>
			</td>
		</tr>
		<%
		}
		%>

		</table>

</body>
</html>