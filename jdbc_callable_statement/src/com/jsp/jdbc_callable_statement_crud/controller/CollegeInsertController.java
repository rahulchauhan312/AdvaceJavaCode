package com.jsp.jdbc_callable_statement_crud.controller;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.jsp.jdbc_callable_statement_crud.connection.CollegeConnection;

public class CollegeInsertController {
	public static void main(String[] args) {
		Connection connection=CollegeConnection.getCollegeConnection();
		try {
			CallableStatement cs=connection.prepareCall("call insertCollege(?,?,?,?)");
			cs.setInt(1, 102);
			cs.setString(2, "Ramsingh");
			cs.setString(3, "Noida sec-15");
			cs.setString(4, "Engineering");
			cs.execute();
			System.out.println("data stored...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("data not stored please check your code....");
			e.printStackTrace();
		}
	}
}
