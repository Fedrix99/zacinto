package zacintoView;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import zacintoModel.*;
import zacintoController.*;


@SuppressWarnings("serial")
public class LoginAccess extends HttpServlet {

	@SuppressWarnings("null")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html"); 
		String nextJSP;
		String email = null;
		String password = null;	
		Connection cn = null;
		ResultSet rs;


		email = req.getParameter("email");
		password = req.getParameter("password");

		if(email != null && password != null) {

			try {
				cn = ConnessioneMysql.dbconnect();
				
				//query
				rs = ConnessioneMysql.queryRs(cn, "SELECT * FROM `utenti` WHERE email='"+ email +"' and password ='"+ password+"'");
				rs.first();
					
				//Setto i parametri che passo per la sessione da loggato
				Utente user = new Utente();

				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setNome(rs.getString("nome"));

				
				//Qui ci passa tutto l'utente con TUTTI i dati
				req.setAttribute("userLog", user);

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Connessione DB


		}else {

			String erroremsn; // messaggio di errore
			erroremsn = "Email e Password errati riprovare.";
			req.setAttribute("error", erroremsn);
			nextJSP = "/credenziali_errore.jsp";

		}
		
		nextJSP = "/home.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}






}
