package zacintoModel;

import java.sql.*;

public class ConnessioneMysql {
	public static Connection dbconnect() throws SQLException {
		
		Connection cn = null;
		
		String connessione;
		
		String sql;
		
		connessione="jdbc:mysql://localhost:1234/zacinto?user=root&password=";
		
		//Connection

				try {//Start try n catch

					Class.forName("com.mysql.jdbc.Driver");

				} catch (ClassNotFoundException e) {

					System.out.println("ClassNotFoundException: ");
					System.out.println(e.getMessage());

				}//End try n catch
						
				
				try {
					cn = DriverManager.getConnection(connessione);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//applicationdb is the name of DB
				return cn;

	}
	
	public static ResultSet query(Connection cn,String sql) throws SQLException {
		
		ResultSet rs;
		
		Statement st;
		
		st=cn.createStatement();
		
		rs=st.executeQuery(sql);
		
		return rs;
		
	}
	
	public static void queryUpdate(Connection cn, String sql) throws SQLException {
		Statement st;
		
		st = cn.createStatement();
		
		st.executeUpdate(sql);//Query to statement
		 
	}
	
}