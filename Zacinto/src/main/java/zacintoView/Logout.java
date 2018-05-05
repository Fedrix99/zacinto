package zacintoView;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.SetSplitState;
import zacintoController.Coke;
import zacintoController.Utente;

public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nextJSP = null;
		Utente utentelog = new Utente();
		
		Coke.EliminaCookie(resp, "logCookie" );
		//Creo e distruggo la sessione e rimuovo il nome.
		HttpSession session = req.getSession();
		session.removeAttribute("nome");
		//Setto un valore vuoto per non fare vedere il nome Benvenuto ""
		session.setAttribute("nome", utentelog.getNome());
		
		String logoutmsn; // messaggio di errore
		logoutmsn = "Scollegamento effettuato correttamente.";
		req.setAttribute("error", logoutmsn);
		String textpulsante;
		textpulsante ="Vai al sito";
		req.setAttribute("textpulsante", textpulsante);
		
		
		nextJSP = "/logout.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
	
}
