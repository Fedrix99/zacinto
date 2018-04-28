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
		
			java.sql.Connection cn = null;
			ResultSet rs;
			String sql;

			// Creo la connessione al database
			cn = ConnessioneMysql.dbconnect();
			

			sql = "SELECT * FROM utenti"; //prendo tabella
			

			// ________________________________query
			try {
				
				rs=ConnessioneMysql.query(cn, sql);
			//Scorre le colonne del DB finche trova colonne e aggiunge all'arraylist
				while (rs.next() == true) {
						
					Register UtenteOgg = new Register(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"),rs.getString("email"),rs.getString("telefono"),rs.getString("sesso"),rs.getString("password"),rs.getString("eta"));

					Utente.add(UtenteOgg);
					
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

	
