<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zacinto Contatti</title>
<link href="css/style_chisiamo.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="logo">

		<img src="img/BibliotecaZacintoTrasparente.png"
			alt="Biblioteca Zacinto"
			style="display: block; margin-left: auto; margin-right: auto;"
			height="75px"> </img>

	</div>

	<div class="menu">
		<!-- Bottoni del menu -->

		<ul id="menu">
			<li><a href="http://localhost:8080/Zacinto/home">Home</a></li>
			<li><a href="http://localhost:8080/Zacinto/catalogo">Catalogo</a></li>
			<li><a href="http://localhost:8080/Zacinto/profilo">Profilo</a></li>
			<li><a href="http://localhost:8080/Zacinto/chisiamo">Chi
					siamo?</a></li>
			<li><a href="http://localhost:8080/Zacinto/contatti">Contatti</a></li>
		</ul>
	</div>

	<div class="conteiner-grande">

		<div class="conteiner">

			<h1>Contatti</h1>
			<table>
				<tr>
					<td>Nome: <%=session.getAttribute("nome")%>
					</td>
					<td>Telefono: <%=session.getAttribute("telefono")%></td>
					<td>Et&agrave;: <%=session.getAttribute("eta")%></td>
				</tr>
				<tr>
					<td>Cognome: <%=session.getAttribute("cognome")%></td>
					<td>Sesso: <%=session.getAttribute("sesso")%></td>
					<td>Email: <%=session.getAttribute("email")%></td>
				</tr>
			</table>
		</div>

	</div>
	<footer> <!-- Footer -->

	<p>Biblioteca Zacinto &#169; 2018</p>

	</footer>
</body>
</html>