package zacintoView;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import zacintoController.*;
import zacintoModel.ProdottoMysql;
import zacintoModel.RegisterMsql;

@SuppressWarnings("serial")
public class Prodotto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html"); 

		String nextJSP = "/credenziali_errore.jsp";
		//Prende la quantita dalla classe libro che è di tipo statico		
		
		HttpSession session = req.getSession();		
		session.getAttribute("quantita");
		
		if(Coke.controlloCookie(req) == true) {
				
			nextJSP = "/prodotto.jsp";

			// Richiama elecoprodotti in cui ce il while permette di STAMPARE
			try {
				ProdottoMysql stampaProdotto = new ProdottoMysql();
				req.setAttribute("nomeProdotto", stampaProdotto.elencoProdotti().get(0).getNomeProdotto());
				req.setAttribute("autore", stampaProdotto.elencoProdotti().get(0).getAutore());
				req.setAttribute("genere", stampaProdotto.elencoProdotti().get(0).getGenere());
				req.setAttribute("codice", stampaProdotto.elencoProdotti().get(0).getId());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}else {

			String erroremsn; // messaggio di errore
			erroremsn = "Per visualizzare la pagina del prodotto devi essere registrato.";
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
