package zacintoView;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zacintoController.Coke;

public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nextJSP = null;
			
		Coke.EliminaCookie(resp, "logCookie" );
		
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
