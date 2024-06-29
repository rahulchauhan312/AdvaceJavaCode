package com.jsp.com.jsp.one_to_many_bidirectional.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.com.jsp.one_to_many_bidirectional.dao.TrainerStudentDao;
import com.jsp.com.jsp.one_to_many_bidirectional.dto.Student;
import com.jsp.com.jsp.one_to_many_bidirectional.dto.Trainer;

public class TrainerStudentController {
	public static void main(String[] args) {
		TrainerStudentDao dao=new TrainerStudentDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Store Data");
		int n=sc.nextInt();
		switch (n) {
		case 1:{
			Trainer t1=new Trainer(1, "ansari", "ansari@gmail.com", 9999999999l, LocalDate.parse("1990-09-09"), "AdvanceJava", null);
			Student st=new Student(12, "Rahul", "rahul@gmail.com", LocalDate.parse("2004-09-09"), t1);
			Student st1=new Student(13, "akshay", "akshay@gmail.com", LocalDate.parse("2004-09-01"), t1);
			List<Student> student= new ArrayList<Student>(Arrays.asList(st,st1));
			dao.saveStudentTrainerDao(t1, student);
			break;
		}
		case 2:{
			boolean b=dao.updateStudentEmail("rahul123@gmail.com", 12);
			                                   System.out.println("Updated");
		}
		default:
			break;
		}
	}
}
  