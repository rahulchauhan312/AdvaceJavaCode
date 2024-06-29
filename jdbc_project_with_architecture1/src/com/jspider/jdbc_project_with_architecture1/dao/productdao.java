package com.jspider.jdbc_project_with_architecture1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jspider.jdbc_project_with_architecture1.connection.productConnection;
import com.jspider.jdbc_project_with_architecture1.dto.product;

public class productdao {
	private Object product;
	Connection connection=productConnection.getProductConnection(product);
	public product getProductDao() {
		String insertQuery="insert into product(id,name,color,price,mfd,expd)";
		try {
			PreparedStatement prepared=connection.prepareStatement(insertQuery);
			prepared.setInt(1,p.getId());
			prepared.setString(2,p.getName());
			prepared.setDouble(3,p.getPrice());
			prepared.setString(4,p.getColor());
			prepared.setObject(5,p.getMfd());
			prepared.setObject(6,p.getExpd());
			prepared.execute();
	        return prepared; 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
