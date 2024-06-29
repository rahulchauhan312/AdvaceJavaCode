package com.jsp.jdbc__bookstore.connection;

import com.mysql.cj.jdbc.ConnectionGroup;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class BookStoreConnection  {
	public static ConnectionGroup getBookStoreConnection() {
		try {
			Driver driver=new Driver(); 
			DriverManager.registerDriver(driver);
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
