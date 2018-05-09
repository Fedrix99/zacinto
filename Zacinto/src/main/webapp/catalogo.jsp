<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zacinto Catalogo</title>
<link href="css/style_catalogo.css" rel="stylesheet" type="text/css">
</head>
<body>

	<div class="logo">

		<img src="img/BibliotecaZacintoTrasparente.png"
			alt="Biblioteca Zacinto"
			style="display: block; margin-left: auto; margin-right: auto;"
			height="75px"> 

	</div>

	<div class="menu">

		<ul id="menu">
			<li><a href="http://localhost:8080/Zacinto/home">Home</a></li>
			<li><a href="http://localhost:8080/Zacinto/catalogo">Catalogo</a></li>
			<li><a href="http://localhost:8080/Zacinto/profilo">Profilo</a></li>
			<li><a href="http://localhost:8080/Zacinto/chisiamo">Chi
					siamo?</a></li>
			<li><a href="http://localhost:8080/Zacinto/contatti">Contatti</a></li>
		</ul>
	</div>

	<div class="conteiner-catalogo">

		<div class="ricerca">

			<div class="campo-ricerca">

					<form name="ricerca" method="get" action="risultatiricerca"> <label> Cerca</label> <input name="cerca" class="txt" size="20px" placeholder="Cerca nella Bilioteca"> <button type=SUBMIT > Invia </button></form> 
				
			</div>

			<h2>Filtri:</h2>

			<div class="filtri">

				<form action="">

					<br> <input type="checkbox" name="Genere" value="Genere" />
					Genere<br /> <br> <input type="checkbox" name="Autore"
						value="Autore" /> Autore<br /> <br> <input type="checkbox"
						name="Eta" value="Eta" /> Et&agrave; <br />

				</form>


			</div>

		</div>

		<div class="prodotti">

			<h2>Libri</h2>

			<div class="prodotto_uno">

				<h2>Libri</h2>
				<a href="prodotto">Paulu Piulu</a>
			</div>

			<div class="prodotto_due">

				<h2>Libri</h2>

			</div>

			<div class="prodotto_tre">

				<h2>Libri</h2>

			</div>

			<div class="prodotto_quattro">

				<h2>Libri</h2>

			</div>

			<div class="prodotto_cinque">

				<h2>Libri</h2>

			</div>

			<div class="prodotto_sei">

				<h2>Libri</h2>

			</div>


		</div>

	</div>

	<footer>

	<p>Biblioteca Zacinto &#169; 2018</p>

	</footer>

</body>
</html>