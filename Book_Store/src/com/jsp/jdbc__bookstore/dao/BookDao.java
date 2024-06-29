package com.jsp.jdbc__bookstore.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc__bookstore.connection.BookStoreConnection;
import com.jsp.jdbc__bookstore.dto.Book;

public class BookDao {
	Connection connection=BookStoreConnection.getBookStoreConnection();
	public List<Book>saveMultipleBook(List<Book> book2){
		try {
			CallableStatement cs=connection.prepareCall("call insertBooks(?,?,?,?)");
			for (Book book : book2) {
				cs.setInt(1, book.getId());
				cs.setString(2, book.getName());
				cs.setString(3, book.getAuthor());
				cs.setDouble(4, book.getPrice());
				cs.addBatch();
			}
			cs.executeBatch();
			return book2;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public void deleteBookById() {
		try {
			CallableStatement cs=connection.prepareCall("call deleteBookById(?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Id");
			int id1=sc.nextInt();
			cs.setInt(1, id1);
			int a=cs.executeUpdate();
			if(a==1) {
				System.out.println("Book is Deleted");
			}
			else {
				System.out.println("Given id not found!  Please Check Id.....");
			}
			sc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateBookPriceByName() {
		try {
			CallableStatement cs=connection.prepareCall("call updateBookPriceByName(?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name");
			String name1=sc.next();
			System.out.println("Enter the Price");
			double price1=sc.nextDouble();
			cs.setString(1, name1);
			cs.setDouble(2, price1);
			int a=cs.executeUpdate();
			if(a==1) {
				System.out.println("Book is Updated");
			}
			else {
				System.out.println("Given id not found!  Please Check Id.....");
			}
			sc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
