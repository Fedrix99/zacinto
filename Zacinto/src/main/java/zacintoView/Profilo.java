package zacintoView;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zacintoController.Register; // Classe dell'altro pacchetto
import zacintoModel.ConnessioneMysql;

@SuppressWarnings("serial")
public class Profilo extends HttpServlet {

	Connection cn = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html"); 

		//Settati i paramentri
		Register utente = new Register();

		utente.setNome(req.getParameter("nome"));

		utente.setCognome(req.getParameter("cognome"));

		utente.setEmail(req.getParameter("email"));  
		
		utente.setTelefono(req.getParameter("telefono"));

		utente.setSesso(req.getParameter("sesso"));

		utente.setPassword(req.getParameter("password"));

		utente.setEta(req.getParameter("eta"));

		System.out.println(utente.getNome() + utente.getCognome() +utente.getEmail()+ utente.getTelefono()+ utente.getSesso()+utente.getPassword()+utente.getEta());
		// Connessione al DB 
		try {
			cn = ConnessioneMysql.dbconnect();

			ConnessioneMysql.queryUpdate(cn, "INSERT INTO `Utenti` (`id`, `nome`, `cognome`, `email`, `telefono`, `sesso`, `password`, `eta`) VALUES (NULL, '"+ utente.getNome() +"', '"+ utente.getCognome() +"', '"+utente.getEmail()+"', '"+utente.getTelefono()+"', '"+utente.getSesso()+"', '"+utente.getPassword()+"', '"+utente.getEta()+"')");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		String nextJSP = "/profilo.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
