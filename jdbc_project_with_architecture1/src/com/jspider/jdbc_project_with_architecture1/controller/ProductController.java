package com.jspider.jdbc_project_with_architecture1.controller;

import java.time.LocalDate;

import com.jspider.jdbc_project_with_architecture1.dao.productdao;
import com.jspider.jdbc_project_with_architecture1.dto.product;

public class ProductController {
	public static void main(String[] args) {
		productdao Dao=new productdao();
	    product p=new product(101,"marker","blue",30,LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-03"));
	}
}
