package com.jsp.jdbc__bookstore.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.jsp.jdbc__bookstore.connection.BookStoreConnection;
import com.jsp.jdbc__bookstore.dto.Order;

public class OrderBookDao {
	Connection connection=BookStoreConnection.getBookStoreConnection();
	public List<Order>saveMultipleBook(List<Order> O2){
		try {
			CallableStatement cs=connection.prepareCall(" call insertOrderedBook(?,?,?)");
			for (Order order : O2) {
				cs.setInt(1, order.getId());
				cs.setLong(2, order.getPhone());
				cs.setString(3, order.getname());
				cs.addBatch();
			}
			cs.executeBatch();
			return O2;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
