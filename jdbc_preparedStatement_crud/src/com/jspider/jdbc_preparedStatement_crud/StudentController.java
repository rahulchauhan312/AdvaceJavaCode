package com.jspider.jdbc_preparedStatement_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class StudentController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection connection=null;
		//step1 Load or Register
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);  //Register Driver
			//step2 Create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc-abc";
			String userName = "root";
			String pass = "Rahul@2004";
			connection=DriverManager.getConnection(url, userName, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			System.out.println("Enter the Number According to Options");
			System.out.println("Press 1 for Insert");
			System.out.println("Press 2 for Display");
			System.out.println("Press 3 for Delete");
			System.out.println("Press 4 for Update");
			System.out.println("Press 5 for DisplayByID");
			System.out.println("Press 6 for DisplayAscOrderByName");
			System.out.println("Press 7 for DisplayAscOrderByEmail");
			System.out.println("Press 8 for Exit");
			int number = scanner.nextInt();
			switch (number) {
			case 1:
			{
				System.out.println("Enter student id");
				int id=scanner.nextInt();
				System.out.println("Enter student Name");
				String name=scanner.next();
				System.out.println("Enter student Email");
				String email=scanner.next();
				System.out.println("Enter student Phone");
				long phone=scanner.nextLong();
				System.out.println("Enter student DOB");
				String dob=scanner.next();
				LocalDate date=LocalDate.parse(dob);
				String InsertQuery="insert into student(id,name,email,phone,dob) values(?,?,?,?,?)";
				try {
					PreparedStatement ps=connection.prepareStatement(InsertQuery);
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setNString(3, email);
					ps.setLong(4, phone);
					ps.setString(5, dob);
					ps.execute();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			case 2:
			{
				
			}
			case 3:{
				System.out.println("enter student id to delete");
				int id = scanner.nextInt();
				String deleteQuery = "delete from student where id=?";

				try {
					PreparedStatement ps = connection.prepareStatement(deleteQuery);
					ps.setInt(1, id);
					int a = ps.executeUpdate();

					if (a == 1) {
						System.out.println("deleted");
					} else {
						System.out.println("id is not found...");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
				break;

			case 4:{
				System.out.println("enter student id to update dob");
				int id = scanner.nextInt();
				System.out.println("enter student new dob");
				//2013-10-03
				String dob = scanner.next();
				LocalDate date = LocalDate.parse(dob);
				String updateDobQuery = "update student set dob=? where id=?";
				try {
					PreparedStatement ps = connection.prepareStatement(updateDobQuery);
					ps.setInt(2, id);
					ps.setString(1, dob);

					int u=ps.executeUpdate();
					
					if(u!=0) {
						System.out.println("dob updated");
					}else {
						System.out.println("id not found...");
					}	
				} catch (SQLException e) {e.printStackTrace();}
			}
				break;

			}
			case 5: {
				
			}
			case 6: {
				
			}
			case 7: {
				
			}
			case 8: {
				System.out.println("Application is Terminated");
			}
			default:{
				System.out.println("Invalid Choice");
			}
			}
		}
	}
}
