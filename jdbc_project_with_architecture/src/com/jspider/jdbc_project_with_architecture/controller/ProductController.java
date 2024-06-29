package com.jspider.jdbc_project_with_architecture.controller;

import java.time.LocalDate;

import com.jspider.jdbc_project_with_architecture.dto.Product;
import com.jspider.jdbc_project_with_architecture.services.ProductServices;
/**
 * @author Rahul Chauhan
 * 
 */
public class ProductController {

	public static void main(String[] args) {
		ProductServices services=new ProductServices();
		Product p=new Product(123,"marker",20,"blue",LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-03"));
		
		Product p1=services.saveProductServices(p);
		if(p1!=null) {
			System.out.println("Data Inserted");
		}
		else {
			System.out.println("Data not stored check your code or your product price... ");
		}
	}

}
