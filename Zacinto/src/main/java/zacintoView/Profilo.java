package zacintoView;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zacintoController.Coke;
import zacintoController.Register; // Classe dell'altro pacchetto
import zacintoController.Utente;
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
		
		Utente u = (Utente) req.getAttribute("userLog");

		if(Coke.controlloCookie(req) == true) {
			
			//Provo a metere la query che prende i dati e li setto nel user log
			nextJSP = "/profilo.jsp";

			
		}else {
			
			String erroremsn; // messaggio di errore
			erroremsn = "Per visualizzare la pagina profilo devi essere registrato.";
			req.setAttribute("error", erroremsn);
			String pulsanteLogin;
			pulsanteLogin ="Login";
			req.setAttribute("textpulsante", pulsanteLogin);
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
