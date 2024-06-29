package com.jspider.jdbc_project2_with_architecture.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class EmployeeConnection {
	public static Connection getEmployeeConnection() {
		// Load or Register
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			// Create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc-abc";
			String userName = "root";
			String pass = "Rahul@2004";
			Connection connection = DriverManager.getConnection(url, userName, pass);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
