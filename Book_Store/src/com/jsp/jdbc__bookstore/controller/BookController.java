package com.jsp.jdbc__bookstore.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc__bookstore.dao.BookDao;
import com.jsp.jdbc__bookstore.dto.Book;

public class BookController {
	public static void main(String[] arg) {
		BookDao dao=new BookDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Insert Book");
		System.out.println("Press 2 for Delete Book");
		System.out.println("Press 3 for Update Book");
		int n=sc.nextInt();
		switch (n) {
		case 1: {
		    System.out.println("Enter the Id, BookName, Name and Price");
		    int id1=sc.nextInt();
		    sc.nextLine();
		    String BookName1=sc.nextLine();
		    String name1=sc.nextLine();
            double p1=sc.nextDouble();
		    System.out.println("Enter the Id, Name and Price");
		    int id2=sc.nextInt();
		    sc.nextLine();
		    String BookName2=sc.nextLine();
		    String name2=sc.nextLine();
		    double p2=sc.nextDouble();
		    System.out.println("Enter the Id, Name and Price");
		    int id3=sc.nextInt();
		    sc.nextLine();
		    String BookName3=sc.nextLine();
		    String name3=sc.nextLine();
		    double p3=sc.nextDouble();
	    	Book b1=new Book(id1,BookName1,name1,p1);
	    	Book b2=new Book(id2,BookName2,name2,p2);
	    	Book b3=new Book(id3,BookName3,name3,p3);
	    	List<Book> book=new ArrayList<Book>(Arrays.asList(b1, b2, b3));
    		dao.saveMultipleBook(book);
	    	System.out.println(book);
	    	break;
		}
		case 2: {
			dao.deleteBookById();
			break;
		}
		case 3: {
			dao.updateBookPriceByName();
			break;
		}
		default:
			System.out.println("Sorry....");
		}
	}
}
