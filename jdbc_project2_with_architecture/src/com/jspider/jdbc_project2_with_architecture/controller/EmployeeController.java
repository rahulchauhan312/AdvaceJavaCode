package com.jspider.jdbc_project2_with_architecture.controller;

import java.util.Scanner;

import com.jspider.jdbc_project2_with_architecture.dao.EmployeeDao;
import com.jspider.jdbc_project2_with_architecture.dto.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeDao Dao=new EmployeeDao();
		System.out.println("Select one Number to perform the Task");
		System.out.println("Press 1 for insert new Employee Details");
		System.out.println("Press 2 for update Employee Salary");
		System.out.println("Press 3 for Display All By Name");
		System.out.println("Press 4 for Delete Employee whose Salary is>40000 ");
		System.out.println("Press 5 for Count how manmy Salary is>2000");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch (n) {
		case 1: {
			Employee E=new Employee(106,"rohan","rohan@gmail.com",999000000,19900.00);
			Dao.saveEmployeeDao(E);
			break;
		}
		case 2: {
			int a=Dao.updateEmployeeSalary(123, 56000);
			if(a==1) {
				System.out.println("updated Salary");
			}
			else {
				System.out.println("given Id is not found");
			}
			break;
		}
		default:
			System.out.println("Sorry! Invalid Choice...");
		}
		sc.close();
	}
}
