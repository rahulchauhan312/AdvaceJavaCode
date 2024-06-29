package com.jsp.com.jsp.hibernate_many_to_many_mapping.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.com.jsp.hibernate_many_to_many_mapping.dao.StudentSubjectDao;
import com.jsp.com.jsp.hibernate_many_to_many_mapping.dto.Student;
import com.jsp.com.jsp.hibernate_many_to_many_mapping.dto.Subject;

public class StudentSubjectController {
	public static void main(String[] args) {
		StudentSubjectDao dao=new StudentSubjectDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for save Student and Subject");
		int n=sc.nextInt();
		switch (n) {
		case 1: {
			Subject subject1=new Subject(1, "Java", "James", LocalDate.parse("2002-12-09"), 400);
			Subject subject2=new Subject(2, "SQL", "F-Codds", LocalDate.parse("1990-09-09"), 200.00);
			List<Subject> subjects =new ArrayList<Subject>(Arrays.asList(subject1, subject2));
			Student student1 = new Student(12, "Rahul", "rahul@gmail.com", 999999000, subjects);
			Student student2 = new Student(13, "Akshay", "akshay12@gmail.com", 899999000, subjects);
			List<Student> student= new ArrayList<Student>(Arrays.asList(student1,student2));
			List<Student> student3=dao.saveStudentAndSubjectDao(student);
			String msg=(student3!=null) ? "Data Saved" : "Data not Saved";
		     System.out.println(msg);
			break;
		}
		case 2:{
			boolean b=dao.deleteSubjectByIdDao(1);
			String msg=b? "Deleted" : "Not Deleted";
			System.out.println(msg);
			break;
		}
		case 3:{
			List<Student> student=dao.getAllStudentndSubject();
			for (Student student2 : student) {
				System.out.println(student2);
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	
	}
}
