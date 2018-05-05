package zacintoView;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import zacintoController.Coke;



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
		
		if(Coke.controlloCookie(req) == true) {
		
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
