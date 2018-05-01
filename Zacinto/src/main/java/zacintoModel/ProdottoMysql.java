package zacintoModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import zacintoController.*;

public class ProdottoMysql {

	public static ArrayList<Prodotto> elencoProdotti() throws SQLException{
		
		ArrayList<Prodotto> Prodotto = new ArrayList<Prodotto>();

		Connection cn = null;
		ResultSet rs;
		
		// Creo la connessione al database
		cn = ConnessioneMysql.dbconnect();
		
		//query
		rs=ConnessioneMysql.queryRs(cn, "SELECT * FROM `prodotti`");
		
		// Aggiungo elementi della tabella all'arraylist
		try {
			while (rs.next() == true) {

				Prodotto ProdottoOgg = new Prodotto(rs.getInt("id"),rs.getString("nomeProdotto"),rs.getString("genere"),rs.getInt("eta"),rs.getString("autore"));

				Prodotto.add(ProdottoOgg);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		return Prodotto;
	}	
}
