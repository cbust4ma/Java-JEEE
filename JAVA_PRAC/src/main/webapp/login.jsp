<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%
int nelementosg2 = 0;
int bool = 1;
if (request.getAttribute("resultado") != null) {
	nelementosg2 = (int) request.getAttribute("resultado");
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	if (nelementosg2 > 0) {
		bool = 0;
	%>

	<h1>Se Inserto El Grupo Perfectamente</h1>


	<%
	}
	if(bool == 1)
	{
	%>

	<form method="GET" action="Save">

		<input type="text" name="users" placeholder="Nombre Usuario" required>
		<br /> <input type="password" name="passwords"
			placeholder="Contraseña" required> <input type="submit">

	</form>
	<%
	}
	%>
	<a href="index.jsp">Volver</a>
</body>
</html>