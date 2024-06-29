package com.jsp.jdbc__bookstore.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc__bookstore.dao.StudentDao;
import com.jsp.jdbc__bookstore.dto.Student;

public class Register {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Student");
		System.out.println("Press 1 for BookSaller");
		int n=sc.nextInt();
		if(n==1) {
	        StudentDao dao=new StudentDao();
	        System.out.println("Enter the id, Name, Email, Phone, Address and Password");
	        int id1=sc.nextInt();
	        sc.nextLine();
	        String name1=sc.nextLine();
	        String email1=sc.nextLine();
	        long phone1=sc.nextLong();
	        sc.nextLine();
	        String address1=sc.nextLine();
	        String pass1=sc.nextLine();
	        System.out.println("Enter the id, Name, Email, Phone, Address and Password");
	        int id2=sc.nextInt();
	        sc.nextLine();
	        String name2=sc.nextLine();
	        String email2=sc.nextLine();
	        long phone2=sc.nextLong();
	        sc.nextLine();
	        String address2=sc.nextLine();
	        String pass2=sc.nextLine();
	        System.out.println("Enter the id, Name, Email, Phone, Address and Password");
	        int id3=sc.nextInt();
	        sc.nextLine();
	        String name3=sc.nextLine();
	        String email3=sc.nextLine();
	        long phone3=sc.nextLong();
	        sc.nextLine();
	        String address3=sc.nextLine();
	        String pass3=sc.nextLine();
	        Student s1=new Student(id1,name1,email1,phone1,address1,pass1);
	        Student s2=new Student(id2,name2,email2,phone2,address2,pass2);
	        Student s3=new Student(id3,name3,email3,phone3,address3,pass3);
	        List<Student> student=new ArrayList<Student>(Arrays.asList(s1, s2, s3));
	        dao.saveMultipleStudent(student);
		}
		else if(n==2) {
			
		}
		else {
			main(args);
		}
		sc.close();
	}
}