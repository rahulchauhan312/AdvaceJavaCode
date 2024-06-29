package com.jsp.com.jsp.one_to_one_bidirectional_controller;

import java.time.LocalDate;
import java.util.Scanner;

import com.jsp.com.jsp.one_to_one_bidirectional_dao.PersonAdharDao;
import com.jsp.com.jsp.one_to_one_bidirectional_dto.Adhar;
import com.jsp.com.jsp.one_to_one_bidirectional_dto.Person;

public class PersonAdharController {
	public static void main(String[] args) {
		PersonAdharDao dao=new PersonAdharDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Save Person And Adhar");
		System.out.println("Press 2 for get Person Adhar By Person Id");
		int n=sc.nextInt();
		switch (n) {
		case 1:{
			Person person=new Person(1, "rahul", "rahul@gmail.com", 9999999990l, null);
			Adhar adhar=new Adhar(123456789012l, LocalDate.parse("2004-01-01"), "noida", "vinesh", person);
			dao.savePresonAdhar(person, adhar);
			break;
		}
		case 2:{
			Person person1=dao.getPersonAdharByPersonIdDao(1);
			System.out.println(person1);
			System.out.println(person1.getAdhar());
		}
		case 3:{
			dao.deletePersonByAdharId(1);
		}
		case 4:{
			Adhar adhar1=dao.getPersonByAdhar(123456789012l);
			System.out.println(adhar1);
			System.out.println(adhar1.getPerson());
		}
		default:
			break;
		}
	}
}
