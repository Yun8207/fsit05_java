package tw.alex.java;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBC18 {

	public static void main(String[] args) {
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "root");
		try (Connection conn = 
				DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/iii", info);) {
			DatabaseMetaData metadata = conn.getMetaData();
			boolean isOK = metadata.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			
			System.out.println(isOK);
			
			String sql ="SELECT * FROM accounts WHERE id = 2";
			Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			System.out.println(rs.getString("account")+ ":" +rs.getString("realname"));
			rs.updateString("realname", "Eric Chen");
			rs.updateRow();
			
			String sql2 = "SELECT * FROM accounts";
			PreparedStatement pstmt = conn.prepareStatement(sql2, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				rs.updateString("password", "111111");
				rs.updateRow();
			}
			
			rs.moveToInsertRow();
			rs.updateString("account", "mary");
			rs.updateString("password", "222222");
			rs.updateString("realname", "Mary Ho");
			rs.insertRow(); //can't delete the inserted row
			
			System.out.println(rs.getRow());
			rs.previous();
			rs.deleteRow();
			
			rs.beforeFirst();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("account");
				System.out.println(id + ":" + name);
				//rs.deleteRow();//can delete all with the inserted row
			}
			rs.last();//the last before the inserted row
			rs.deleteRow();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
