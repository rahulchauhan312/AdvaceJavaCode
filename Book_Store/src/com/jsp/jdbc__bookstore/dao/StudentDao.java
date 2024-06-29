package com.jsp.jdbc__bookstore.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.jsp.jdbc__bookstore.connection.BookStoreConnection;
import com.jsp.jdbc__bookstore.dto.Student;

public class StudentDao {
	Connection connection=BookStoreConnection.getBookStoreConnection();
    public 	List<Student> saveMultipleStudent(List<Student> r){
    	try { 
			CallableStatement cs=connection.prepareCall("(call insertStudent(?,?,?,?,?,?))");
			for (Student student : r) {
				cs.setInt(1, student.getId());
				cs.setString(2, student.getName());
				cs.setString(3, student.getEmail());
				cs.setLong(4, student.getPhone());
				cs.setString(5, student.getAddress());
				cs.setString(6, student.getPass());
				cs.addBatch();
			}
			cs.executeBatch();
			return r;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
    }
    
}