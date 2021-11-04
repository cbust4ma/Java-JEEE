<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>LIBROS2AMANO</title>
<link rel="stylesheet" href="style/style.css">
</head>

<body>
	
	<%@include file="cabecera.jsp" %>

	<main>
		<h2>Formulario de contacto</h2>
		
		<p>aqui esperamos cualquier tipo de sugerencia uqe quieras hacernos
		eqasdja  qwñ  f  fqhf oiqwhoi io iowoiqwash foias iqwhfioq wh oiai
		a fas fuahf sa asdjlasdn ajs jjajs al jahih awihoaiwiqw9 ou fpjasiii
		asf a</p>
		
		<form method="GET" action="">
		
			<input type="text" id="nombre" name="nombre" required>
			<label for="nombre">Nombre</label><br>
			
			<input type="email" id="email" name="email" required >
			<label for="email">Correo electronico</label><br>
			
			<input type="tel" id="telefono" name="telefono" >
			<label for="telefono">Telefono</label><br>
			
			<input type="radio" id="radioParticular" name="tipoUsuario" value="particular" checked>
			<label for="radioParticular">Particular</label>
		
			<input type="radio" id="radioEmpresa" name="tipoUsuario" value="empresa">
			<label for="radioEmpresa">Empresa</label><br>
			
			<select id="motivo" name="motivo">
				<option value="1">Solicitud</option>
				<option value="2">Devolucion</option>
				<option value="3">Venta</option>
				<option value="4">Consulta</option>
				<option value="5">Reclamacion</option>
			</select>
			<label for="motivo">Motivo del mensaje</label><br>
			
			<label for="texto">Mensaje:</label><br>
			<textarea id="mensaje" name="mensaje" rows="4" cols="40" required></textarea><br>
			
			<input type="submit" value="Enviar">
			<input type="reset" value="Limpiar">
		</form>




	</main>

	<%@include file="pie.jsp" %>
	
</body>
</html>