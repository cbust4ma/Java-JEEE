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
			<h2>Añadir libro</h2>
			<form method="GET" action="">
				<input type="text" name="titulo" id="titulo" pattern="[A-Za-z 0-9.,!?¿¡]*" required>
				<label for="titulo">Titulo</label><br>
				
				<input type="number" name="precio" id="precio" step="0.01" min="0" required>
				<label for="precio">Precio</label><br>
				
				<label for="descr">Descripcion</label><br>
				<textarea name="descr" id="descr" rows="4" cols="40" required></textarea><br>
				
				<input type="submit" value="Enviar">
				<input type="reset" value="Resetear">
			
			</form>
		</section>
		
		<section id="seccionFilter">
		<h2>Filtro de busqueda</h2>
			<form method="GET" action="">
				<input type="text" name="texto" id="texto">
				<label for="texto">Texto</label><br>
			
				<select name="rango" id="rango">
					<option value="1">Mayor que</option>
					<option value="2">Menor que</option>
					<option value="3">Igual a</option>	
				</select>
				<input type="number" name="precio" id="precio" step="0.01" min="0">
				<label for="precio">Euros</label><br>
			
				<input type="submit" value="Enviar">
				<input type="reset" value="Resetear">
			</form>
		</section>
		
		<section id="seccionResultadoFilter">
			<table>
				<thead>
					<tr>
						<th>Id</th> 
						<th>Titulo</th> 
						<th>Descripcion</th> 
						<th>Precio</th> 
						<th>Opciones</th> 
					</tr>
				</thead>
				
				<tbody>
					<tr>
						<td>Id1</td> 
						<td>Titulo1</td> 
						<td>Descripcion1</td> 
						<td>Precio1</td> 
						<td>Opciones1</td> 
					</tr>
					<tr>
						<td>Id2</td> 
						<td>Titulo2</td> 
						<td>Descripcion2</td> 
						<td>Precio2</td> 
						<td>Opciones2</td> 
					</tr>
					<tr>
						<td>Id1</td> 
						<td>Titulo1</td> 
						<td>Descripcion1</td> 
						<td>Precio1</td> 
						<td>Opciones1</td> 
					</tr>
					<tr>
						<td>Id2</td> 
						<td>Titulo2</td> 
						<td>Descripcion2</td> 
						<td>Precio2</td> 
						<td>Opciones2</td> 
					</tr>
				</tbody>
			
			
			
			</table>
		</section>
	</main>

	
	
</body>
</html>