package tw.alex.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC09 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/iii";
		Properties prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		
		String query = "INSERT INTO cust (name,tel,birthday)" + "VALUES (?,?,?)";
		
 		try (Connection conn = DriverManager.getConnection(url,prop);){
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "Alex");
			pstmt.setString(2, "0921414211");
			pstmt.setString(3, "1999-12-12");
			int result = pstmt.executeUpdate();
			System.out.println("OK:" + result);
			
			
			System.out.println("OK");
		}catch(SQLException e) {
			System.out.println(e);
		}

	}

}