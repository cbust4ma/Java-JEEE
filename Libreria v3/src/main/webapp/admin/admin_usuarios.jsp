<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>LIBROS2AMANO</title>
	<link rel="stylesheet" href="../style/styleAdmin.css">
</head>

<body>
	
	<%@include file="admin_cabecera.jsp" %>

	<main>
		<section id="seccionAdd">
			<h2>Añadir usuario</h2>
			<form method="GET" action="">
				<input type="text" name="user" id="user" pattern="[A-Za-z0-9_]*" required>
				<label for="user">Usuario</label><br>
				
				<input type="text" name="pass" id="pass" required>
				<label for="pass">Constraseña</label><br>
				
				<input type="submit" value="Enviar">
				<input type="reset" value="Resetear">
			
			</form>
		</section>
		
		<section id="seccionFilter">
		<h2>Filtro de busqueda</h2>
			<form method="GET" action="">
				<input type="text" name="user" id="user" pattern="[A-Za-z0-9_]*" required>
				<label for="user">Usuario</label><br>
			
				<input type="submit" value="Enviar">
				<input type="reset" value="Resetear">
			</form>
		</section>
		
		<section id="seccionResultadoFilter">
			<table>
				<thead>
					<tr>
						<th>Id</th> 
						<th>Usuario</th> 
						<th>Opciones</th> 
					</tr>
				</thead>
				
				<tbody>
					<tr>
						<td>Id1</td> 
						<td>Alain</td> 
						<td>borrar modificar</td> 
					</tr>
					<tr>
						<td>Id2</td> 
						<td>Ana</td> 
						<td>borrar modificar</td> 
					</tr>
					<tr>
						<td>Id1</td> 
						<td>Julia</td> 
						<td>borrar modificar</td> 
					</tr>
					<tr>
						<td>Id2</td> 
						<td>Alberto</td> 
						<td>borrar modificar</td> 

					</tr>
				</tbody>
			
			
			
			</table>
		</section>
	</main>

	
	
</body>
</html>