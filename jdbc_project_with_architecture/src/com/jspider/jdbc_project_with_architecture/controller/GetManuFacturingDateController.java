package com.jspider.jdbc_project_with_architecture.controller;

import com.jspider.jdbc_project_with_architecture.dao.ProductDao;
import com.jspider.jdbc_project_with_architecture.dto.Product;
/**
 * @author Rahul Chauhan
 */
public class GetManuFacturingDateController {
	public static void main(String[] args) {
		ProductDao Dao=new ProductDao();
		Product[] p=Dao.getProductByManufacturingfDateDao("2024-03-03");
	//	System.out.println(product);
		for (Product product2 : p) {
			if(product2==null) {
				break;
			}
			System.out.println(product2);
		}
		
	}
}