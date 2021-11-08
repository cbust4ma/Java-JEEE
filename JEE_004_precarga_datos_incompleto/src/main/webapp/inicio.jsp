<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.ipartek.modelo.dto.Usuario"%>
<!DOCTYPE html>

<%
List<Usuario> listado = new ArrayList<Usuario>();

if (request.getAttribute("lista") != null) {
	listado = (List<Usuario>) request.getAttribute("lista");
}
System.out.println("En el jsp la lista tiene :" + listado.size());
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
YaTTa!!!!! no pasamos po el index



	<table border=1>
		<tr>
			<th>id</th>
			<th>Usuario</th>
			<th>Password</th>
		</tr>
		<%
		for (Usuario lgin : listado)
		{
		%>

		<tr>
			<td> 
				<%=  lgin.getId()%>
			</td>
			<td>
				<%= (lgin.getUsuario())
				%>
			</td>
						<td>
				<%= (lgin.getPassword())
				%>
			</td>
		</tr>
		<%
		}
		%>

		</table>
</body>
</html>