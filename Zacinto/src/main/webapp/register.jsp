<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style_login.css" rel="stylesheet" type="text/css">
<title> Zacinto Register</title>
</head>
<body>
<div class="conteiner-register">
		
		<div> 
		<a class="logo">
		
			<img src="img/BibliotecaZacintoTrasparente.png" alt="Biblioteca Zacinto" style="display: block; margin-left: auto;margin-right: auto;" height="75px"> </img>
		
		</a>	
			<div class="box-register">
			
				<form name="register" method="get" action="profilo" >


					<p> Nome: <INPUT type=text name="nome" > </p>
					
					<p> Cognome: <INPUT type=text name="cognome"> </p>

					<p> Email: <INPUT type=text name="email"> </p>
					
					<p> Telefono <INPUT type=text name="telefono"> </p>
					
					<p> Sesso <INPUT type=text name="sesso"> </p>
					
					<p> Et&agrave;: <INPUT type=text name="eta"> </p>
					
					<p> Password: <INPUT type=password name="password"> </p>
					
					<p> Ripeti Password: <INPUT type=password name="repeatPassword"> </p>	
					
					<button type=SUBMIT > Sign up </button>
				
				</form>	
		
			</div>
		
		</div>				
		
	</div>
	
	<footer>
	
		<p> Biblioteca Zacinto &#169; 2018 </p>
		
	</footer>
	
</body>
</html>