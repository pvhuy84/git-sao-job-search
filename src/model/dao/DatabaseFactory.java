package model.dao;

/**
 * @author NguyenBaAnh
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseFactory{
	static Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	
	public DatabaseFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//Connect database local
			String address = "jdbc:mysql://127.5.246.130:3306/jobsearch";
			connection = DriverManager.getConnection(address,"adminIy5t97I"," I2ILWARFIYyY");
			
			//Connect database local
//			String address = "jdbc:mysql://localhost:3306/jobsearch?useUnicode=true&characterEncoding=utf-8";
//			connection = DriverManager.getConnection(address,"root","");
		} catch (Exception e) {
			System.err.println("Error: "+e);
		}
	}

	public Connection getConnection() {
		return connection;
	}
	public void close() throws SQLException {
		if (statement != null) {
			statement.close();
		}
		if (preparedStatement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}

}
