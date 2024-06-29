package com.jsp.hibernate_one_to_many.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_one_to_many.dto.Student;
import com.jsp.hibernate_one_to_many.dto.Trainer;

public class StudentTrainerDao {
	EntityManager em=Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
	EntityTransaction et=em.getTransaction();
	public Trainer saveTrainerStudentDao(Trainer trainer) {
		try {
			et.begin();
			em.persist(trainer);
			et.commit();
			return trainer;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean deleteStudentById(int id) {
		Student student=em.find(Student.class, id);
		if(student!=null) {
			String deleteQuery="delete from trainer_student where st_id=?1";
			Query query=em.createNativeQuery(deleteQuery);
			query.setParameter(1, id);
			try {
			et.begin();
			int a=query.executeUpdate();
			em.remove(student);
			et.commit();
			return true;
				
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
		
	}
	public Trainer getTrainerStudentsByTrainerId(int id) {
		return em.find(Trainer.class, id);
	}
	public List<Trainer> getTrainerStudentsDao(){
		String sq="select s from Trainer s";
		Query query=em.createQuery(sq);
		List<Trainer> t=query.getResultList();
		for (Trainer trainer : t) {
			System.out.println(trainer);
		}
		return t;
	}
	
}