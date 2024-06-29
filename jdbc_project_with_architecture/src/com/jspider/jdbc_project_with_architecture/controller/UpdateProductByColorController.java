package com.jspider.jdbc_project_with_architecture.controller;

import com.jspider.jdbc_project_with_architecture.dao.ProductDao;

public class UpdateProductByColorController {
	public static void main(String[] args) {
		ProductDao Dao=new ProductDao();
	    Dao.updateProductByColor(200,"blue");
	}
}
