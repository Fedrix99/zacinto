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

import com.sun.crypto.provider.RSACipher;

import zacintoController.Prodotto;
import zacintoModel.ConnessioneMysql;

public class RisultatiRicerca extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html"); 
		String nextJSP ="/risultatiRicerca.jsp";

		Connection cn = null;
		ResultSet rs = null;

		Prodotto rscerca = new Prodotto();
		
		String cerca = req.getParameter("cerca");
	
//		String prodotto = "Nessun prodotto corrisponde alla ricerca.";
//		
//		req.setAttribute("nomeProdotto", prodotto);
		
		//query
		try {
			cn = ConnessioneMysql.dbconnect();
			rs = ConnessioneMysql.queryRs(cn, "SELECT * FROM `prodotti` WHERE nomeProdotto='"+ cerca +"'");
			rs.first();

			//Setto i valori del db
			rscerca.setId(rs.getInt("id"));
			rscerca.setNomeProdotto(rs.getString("nomeProdotto"));
			rscerca.setAutore(rs.getString("autore"));
			rscerca.setEta(rs.getInt("eta"));
			
			//Setto i valori degli attributi
			req.setAttribute("nomeProdotto", rscerca.getNomeProdotto());
			req.setAttribute("genere", rscerca.getGenere());
			req.setAttribute("autore", rscerca.getAutore());
			req.setAttribute("codice", rscerca.getId());

			req.setAttribute("prodotto", rscerca);



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//nextJSP="/risultatiRicerca.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
