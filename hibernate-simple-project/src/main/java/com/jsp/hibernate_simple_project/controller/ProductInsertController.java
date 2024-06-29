package com.jsp.hibernate_simple_project.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Product;

public class ProductInsertController {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("rahul_chauhan");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Product product = new Product(102, "mobile", "black", LocalDate.parse("2024-09-19"), LocalDate.parse("2028-09-19"), 32000);
		et.begin();
		em.persist(product);
		et.commit();
	}
}
