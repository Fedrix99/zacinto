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
import zacintoModel.RegisterMsql;

/**
 * @author Federico Amendolagine
 *
 */
@SuppressWarnings("serial")
public class Profilo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html"); 
		String nextJSP;
		Register utente = new Register();

		utente.setNome(req.getParameter("nome"));

		utente.setCognome(req.getParameter("cognome"));

		utente.setEmail(req.getParameter("email"));  

		utente.setTelefono(req.getParameter("telefono"));

		utente.setSesso(req.getParameter("sesso"));

		utente.setPassword(req.getParameter("password"));

		utente.setEta(req.getParameter("eta"));
		
		String pss = req.getParameter("password");
		String rps = req.getParameter("repeatPassword");

		if(pss.equals(rps)) {

			
			Connection cn = null;
			// Connessione al DB INVIA I DATI PER REGISTRARE UN NUOVO UTENTE
			try {
				cn = ConnessioneMysql.dbconnect();

				ConnessioneMysql.queryUpdate(cn, "INSERT INTO `Utenti` (`id`, `nome`, `cognome`, `email`, `telefono`, `sesso`, `password`, `eta`) VALUES (NULL, '"+ utente.getNome() +"', '"+ utente.getCognome() +"', '"+utente.getEmail()+"', '"+utente.getTelefono()+"', '"+utente.getSesso()+"', '"+utente.getPassword()+"', '"+utente.getEta()+"')");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Richiama elecoutenti in cui ce il while permette di STAMPARE
			try {
				RegisterMsql stampaUtenti = new RegisterMsql();
				req.setAttribute("nome", stampaUtenti.elencoUtenti().get(0).getNome());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			nextJSP = "/profilo.jsp";
			

		}else{
			
			String erroremsn; // messaggio di errore
			erroremsn = "Le due password non corrispondono.";
			req.setAttribute("error", erroremsn);
			nextJSP = "/credenziali_errore.jsp";
			
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
