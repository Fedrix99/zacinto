<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="zacintoController.Prodotto" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Risultati della ricerca</title>
<link href="css/style_errore.css" rel="stylesheet" type="text/css">
</head>
<body>

	<% Prodotto p = (Prodotto) request.getAttribute("nomeProdotto"); %>

	<div class="logo">

		<img src="img/BibliotecaZacintoTrasparente.png"
			alt="Biblioteca Zacinto"
			style="display: block; margin-left: auto; margin-right: auto;"
			height="75px"> </img>

	</div>

	<div class="box-errore">




		<form action="catalogo">

			<% if(p != null) {%>
			<p>
				Prodotto trovato: <a href="prodotto"><%=request.getAttribute("nomeProdotto") %>
			</p>
				<% } %>
			<button>Ritorna al catalogo</button>

		</form>

	</div>

	<footer>

	<p>Biblioteca Zacinto &#169; 2018</p>

	</footer>

</body>
</html>