package com.jsp.hibernat_one_to_one_mapping.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernat_one_to_one_mapping.dao.PersonAdharDao;
import com.jsp.hibernat_one_to_one_mapping.dto.Adhar;
import com.jsp.hibernat_one_to_one_mapping.dto.Person;

public class PersonAdharController {
	public static void main(String[] args) {
		PersonAdharDao dao=new PersonAdharDao();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Press 1 for Save Person and Adhar");
		System.out.println("Press 2 for Delete Person By Id ");
		System.out.println("Press 3 for Delete Adhar By Id ");
		System.out.println();
		int n=sc.nextInt();
		switch (n) {
		case 1: {
			Adhar adhar=new Adhar(998989899, LocalDate.parse("2022-01-19"), "Noida", "vinesh");
			Person person =new Person(12, "rahul", "rahul@gmail.com", 999999990, adhar);
			Person p=dao.savePresonAdhar(person, adhar);
			
		   break;
		}
		case 2:{
			System.out.println("enter the id");
			int id=sc.nextInt();
			dao.deletePersonById(id);
			break;
		}
		case 3:{
			System.out.println("enter the Id");
			int id=sc.nextInt();
			dao.deleteAdharByIdDao(id);
			break;
		}
		case 4:{
			System.out.println("enter the Phone");
			long phone=sc.nextLong();
			dao.updateAdharDobbyPersonId(phone, LocalDate.parse("2003-01-19"));
			break;
		}
		case 5:{
			List<Person> person=dao.getAllPersonwithAdhar();
			for (Person person2 : person) {
				System.out.println(person2);
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
}
