package com.jsp.jdbc_callable_statement_crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class CollegeConnection {
	public static Connection getCollegeConnection() {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			String url="JDBC:MySQL://localhost:3306/jdbc-abc";
			String user="root";
			String pass="Rahul@2004";
			return DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
