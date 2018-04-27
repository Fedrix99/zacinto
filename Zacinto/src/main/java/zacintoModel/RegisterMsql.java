package zacintoModel;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import zacintoController.Register;

public class RegisterMsql {

	public static ArrayList<Register> elencoUtenti() throws SQLException{
		
			ArrayList<Register> Utente = new ArrayList<Register>();
		
		
			Connection cn;
			Statement st;
			ResultSet rs;
			String sql;
			
			// ________________________________connessione
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			} // fine try-catch

			// Creo la connessione al database
			cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/zacinto?user=root&password=");
			// zacinto è il nome del database

			sql = "SELECT nome,cognome,email,telefono,sesso,password,eta;"; //prendo tabella
			
			// ________________________________query
			try {
				st = (Statement) cn.createStatement(); // creo sempre uno statement sulla
											// connessione
				rs = st.executeQuery(sql); // faccio la query su uno statement
				while (rs.next() == true) {
					
					//nome classe con le variabili
//					Register a = new Register(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"),
//							rs.getString("email"),rs.getString("telefono"),rs.getString("sesso"),
//							rs.getString("password"),rs.getString("eta"));
//					
				}
			} catch (SQLException e) {
				System.out.println("errore:" + e.getMessage());
			} // fine try-catch
			cn.close(); // chiusura connessione
			
			return elencoUtenti();
			
		}// fine main
		
	
	public static void main(String[] args) {
		
		System.out.println("RegisterMsql.Utente");
		
	}
		
}

	
