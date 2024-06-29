package com.jsp.jdbc_callable_statement_crud.controller;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.jsp.jdbc_callable_statement_crud.connection.CollegeConnection;

public class CollegeDeletedById {
	public static void main(String[] args) {
		Connection connection=CollegeConnection.getCollegeConnection();
		try {
			CallableStatement cs=connection.prepareCall("call deleteCollegeById(?)");
			cs.setInt(1, 123);
			int a=cs.executeUpdate();
			if(a==1) {
				System.out.println("data deleted");
			}
			else {
				System.out.println("data not deleted");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
