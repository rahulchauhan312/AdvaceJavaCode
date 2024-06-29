package com.jsp.hibernate_one_to_one_mapping.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_one_to_one_mapping.dao.EmployeeLaptop;
import com.jsp.hibernate_one_to_one_mapping.dto.Employee;
import com.jsp.hibernate_one_to_one_mapping.dto.Laptop;

public class EmployeeLaptopController {
	public static void main(String[] args) {
		EmployeeLaptop dao=new EmployeeLaptop();
		System.out.println("Press 1 for insert the Employee and Laptop Details");
		System.out.println("Press 2 for updater price By Employee id");
		System.out.println("Press 3 for delet Employee By Date of Joining");
		System.out.println("Press 4 for Display All Employees With laptop");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch (n) {
		case 1: {
			Laptop laptop=new Laptop(3, "G5", 55000, "Hp");
			Employee employee=new Employee(3, "lalu", LocalDate.parse("2025-01-01"), "lalu3@gmail.com", laptop);
			dao.saveEmployee(employee);
			break;
		}
		case 2:{
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			System.out.println("Enter new Price");
			double price=sc.nextDouble();
			dao.updateLaptopPriceByEmployeeId(id, price);
			break;
			}
		case 3:{
			dao.deleteEmployeeByDoj(LocalDate.parse("2025-01-01"));
			break;
		}
		case 4:{
			List<Employee> e1=dao.displayLaptopAndEmployee();
			for (Employee employee : e1) {
				System.out.println(employee);
			}
			break;
		}
		case 5:{
			System.out.println("enter id");
			int id=sc.nextInt();
			dao.deleteByLaptopId(id);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
}
