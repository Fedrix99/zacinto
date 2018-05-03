<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style_login.css" rel="stylesheet" type="text/css">
<title>Zacinto Login</title>
</head>

<body>
<div class="conteiner">
		
		<div> 
		<a class="logo">
		
			<img src="img/BibliotecaZacintoTrasparente.png" alt="Biblioteca Zacinto" style="display: block; margin-left: auto;margin-right: auto;" height="75px"> </img>
		
		</a>	
			<div class="box-login">
			
				<form name="login" method="get" action="loginAccess" > <!-- Richiama la login access in cui ce il controllo -->


					<p> Email: <INPUT type=email name="email" class="form-control" placeholder="Email" required > </p>


					<p> Password: <INPUT type=password name="password" class="form-control" placeholder="Password" required> </p>
				
					<button type=SUBMIT > Login </button>
					
					<a href="http://localhost:8080/Zacinto/register">Crea un nuovo account</a>
				
				</form>	
		
			</div>
		
		</div>				
		
	</div>
	
	<footer>
	
		<p> Biblioteca Zacinto &#169; 2018 </p>
		
	</footer>

</body>
</html>