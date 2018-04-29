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

@SuppressWarnings("serial")
public class Home extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html"); 
		String nextJSP;
		String email = null;
		String password = null;	
		String ps = null;
		String em = null;
		Connection cn = null;
		ResultSet rsEmail;
		ResultSet rsPassword;
		
		email = req.getParameter("email");
		password = req.getParameter("password");

		System.out.println("getParameter "+email+""+password);

		if(email == null && password == null) {

				nextJSP = "/credenziali_errore.jsp";

		}else {

			try {
				cn = ConnessioneMysql.dbconnect();

				rsEmail = ConnessioneMysql.queryRs(cn, "SELECT email FROM `utenti` WHERE email='"+ email +"'");
				rsPassword = ConnessioneMysql.queryRs(cn, "SELECT password FROM `utenti` WHERE password='"+ password +"'");

//				String emailX = rsEmail.getString(email);
//				String passX = rsPassword.getString(password);
				
//				while (rsEmail.next() == true && rsPassword.next() == true) {
//
//					em= rsEmail.getString("email");
//
//					ps = rsPassword.getString("password");
//
//				}
				System.out.println("Resultset"+rsEmail+""+rsPassword);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Connessione DB

			
		}

		nextJSP = "/home.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
