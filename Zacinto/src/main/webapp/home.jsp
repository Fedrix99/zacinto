<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="zacintoController.Utente"%>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style_home.css" rel="stylesheet" type="text/css">
<title>Zacinto Home</title>
</head>
<body>

	<div class="logo">

		<img src="img/BibliotecaZacintoTrasparente.png"
			alt="Biblioteca Zacinto"
			style="display: block; margin-left: auto; margin-right: auto;"
			height="75px"> </img>

	</div>

	<div class="menu"> <!-- Bottoni del menu --> 

		<ul id="menu">
			<li><a href="http://localhost:8080/Zacinto/home">Home</a></li>
			<li><a href="http://localhost:8080/Zacinto/catalogo">Catalogo</a></li>
			<li><a href="http://localhost:8080/Zacinto/profilo">Profilo</a></li>
			<li><a href="http://localhost:8080/Zacinto/chi-siamo">Chi
					siamo?</a></li>
			<li><a href="http://localhost:8080/Zacinto/contatti">Contatti</a></li>
		</ul>
	</div>

	<div class="conteiner-home">

		<div class="news"> <!-- Sezione news -->

			<h1>NEWS</h1>

			<div class="news_uno"> <!-- Blocchi -->

				<h2>Paulu Piulu</h2>
				<a href="prodotto">Paulu Piulu</a>
			</div>

			<div class="news_due">

				<h2>Nuova uscita</h2>

			</div>

			<div class="news_tre">

				<h2>Nuova uscita</h2>


			</div>

			<div class="news_quattro">

				<h2>Nuova uscita</h2>

			</div>

			<div class="news_cinque">

				<h2>Nuova uscita</h2>

			</div>


			<div class="news_sei">

				<h2>Nuova uscita</h2>


			</div>

			<div class="ultime_news"> <!-- Ultima ora -->

				<h2>Ultima ora</h2>
				<marquee behavior="slide" direction="left">Giorgio Morale ritorna in campo con: <a href="prodotto">Paulu Piulu</a>;	  Cosenga del progetto 10/05/2018;	 La Biblioteca Zacinto batte ogni record: 100.000 visitatori al giorno</marquee>

			</div>


		</div>

		<div class="link"> <!-- Sezione link -->

			<h2>LINK</h2>
			<div class="link_attivi">
				<li><a href="#">Dove siamo?</a></li>
				<li><a href="#"></a></li>
				<li><a href="#"></a></li>
			</div>

			<div>
						<!-- Sezione login,register -->
				<h1>
					Benvenuto <%=session.getAttribute("nome")%>
					<!-- Prende il nome dell'utente loggato -->
				</h1>

				<form name="login" method="get" action="login"> <!-- Pulsante login -->
					<button type=SUBMIT
						style="display: block; margin-left: auto; margin-right: auto; width: 100px;">
						Login</button>
				</form>

				<form name="register" method="get" action="register"> <!-- Pulsante register -->
					<button type=SUBMIT
						style="display: block; margin-left: auto; margin-right: auto; margin-top: 5px; width: 100px;">
						Register</button>
				</form>

			</div>


			<div>

				<h2>Arrivederci...</h2> <!-- Sezione logout -->

				<form name="logout" method="get" action="logout"> <!-- Pulsante logout -->
					<button type=SUBMIT
						style="display: block; margin: 0 auto; width: 100px;">
						Logout</button>
				</form>

			</div>
		</div>

	</div>

	<footer> <!-- Footer -->

	<p>Biblioteca Zacinto &#169; 2018</p>

	</footer>

</body>
</html>