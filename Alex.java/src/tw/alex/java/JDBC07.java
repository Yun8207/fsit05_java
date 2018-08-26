package tw.alex.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC07 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/iii";
		Properties prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		
		String del = "update cust set name = 'Tony', tel = '450' where id = '15'";
		
 		try (Connection conn = DriverManager.getConnection(url,prop);){
			Statement stmt = conn.createStatement();
			stmt.execute(del);
			
			System.out.println("OK");
		}catch(SQLException e) {
			System.out.println(e);
		}

	}

}