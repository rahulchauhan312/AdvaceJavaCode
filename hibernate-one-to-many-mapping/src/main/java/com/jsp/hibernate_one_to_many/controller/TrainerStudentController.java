package com.jsp.hibernate_one_to_many.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_one_to_many.dao.StudentTrainerDao;
import com.jsp.hibernate_one_to_many.dto.Student;
import com.jsp.hibernate_one_to_many.dto.Trainer;

public class TrainerStudentController {
	public static void main(String[] args) {
		StudentTrainerDao dao=new StudentTrainerDao();
		System.out.println("Press one For Insert Student And Trainer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch (n) {
		case 1: {
			Student s1=new Student(123, "rahul", "rahul@gmail.com", LocalDate.parse("2004-01-01"));
			Student s2=new Student(124, "akshay", "akshay@gmail.com", LocalDate.parse("2000-01-01"));
			List<Student> student=new ArrayList<Student>(Arrays.asList(s1,s2));
			Trainer trianer=new Trainer(51, "ansari", "ansari@gmail.com", 999999000, LocalDate.parse("1990-01-01"), "AdvanceJava", student);
			dao.saveTrainerStudentDao(trianer);
			break;
		}
		case 2:{
			dao.deleteStudentById(123);
			break;
		}
		case 3:{
			Trainer t=dao.getTrainerStudentsByTrainerId(51);
			//Student s=(Student) t.getSt();
			System.out.println(t);
			break;
		}
		case 4:{
			dao.getTrainerStudentsDao();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
}    
