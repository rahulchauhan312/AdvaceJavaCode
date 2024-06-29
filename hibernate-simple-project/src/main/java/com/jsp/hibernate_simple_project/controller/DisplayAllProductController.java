package com.jsp.hibernate_simple_project.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_simple_project.dto.Product;

public class DisplayAllProductController {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
		Query query=em.createQuery("from Product");
		List<Product> products=query.getResultList();
		for(Product product : products) {
			System.out.println(product);
		}
	}
}
