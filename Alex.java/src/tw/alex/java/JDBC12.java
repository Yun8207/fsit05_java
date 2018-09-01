package tw.alex.java;

import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JDBC12 extends JFrame {
	private JTable jTable;
	private int dataCount;
	private String[] fields;
	private ResultSet rs;
	private Connection conn;
	
	
	
	
	public JDBC12() {
		super("JDBC12");
		setLayout(new BorderLayout());
		
		initData();
		jTable = new JTable(new MyTableModel());
		jTable.setFont(new Font("", Font.BOLD, 16));
		JScrollPane jsp = new JScrollPane(jTable);
		add(jsp, BorderLayout.CENTER);
		
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initData() {

		
		String url = "jdbc:mysql://localhost/iii";
		Properties prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		
		String query = "SELECT * FROM gifts";
		
 		try {
 			conn = DriverManager.getConnection(url,prop);
 			
 			
			PreparedStatement pstmt0 = conn.prepareStatement("SELECT count(*) as count FROM gifts");
			ResultSet rs0 = pstmt0.executeQuery();
			rs0.next();
			dataCount = rs0.getInt("count");
			
			PreparedStatement pstmt = conn.prepareStatement(query,ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			rs = pstmt.executeQuery();
			
			ResultSetMetaData metadata = rs.getMetaData();
			fields = new String[metadata.getColumnCount()];
			for (int i=0; i<fields.length; i++) {
				fields[i] = metadata.getColumnLabel(i+1);
			}
//			String sql ="SELECT * FROM gifts";
//			Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
//			rs = stmt.executeQuery(sql);
//			rs.next();
//			System.out.println(rs.getString("account")+ ":" +rs.getString("realname"));
//			rs.updateString("realname", "Eric Chen");
//			rs.updateRow();

		}catch(SQLException e) {
			System.out.println(e);
		}
		
		
	}
	
	private class MyTableModel extends DefaultTableModel{
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return dataCount;
		}
		@Override
		public int getColumnCount() {
			return fields.length;
			//return super.getColumnCount();
		}
		
		@Override
		public String getColumnName(int column) {
			return fields[column];
		}
		
		@Override
		public Object getValueAt(int row, int column) {
			try {
				System.out.println(row);
				rs.absolute(row+1);
				return rs.getString(fields[column]);
			} catch (SQLException e) {
				return "---";
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new JDBC12();

	}

}
