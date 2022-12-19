package project.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	public static Connection getConnection() throws SQLException {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/automatedStudentRegistration";
		
		try {
			conn = DriverManager.getConnection(url, "root", "485629");
		} 
		catch (SQLException e) {
			throw new SQLException(e.getMessage());
		}
		
		
		return conn;
	}
	

}
