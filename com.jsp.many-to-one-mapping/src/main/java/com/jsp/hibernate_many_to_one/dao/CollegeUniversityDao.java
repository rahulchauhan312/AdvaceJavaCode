package com.jsp.hibernate_many_to_one.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one.dto.College;
import com.jsp.hibernate_many_to_one.dto.University;

public class CollegeUniversityDao {
	EntityManager em=Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
	EntityTransaction et=em.getTransaction();
	public List<College> saveCollegeUniversity(List<College> college ) {
		try {
			et.begin();
			for (College college2 : college) {
				em.persist(college2);
			}
			et.commit();
			return college;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
