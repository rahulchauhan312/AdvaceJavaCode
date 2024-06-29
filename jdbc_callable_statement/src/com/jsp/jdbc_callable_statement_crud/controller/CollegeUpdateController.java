package com.jsp.jdbc_callable_statement_crud.controller;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.jsp.jdbc_callable_statement_crud.connection.CollegeConnection;

public class CollegeUpdateController {
	public static void main(String[] args) {
		Connection connection=CollegeConnection.getCollegeConnection();
		try {
			CallableStatement call=connection.prepareCall(" call updateCollegeNameByCollegeId(?,?)");
			call.setInt(1, 123);
			call.setString(2, "Rohan");
			int a=call.executeUpdate();
			if(a==1) {
				System.out.println("Data Updated");
			}
			else {
				System.out.println("Given Id is not found");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
