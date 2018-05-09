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
import javax.servlet.http.HttpSession;

import zacintoModel.*;
import zacintoController.*;



@SuppressWarnings("serial")
public class LoginAccess extends HttpServlet {

	@SuppressWarnings("null")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html"); 
		
		String nextJSP = "/login.jsp";
		
		Connection cn = null;
		ResultSet rs;
		
		String email = null;
		String password = null;	
		email = req.getParameter("email");
		password = req.getParameter("password");
		
		Utente utentelog = new Utente();
		
		if(email != null && password != null) {

			try {
				cn = ConnessioneMysql.dbconnect();
				
				//query
				rs = ConnessioneMysql.queryRs(cn, "SELECT * FROM `utenti` WHERE email='"+ email +"' and password ='"+ password+"'");
				
				rs.first(); // fa controllo se la rs è piena
				
				//Setto i valori del db
				utentelog.setId(rs.getInt("id"));
				utentelog.setNome(rs.getString("nome"));
				utentelog.setCognome(rs.getString("cognome"));
				utentelog.setEmail(rs.getString("email"));
				utentelog.setTelefono(rs.getString("telefono"));
				utentelog.setEta(rs.getString("eta"));
				utentelog.setSesso(rs.getString("sesso"));
				
					//Creo il cookie
					Coke.CreaCookie(resp, "logCookie", "ZacintoCookie");
					
					//Creo e setto la sessione di ogni oggetto
					HttpSession session = req.getSession();
					session.setAttribute("id", utentelog.getId());
					session.setAttribute("nome", utentelog.getNome());
					session.setAttribute("cognome", utentelog.getCognome());
					session.setAttribute("email", utentelog.getEmail());
					session.setAttribute("telefono", utentelog.getTelefono());
					session.setAttribute("eta", utentelog.getEta());
					session.setAttribute("sesso", utentelog.getSesso());
				
					nextJSP = "/home.jsp";
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Connessione DB

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
