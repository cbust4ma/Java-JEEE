<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EUSKALDENDA</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/pie.css">
</head>

<body>

	<header>
		<%@include file="header.jsp"%>
	</header>

	<main id="contenedorArcticulos">

		<h1 class="titulo">EUSKALDENDA</h1>
		<p class="b">Euskal Denda es la tienda vasca donde podrás combinar
			una amplia variedad de productos vascos típicos, tanto souvenirs y
			regalos (articulos decorados con símbolos como el lauburu o la
			ikurriña), como articulos de decoración (mantelería vasca, vajillas,
			cristalerías...), y vestimenta (camisetas, txapelas...). También
			contamos con una amplia gama de productos de Euskal Herria (salsas
			para pintxos, pimiento de Ezpeleta, guindillas de Ibarra, pastel
			vasco, sidra, txakoli, pacharan...) con los que podrás disfrutar de
			lo mas representativo de la gastronomía vasca.</p>

		<article>
			<a href="${pageContext.servletContext.contextPath}/others/ropa.jsp"><i class="fas fa-tshirt">ROPA</i></a>
		</article>

		<article>
		<a href="${pageContext.servletContext.contextPath}/others/articulo.jsp"><i class="fas fa-store">Articulo</i></a>
		</article>

		<article>
		<a href="${pageContext.servletContext.contextPath}/others/contacto.jsp"><i class="far fa-address-book">Contacto</i></a>
		</article>
	</main>

	<footer><%@include file="pie.jsp"%>
	</footer>
</body>
</html>