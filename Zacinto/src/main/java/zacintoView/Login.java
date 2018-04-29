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



import zacintoModel.*;
import zacintoController.*;
import zacintoController.Register;

@SuppressWarnings("serial")
public class Login extends HttpServlet {

	@SuppressWarnings("null")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html"); 
		String nextJSP;
		
		String email = null;
		String password = null;
		String emailTmp = null;
		String passwordTmp = null;
		
		Connection cn = null;
		
		ResultSet rsEmail;
		ResultSet rsPassword;
			
		email = req.getParameter("email");
		password = req.getParameter("password");
		
//		email = req.getParameter("email");
//		password = req.getParameter("password");
		
		System.out.println(""+req.getParameter("email")+password);
		
//		if(email != null && password != null) {
//					
//			
//
//		}else {
//			
//			try {
//				cn = ConnessioneMysql.dbconnect();
//				
//				rsEmail = ConnessioneMysql.queryRs(cn, "SELECT email FROM `utente` WHERE email='"+ email +"'");
//				rsPassword = ConnessioneMysql.queryRs(cn, "SELECT password FROM `utente` WHERE passsword='"+ password +"'");
//							
//				System.out.println(""+email+password);
//				
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} // Connessione DB
//			
//;
//		}
				
		nextJSP = "/login.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
	}

	private String setEmail(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}






}
