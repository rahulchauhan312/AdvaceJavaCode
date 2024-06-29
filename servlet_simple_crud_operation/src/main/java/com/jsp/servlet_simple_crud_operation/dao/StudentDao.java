package com.jsp.servlet_simple_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.servlet_simple_crud_operation.connection.StudentConnection;
import com.jsp.servlet_simple_crud_operation.dto.Student;

public class StudentDao {
    Connection connection=StudentConnection.getConnection();
	public  Student saveStudentDao(Student s) {
		String insertQuery ="insert into student(name, email, pass, degree, branch, gender) values(?, ?, ? ,?, ?, ?)";
		System.out.println(s);
		try {
			PreparedStatement ps=connection.prepareStatement(insertQuery);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getPass());
			ps.setString(4, s.getDegree());
			ps.setString(5, s.getBranch());
			ps.setString(6, s.getGender());             
			ps.execute();
			return s;
		} catch (Exception e) {
			e.printStackTrace();                                                            
			return null;
		}
	}
	
	public Student fetchStudentByEmailForLogin(String email) {
		
		String selectquery= "select * from student where email=?";
		try {
             PreparedStatement ps=connection.prepareStatement(selectquery);
            ps.setString(1, email);
            ResultSet rs= ps.executeQuery();
            rs.next();
            return new Student(rs.getString("email"),rs.getString("pass"));
		} catch (SQLException e) {
			e.printStackTrace();
			return null; 
		}
	}
}
 