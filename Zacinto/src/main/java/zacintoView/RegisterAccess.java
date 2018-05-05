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

import zacintoController.Coke;
import zacintoController.Register;
import zacintoController.Utente;
import zacintoModel.ConnessioneMysql;
import zacintoModel.RegisterMsql;

public class RegisterAccess extends HttpServlet {

	private ResultSet rs;

	@SuppressWarnings("null")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nextJSP;
		
		ResultSet rs = null;
		Connection cn = null; 
		
		Utente utenteReg = new Utente();
		
		
		Utente utente = new Utente();
				
		utente.setNome(req.getParameter("nome"));
		utente.setCognome(req.getParameter("cognome"));
		utente.setEmail(req.getParameter("email"));
		utente.setTelefono(req.getParameter("telefono"));
		utente.setSesso(req.getParameter("sesso"));
		utente.setPassword(req.getParameter("password"));
		utente.setEta(req.getParameter("eta"));

		String pss = req.getParameter("password");
		String rps = req.getParameter("repeatPassword");
		String email = req.getParameter("email");
		
		if (pss.equals(rps)) {

			try {
				cn = ConnessioneMysql.dbconnect();// Connessione al db

				ConnessioneMysql.queryUpdate(cn,//INVIA I DATI PER REGISTRARE UN NUOVO UTENTE
						"INSERT INTO `Utenti` (`id`, `nome`, `cognome`, `email`, `telefono`, `sesso`, `password`, `eta`) VALUES (NULL, '"
								+ utente.getNome() + "', '" + utente.getCognome() + "', '" + utente.getEmail() + "', '"
								+ utente.getTelefono() + "', '" + utente.getSesso() + "', '" + utente.getPassword()
								+ "', '" + utente.getEta() + "')");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {//Prendo i dati dell'utente appena inseriti aiutandomi con il parametro email appena inserito
				rs = ConnessioneMysql.queryRs(cn, "SELECT * FROM `utenti` WHERE email='"+email+"'");
				rs.first(); //Controllo se la resultset è valida
								
				utenteReg.setId(rs.getInt("id"));
				utenteReg.setNome(rs.getString("nome"));
				utenteReg.setCognome(rs.getString("cognome"));
				utenteReg.setEmail(rs.getString("email"));
				utenteReg.setTelefono(rs.getString("telefono"));
				utenteReg.setEta(rs.getString("eta"));
				utenteReg.setSesso(rs.getString("sesso"));
				
				//Creo cookie
				Coke.CreaCookie(resp, "logCookie", "ZacintoCookie");
				
				//Creo e setto la sessione di ogni oggetto
				HttpSession session = req.getSession();
				session.setAttribute("id",utenteReg.getId());
				session.setAttribute("nome", utenteReg.getNome());
				session.setAttribute("cognome", utenteReg.getCognome());
				session.setAttribute("email", utenteReg.getEmail());
				session.setAttribute("telefono", utenteReg.getTelefono());
				session.setAttribute("eta", utenteReg.getEta());
				session.setAttribute("sesso", utenteReg.getSesso());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				

			

			
			nextJSP = "/profilo.jsp";

		} else {

			String erroremsn; // messaggio di errore
			erroremsn = "Le due password non corrispondono.";
			req.setAttribute("error", erroremsn);
			String pulsanteRiprova;
			pulsanteRiprova = "Riprova";
			req.setAttribute("textpulsante", pulsanteRiprova);
			nextJSP = "/credenziali_errore.jsp";

		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
