<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%
int nelementosg2 = 0;
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
	%>

	<h1>Se Inserto El Grupo Perfectamente</h1>

	<%
	}
	%>


	<form method="GET" action="GuardarGrupo">

		<input type="text" name="nombre" placeholder="Nombre" required>
		<br /> <input type="text" name="ndiscos" placeholder="Nombre" required
			pattern="[0-9]*"> <br /> <input type="number"
			name="nintegrantes" placeholder="Numero de integrantes" required
			min="1" max="25"><br /> <input type="submit">

	</form>
</body>
</html>