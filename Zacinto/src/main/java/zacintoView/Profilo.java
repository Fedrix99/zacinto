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

@SuppressWarnings("serial")
public class Profilo extends HttpServlet {

	Connection cn = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html"); 
	
		String nextJSP = "/profilo.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
		
		
		//Settati i paramentri
		
		Register utente = new Register();
		
		utente.setNome(req.getParameter("nome"));

		utente.setCognome(req.getParameter("cognome"));

		utente.setEmail(req.getParameter("email"));  
		
		utente.setTelefono(req.getParameter("telefono"));

		utente.setSesso(req.getParameter("sesso"));

		utente.setPassword(req.getParameter("password"));

		utente.setEta(req.getParameter("eta"));
	



		// Richiama elecoutenti in cui ce il while
		RegisterMsql stampaUtenti = new RegisterMsql();
		
		try {
			req.setAttribute("prova", stampaUtenti.elencoUtenti());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
