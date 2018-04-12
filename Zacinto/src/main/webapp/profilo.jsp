<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style_profilo.css" rel="stylesheet" type="text/css">
<title>Profilo</title>
</head>
<body>
	<div class="logo">
		
		<img src="img/BibliotecaZacintoTrasparente.png" alt="Biblioteca Zacinto" style="display: block; margin-left: auto;margin-right: auto;" height="75px"> </img>
	
	</div>
	
	<div class="menu">
			
			<ul id="menu">
				<li><a href="#">Home</a></li>
				<li><a href="#">Catalogo</a></li>
				<li><a href="#">Profilo</a></li>
				<li><a href="#">Chi siamo?</a></li>
				<li><a href="#">Contatti</a></li>
			</ul>
	</div>
	
	<div class="conteiner-profilo">
		
		<div class="welcome">
			
			<h1> Welcome, common name! </h1>
			
			<div class="dati">
			
				<table>
					<tr><td>Nome: Mario</td><td>Telefono: 3342939456</td><td>Età: 29</td></tr>
					<tr><td>Cognome: Rossi</td><td>Sesso: Uomo</td><td>Email: marietto@gmail.com</td></tr>
				</table>
			
			</div>
		
					
		<div class="prestiti">
			
			<h1> Prestiti </h1>
			
			<table>
				<tr><td>Data ritiro: 10/03/2018</td><td>Data scandeza: 10/04/2018</td><td>Stato: Non ritardo</td></tr>
				<tr><td>Data ritiro: 10/02/2018</td><td>Data scandeza: 10/03/2018</td><td>Stato: Ritardo</td></tr>
			</table>
				
		
		</div>
		
		<div class="penali">
			
			<h1> Penali </h1>
			
			<table>
				<tr><td>Penale in data 10/02/2018</td><td>Problema: Consegna in ritardo</td><td>Tot da pagare: 50€</td></tr>
			</table>
				
		
		</div>
		
		</div>

		
		<div class="modifica">
			
			<h1> Modifica </h1>
			
				<div class="modifica-dati">
					<li><a href="#">Nome</a></li>
					<li><a href="#">Cognome</a></li>
					<li><a href="#">Età</a></li>
					<li><a href="#">Telefono</a></li>
					<li><a href="#">Email</a></li>
					<li><a href="#">Sesso</a></li>
				</div>
			
		</div>
		
	</div>
 
 <footer>
 
	<p> Biblioteca Zacinto &#169; 2018 </p>
	
 </footer>

</body>
</html>