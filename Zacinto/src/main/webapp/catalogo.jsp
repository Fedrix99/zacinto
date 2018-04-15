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
		
		<img src="img/BibliotecaZacintoTrasparente.png" alt="Biblioteca Zacinto" style="display: block; margin-left: auto;margin-right: auto;" height="75px"> </img>
	
	</div>
	
	<div class="menu">
			
			<ul id="menu">
				<li><a href="http://localhost:8080/Zacinto/home">Home</a></li>
				<li><a href="http://localhost:8080/Zacinto/catalogo">Catalogo</a></li>
				<li><a href="http://localhost:8080/Zacinto/profilo">Profilo</a></li>
				<li><a href="http://localhost:8080/Zacinto/chi-siamo">Chi siamo?</a></li>
				<li><a href="http://localhost:8080/Zacinto/contatti">Contatti</a></li>
			</ul>
	</div>
	
	<div class="conteiner-catalogo">
		
		<div class="ricerca">

				<div class="campo-ricerca">
				<label for="s" class="hide">Cerca: </label>
				<input type="search" id="s" name="s" placeholder="Cerca nella biblioteca">
				<input type="submit" id="sub" name="sub" value="Cerca">
				</div>		
				
				<h2> Filtri: </h2>
				
				<div class="filtri">
				
					<li><a href="#">Genere</a></li>
					<li><a href="#">Autore</a></li>
					<li><a href="#">Età</a></li>

				
				</div>
				
		</div>
		
		<div class="prodotti">
		
			<h2> Libri </h2>
			
			<div class="prodotto_uno">
			
				<h2> Libri </h2>
				
			</div>
			
			<div class="prodotto_due">
			
				<h2> Libri </h2>
				
			</div>
			
			<div class="prodotto_tre">
			
				<h2> Libri </h2>
				
			</div>
			
			<div class="prodotto_quattro">
			
				<h2> Libri </h2>
				
			</div>
			
			<div class="prodotto_cinque">
			
				<h2> Libri </h2>
				
			</div>
			
			<div class="prodotto_sei">
			
				<h2> Libri </h2>
				
			</div>
			
		
		</div>		
		
	</div>
 
 <footer>
 
	<p> Biblioteca Zacinto &#169; 2018 </p>
	
 </footer>

</body>
</html>