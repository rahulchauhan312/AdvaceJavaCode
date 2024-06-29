package com.jsp.jdbc__bookstore.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc__bookstore.dao.OrderBookDao;
import com.jsp.jdbc__bookstore.dto.Order;

public class OrderBookController {
	public static void main(String[] args) {
	    OrderBookDao dao=new OrderBookDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Order Book by Id");
		int n=sc.nextInt();
		switch (n) {
		case 1: {
			System.out.println("Enter Book Name");
			String name1=sc.nextLine();
			System.out.println("Enter Book Name");
			String name2=sc.nextLine();
			System.out.println("Enter Book Name");
			String name3=sc.nextLine();
			Order b1=new Order(randomNo(), 98978900,name1);
			Order b2=new Order(randomNo(), 98978900,name2);
			Order b3=new Order(randomNo(), 98978900,name3);
	    	List<Order> book=new ArrayList<Order>(Arrays.asList(b1, b2, b3));
    		dao.saveMultipleBook(book);
	    	System.out.println(book);
	    	break;
		}
		default:
			System.out.println("Sorry!  Please Choose valid Option......");
		}
	}
	public static int randomNo() {
		int num=1000+(int)(Math.random()*(10000-1000));
		return num;
	}
}
