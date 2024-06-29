package com.jsp.hibernate_many_to_one.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_many_to_one.dao.CollegeUniversityDao;
import com.jsp.hibernate_many_to_one.dto.College;
import com.jsp.hibernate_many_to_one.dto.University;

public class CollegeUniversityController {
	public static void main(String[] args) {
		CollegeUniversityDao dao=new CollegeUniversityDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for insert Student and College");
		int n=sc.nextInt();
		switch (n) {
		case 1: {
			University university=new University(102, "CCS", "Meerut");
			College college1=new College(2, "NGI", "Meerut", "Mechanical", university);
			College college2=new College(3, "APS", "Meerut", "Mechanical", university);
			College college3=new College(4, "SGPG", "Meerut", "Mechanical", university);
			List<College> college=new ArrayList<College>(Arrays.asList(college1, college2, college3));
			dao.saveCollegeUniversity(college);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
}
