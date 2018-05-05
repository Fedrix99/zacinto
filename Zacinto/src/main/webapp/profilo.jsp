<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="zacintoController.Utente"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style_profilo.css" rel="stylesheet" type="text/css">
<title>Profilo</title>
</head>
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

	<div class="conteiner-profilo">

		<div class="welcome">

			<h1>

					Ciao, <%=session.getAttribute("nome")%>
			</h1>

			<div class="dati">

				<table>
					<tr>
						<td>Nome: <%=session.getAttribute("nome")%> </td>
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


			<div class="prestiti">

				<h1>Prestiti</h1>

				<table>
					<tr>
						<td>Data ritiro: 10/03/2018</td>
						<td>Data scandeza: 10/04/2018</td>
						<td>Stato: Non ritardo</td>
					</tr>
					<tr>
						<td>Data ritiro: 10/02/2018</td>
						<td>Data scandeza: 10/03/2018</td>
						<td>Stato: Ritardo</td>
					</tr>
				</table>


			</div>

			<div class="penali">

				<h1>Penali</h1>

				<table>
					<tr>
						<td>Consegna in ritardo</td>
						<td>Ritardo di 10 giorni</td>
						<td>Tot da pagare: 10&euro;</td>
					</tr>
					<tr>
						<td>Consegna in ritardo</td>
						<td>Ritardo di 20 giorni</td>
						<td>Tot da pagare: 15&euro;</td>
					</tr>
					<tr>
						<td>Consegna in ritardo</td>
						<td>Ritardo di 30 giorni</td>
						<td>Tot da pagare: 25&euro;</td>
					</tr>
					<tr>
						<td>Consegna in ritardo</td>
						<td>Ritardo pi&ugrave; di 30 giorni</td>
						<td>Tot da pagare: 25&euro;</td>
					</tr>
					<tr>
						<td>Materiale danneggiato</td>
						<td>Danno basso</td>
						<td>Tot da pagare: 15&euro;</td>
					</tr>
					<tr>
						<td>Materiale danneggiato</td>
						<td>Danno medio</td>
						<td>Tot da pagare: 25&euro;</td>
					</tr>
					<tr>
						<td>Materiale danneggiato</td>
						<td>Danno alto</td>
						<td>Tot da pagare: 35&euro;</td>
					</tr>
				</table>


			</div>

		</div>


		<div class="modifica">

			<h1>Modifica</h1>

			<div class="modifica-dati">
				<li><a href="#">Nome</a></li>
				<li><a href="#">Cognome</a></li>
				<li><a href="#">Et&agrave</a></li>
				<li><a href="#">Telefono</a></li>
				<li><a href="#">Email</a></li>
				<li><a href="#">Sesso</a></li>
			</div>

		</div>

	</div>

	<footer>

	<p>Biblioteca Zacinto &#169; 2018</p>

	</footer>

</body>
</html>