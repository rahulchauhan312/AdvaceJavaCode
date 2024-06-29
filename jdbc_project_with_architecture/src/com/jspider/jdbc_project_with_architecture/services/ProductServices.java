package com.jspider.jdbc_project_with_architecture.services;

import com.jspider.jdbc_project_with_architecture.dao.ProductDao;
import com.jspider.jdbc_project_with_architecture.dto.Product;

public class ProductServices {
	ProductDao Dao=new ProductDao();
	public Product saveProductServices(Product p) {
		if(p.getPrice()>=300) {
			return Dao.saveProductDao(p);
		}
		else {
			return null; 
		}
	}
}
