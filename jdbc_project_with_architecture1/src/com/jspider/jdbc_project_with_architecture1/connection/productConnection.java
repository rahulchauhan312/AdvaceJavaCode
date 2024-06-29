package com.jspider.jdbc_project_with_architecture1.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.jspider.jdbc_project_with_architecture1.dto.product;
import com.mysql.cj.jdbc.Driver;

public class productConnection {
	//Connection connection=null;
	public static Connection getProductConnection( product p) {
		try {
			//step-1 Load or Register
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			//step-2 Create Connection
			String url="jdbc:mysql://localhost 3306/jdbc-abc:";
			String user="root";
			String pass="Rahul@2004";
			Connection connection=DriverManager.getConnection(url, user, pass);
			return connection;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		//
	}
}
