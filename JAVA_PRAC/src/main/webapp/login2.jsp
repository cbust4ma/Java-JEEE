<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
 
 <%@ page import="java.util.List"%>
 <%@ page import="java.util.ArrayList"%>
 <%@ page import="com.ipartek.modelo.dto.Login"%>
 
<%
int bool = 0;
List<Login> listado = new ArrayList<Login>();

if (request.getAttribute("lista") != null) {
	listado = (List<Login>) request.getAttribute("lista");
}
System.out.println("En el jsp la lista tiene :" + listado.size());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%
	if (listado.size() > 0)
	{
		bool = 1;
	%>
	<h1>Sesion iniciada</h1>
	
	<%	
	}
	else if(bool == 0)
	{
	
%>
	<h1>Login</h1>
	<form method="GET" action="Savetwo">
	<input type="text" name="users" placeholder="Nombre Usuario" required>
	<br />
	<input type="password" name="passwords" placeholder="Contraseña"
		required>
	<input type="submit" value = "enviar">
	</form>
	<br />
<% 
	}
	%>
	

</body>
</html>