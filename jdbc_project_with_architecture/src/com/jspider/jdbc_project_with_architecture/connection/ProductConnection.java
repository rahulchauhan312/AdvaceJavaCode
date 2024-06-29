package com.jspider.jdbc_project_with_architecture.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver; 

public class ProductConnection {
	//Connection connection=null;
	public static Connection getProductConnection() {
		try {
			//step-1 load or register Driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);  //Register Driver
			//step2 Create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc-abc";
			String userName = "root";
			String pass = "Rahul@2004";
			Connection connection=DriverManager.getConnection(url, userName, pass);
			return connection;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
