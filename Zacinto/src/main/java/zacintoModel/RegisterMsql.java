package zacintoModel;

import java.sql.*;
import java.util.ArrayList;

import zacintoController.Register;

public class RegisterMsql {

	public static ArrayList<Register> elencoUtenti() throws SQLException{

		ArrayList<Register> Utente = new ArrayList<Register>(); //Richiama la classe register del controller in cui ci sono gli attributi

		Connection cn = null;
		ResultSet rs;
		String sql;

		
		// Creo la connessione al database
		cn = ConnessioneMysql.dbconnect();


		sql = "SELECT * FROM `utenti`"; //prendo tabella


		// query
		try {

			rs=ConnessioneMysql.queryRs(cn, sql);
			//Scorre le colonne del DB finche trova colonne e aggiunge all'arraylist
			while (rs.next() == true) {

				Register UtenteOgg = new Register(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"),rs.getString("email"),rs.getString("telefono"),rs.getString("sesso"),rs.getString("password"),rs.getString("eta"));

				Utente.add(UtenteOgg);

			}

		} catch (SQLException e) {
			System.out.println("errore:" + e.getMessage());
		} // fine try-catch
		
		
		cn.close(); // chiusura connessione

		return Utente;

	}

}


