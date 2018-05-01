<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prodotto Zacinto</title>
<link href="css/style_prodotto.css" rel="stylesheet" type="text/css">
</head>
<body>
<body>

	<div class="logo">

		<img src="img/BibliotecaZacintoTrasparente.png"
			alt="Biblioteca Zacinto"
			style="display: block; margin-left: auto; margin-right: auto;"
			height="75px"> </img>

	</div>

	<div class="menu">

		<ul id="menu">
			<li><a href="http://localhost:8080/Zacinto/home">Home</a></li>
			<li><a href="http://localhost:8080/Zacinto/catalogo">Catalogo</a></li>
			<li><a href="http://localhost:8080/Zacinto/profilo">Profilo</a></li>
			<li><a href="http://localhost:8080/Zacinto/chi-siamo">Chi
					siamo?</a></li>
			<li><a href="http://localhost:8080/Zacinto/contatti">Contatti</a></li>
		</ul>
	</div>

	<div class="conteiner-prodotto">

		<div class="prodotto">

			<h1><%=request.getAttribute("nomeProdotto")%></h1>

			<div class="foto-prodotto">

				<img src="img/Paulu Piulu.png"
					style="display: block; margin-left: auto; margin-right: auto;"
					height="75px"> </img>

			</div>

			<h2>Caratteristiche</h2>

			<div class="dati">

				<table>
					<tr>
						<td>Genere</td>
						<td><%=request.getAttribute("romanzo")%></td>
					</tr>
					<tr>
						<td>Autore</td>
						<td><%=request.getAttribute("autore")%></td>
					</tr>
				</table>

			</div>

			<h2>Trama / descrizione</h2>

			<p>sono la trama o la descrizione</p>

			<h2>Disponibilita'</h2>

			<p>Disponibile/Non dispobile
			<p>


				<form name="prenota" method="get" action="riepilogo">
				<p> Inserisci il nome del prodotto: <p>
				<INPUT type=text name="nomeprodotto" class="form-control" placeholder="Nome Prodotto" required > <button type=SUBMIT>Prenota</button>
				
				
				</form>

		</div>

	</div>

	<footer>

	<p>Biblioteca Zacinto &#169; 2018</p>

	</footer>
</body>
</html>