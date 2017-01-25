package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

	public Connection getConnection() throws ClassNotFoundException {
	     try {
	    	 Class.forName("com.mysql.jdbc.Driver");
	         return DriverManager.getConnection("jdbc:mysql://localhost/comp3","root", "");
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
}
