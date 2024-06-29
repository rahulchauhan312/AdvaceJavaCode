package com.jsp.hibernate_crud_operation.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_crud_operation.dao.StudentDao;
import com.jsp.hibernate_crud_operation.dto.Student;
import com.jsp.hibernate_crud_operation.exception.IdNotFoundException;

public class StudentControlle {
	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Insert Student");
		System.out.println("Press 2 for fetch Student By Id");
		System.out.println("Press 3 for fetch Student By Name");
		System.out.println("Press 4 for Fetch AllStudent");
		int n=sc.nextInt();
		switch (n) {
		case 1: {
			System.out.println("enter the Id");
			int id=sc.nextInt();
			System.out.println("enter the Name");
			String name=sc.next();
			System.out.println("enter the Email");
			String email=sc.next();
			System.out.println("enter the phone");
			long phone=sc.nextLong();
			Student student=new Student(id, name, email, phone);
			dao.saveStudentDao(student);
			break;
		}
		case 2:{
			System.out.println("enter the Id");
			int n1=sc.nextInt();
			Student student=dao.getStudentById(n1);
			if(student!=null) {
				System.out.println(student);
			}else {
				try {
				throw new IdNotFoundException("given id is not found");
					
				} catch (IdNotFoundException e) {
					e.printStackTrace();
				} 
			}
			break;
		}
		case 3:{
			System.out.println("enter the Name");
			String name=sc.next();
			Student student=dao.getStudentByName(name);
			if(student!=null) {
				System.out.println(student);
			}
			else {
				try {
					throw new IdNotFoundException("given name is not found");
				} catch (IdNotFoundException e) {
					e.printStackTrace();
				}
			}
			break;
			
		}
		case 4:
		    List<Student> s=dao.getAllStudent();
		    for (Student student1 : s) {
		    	System.out.println(student1);
				
			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
}
