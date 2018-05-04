<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style_errore.css" rel="stylesheet" type="text/css">
<title>Zacinto Logout</title>
</head>
<body>

	<div class="logo">

		<img src="img/BibliotecaZacintoTrasparente.png"
			alt="Biblioteca Zacinto"
			style="display: block; margin-left: auto; margin-right: auto;"
			height="75px"> </img>

	</div>


	<div class="box-errore">

		<div class="foto-errore">

			<img src="img/SpuntaVerde.png" alt="Biblioteca Zacinto"
				style="display: block; margin-left: auto; margin-right: auto;"
				height="75px"> </img>

		</div>


		<p><%=request.getAttribute("error")%></p>

		<form action="home">

			<button><%=request.getAttribute("textpulsante")%></button>

		</form>

	</div>

	<footer>

	<p>Biblioteca Zacinto &#169; 2018</p>

	</footer>


	

</body>
</html>