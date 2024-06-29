package com.jsp.jdbc.student.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class StudentConnection {
	public Connection getStudentConnection() {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			String url="";
			String user="root";
			String pass="Rahul@2004";
			return DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
