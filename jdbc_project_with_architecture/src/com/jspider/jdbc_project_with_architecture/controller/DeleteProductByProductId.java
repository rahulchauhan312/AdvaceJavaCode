package com.jspider.jdbc_project_with_architecture.controller;

import com.jspider.jdbc_project_with_architecture.dao.ProductDao;

public class DeleteProductByProductId {
	public static void main(String[] args) {
		ProductDao Dao=new ProductDao();
	int a=	Dao.deleteProductByIdDao(124);
		if (a!=0) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Given Id not Found");
		}
	}
}
