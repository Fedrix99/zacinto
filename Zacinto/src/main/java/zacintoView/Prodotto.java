package zacintoView;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zacintoController.*;
import zacintoModel.ProdottoMysql;
import zacintoModel.RegisterMsql;

@SuppressWarnings("serial")
public class Prodotto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html"); 
				
		// Richiama elecoprodotti in cui ce il while permette di STAMPARE
		try {
			ProdottoMysql stampaProdotto = new ProdottoMysql();
			req.setAttribute("nomeProdotto", stampaProdotto.elencoProdotti().get(0).getNomeProdotto());
			req.setAttribute("autore", stampaProdotto.elencoProdotti().get(0).getAutore());
			req.setAttribute("romanzo", stampaProdotto.elencoProdotti().get(0).getGenere());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String nextJSP = "/prodotto.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
