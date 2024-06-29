package com.jsp.servlet_simple_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class StudentConnection {
    public static Connection getConnection() {
    	try {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			String url="JDBC:MySQL://localhost:3306/book_store";
			String user="root";
			String pass="Rahul@2004";
			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return null;
		}
    }
}
