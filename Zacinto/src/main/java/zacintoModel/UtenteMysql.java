package zacintoModel;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zacintoController.Utente;

public class UtenteMysql extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nome = null;
		String cognome = null;
		String email = null;
		String telefono = null;
		String sesso = null;
		String eta = null;
		
		Connection cn = null;
		ResultSet rs;
		
		try {
			cn = ConnessioneMysql.dbconnect();//connessioneDB
			
			rs = ConnessioneMysql.queryRs(cn, "SELECT * FROM `utenti`");//query

			Utente user = new Utente();

			user.setNome(rs.getString(nome));
			user.setCognome(rs.getString(cognome));	
			user.setEmail(rs.getString(email));
			user.setTelefono(rs.getString(telefono));
			user.setSesso(rs.getString(sesso));
			user.setEta(rs.getString(eta));
			
			req.setAttribute("userLog", user);


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}




}
