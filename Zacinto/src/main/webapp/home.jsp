<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="zacintoController.Utente"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style_home.css" rel="stylesheet" type="text/css">
<title>Zacinto Home</title>
</head>
<body>
	<!-- Devo importare: <@ page import="zacintoController.Utente"%> -->
	<%
		Utente u = (Utente) request.getAttribute("userLog");
		
	%>
	<!-- Prende la variabile nella login access -->

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

	<div class="conteiner-home">

		<div class="news">

			<h1>NEWS</h1>

			<div class="news_uno">

				<h2>Nuova uscita</h2>

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

			<div class="ultime_news">

				<h2>Ultima ora</h2>
				<marquee behavior="slide" direction="left">HTML slide-in
					text...</marquee>

			</div>


		</div>

		<div class="link">

			<h2>LINK</h2>
			<div class="link_attivi">
				<li><a href="#">Dove siamo?</a></li>
				<li><a href="#"></a></li>
				<li><a href="#"></a></li>
			</div>

			<div>

				<%
					if (u != null) {
				%>
				<!-- Quando sei loggato: -->
				<h1>
					Benvenuto,<%=u.getNome()%>
					<!-- Prende il nome dell'utente loggato -->
				</h1>
				<%
					} else {
				%>
				<!-- Quando non sei loggato: -->
				<h1>Benvenuto</h1>
				<%
					}
				%>


				<form name="login" method="get" action="login">
					<button type=SUBMIT
						style="display: block; margin-left: auto; margin-right: auto; width: 100px;">
						Login</button>
				</form>

				<form name="register" method="get" action="register">
					<button type=SUBMIT
						style="display: block; margin-left: auto; margin-right: auto; margin-top: 5px; width: 100px;">
						Register</button>
				</form>

			</div>


			<div>
				<%
					if (u != null) {
				%>
				<h2>Arrivederci...</h2>

				<form name="logout" method="get" action="logout">
					<button type=SUBMIT
						style="display: block; margin: 0 auto; width: 100px;">
						Logout</button>
				</form>
				<%
					} else {
				%>

				<% } %>
			</div>
		</div>

	</div>

	<footer>

	<p>Biblioteca Zacinto &#169; 2018</p>

	</footer>

</body>
</html>