package com.jsp.hibernate_simple_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Product;

public class DeleteProductController {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("rahul_chauhan");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Product p=em.find(Product.class, 101);
		if(p!=null) {
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("Data deletd Successfully");
		}
		else{
			System.out.println("Id is not found");
		}
	}
}
