package com.jspider.jdbc_project2_with_architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jspider.jdbc_project2_with_architecture.connection.EmployeeConnection;
import com.jspider.jdbc_project2_with_architecture.dto.Employee;

public class EmployeeDao {
	Connection connection = EmployeeConnection.getEmployeeConnection();

	public Employee saveEmployeeDao(Employee E) {
		String insertQuery = "insert into employee (id,name,email,phone,salary) values(?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(insertQuery);
			ps.setInt(1, E.getId());
			ps.setString(2, E.getName());
			ps.setString(3, E.getEmail());
			ps.setInt(4, E.getPhone());
			ps.setDouble(5, E.getSalary());
			ps.execute();
			return E;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Update Salary which id is 234
	 */	
	public int updateEmployeeSalary(int Id, double salary) {
	    int a = 0;
	    String updateQuery = "update employee set salary=? where id=?";
	    try {
	        PreparedStatement ps = connection.prepareStatement(updateQuery);
	        ps.setDouble(1, salary); 
	        ps.setInt(2, Id); 
	        a = ps.executeUpdate();
	        return a;
	    } catch (Exception e2) {
	        // TODO: handle exception
	        e2.printStackTrace();
	        return 0;
	    }
	}
	/**
	 * Display All Data
	 */
	//public Employee[] getDisplayAllEmploye(Employee E) {
		
		
	//}
}
