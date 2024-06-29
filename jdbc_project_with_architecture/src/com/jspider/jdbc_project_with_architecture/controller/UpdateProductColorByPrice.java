package com.jspider.jdbc_project_with_architecture.controller;

import com.jspider.jdbc_project_with_architecture.dao.ProductDao;

public class UpdateProductColorByPrice {
	public static void main(String[] args) {
		ProductDao Dao=new ProductDao();
		Dao.updateProductColorByPrice(40, "blue");
	}
}