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

import zacintoModel.ConnessioneMysql;

public class RisultatiRicerca extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html"); 
		String nextJSP;
		
//		Connection cn = null;
//		ResultSet rs = null;
//		
//		String cerca = req.getParameter("cerca");
//		System.out.println(""+cerca);
//		//query
//		try {
//			cn = ConnessioneMysql.dbconnect();
//			rs = ConnessioneMysql.queryRs(cn, "SELECT * FROM `prodotti` WHERE nomeProdotto='"+ cerca +"'");
//			rs.first();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		nextJSP="/risultatiRicerca.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
