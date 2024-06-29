package com.jsp.hibernate_crud_operation.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_crud_operation.dto.Student;

public class StudentDao {
	EntityManager em=Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
	EntityTransaction et=em.getTransaction();
	public Student saveStudentDao(Student s) {
		try {
		et.begin();
		em.persist(s);
		et.commit();
		return s;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Student getStudentById(int studentId){
	return em.find(Student.class, studentId);		
	}
	public Student getStudentByName(String name) {
		//JPQL Querry
		String nameQuery="select s from Student s where s.name=?1 ";
		Query query=em.createQuery(nameQuery);
		query.setParameter(1, name);
		try {
			return (Student)query.getSingleResult();
		} catch (Exception e) {
			System.err.println("Given name is not found");
			return null;
		}
	}
	public List<Student> getAllStudent(){
		String query1="from Student";
		Query query=em.createQuery(query1);
		List<Student> student=query.getResultList();
		return student;
	}
//	public void deleteStudentById(int id) {
//		String query1="delete s from Student s where s.name=?1";
//		Query query=em.createNamedQuery(query1);
//		query.setParameter(id, query);
//	}
	
}
