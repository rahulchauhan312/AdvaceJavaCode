package com.jsp.com.jsp.one_to_many_bidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.com.jsp.one_to_many_bidirectional.dto.Student;
import com.jsp.com.jsp.one_to_many_bidirectional.dto.Trainer;

import net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher.ForGenericArray;

public class TrainerStudentDao {
	EntityManager em=Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
	EntityTransaction et=em.getTransaction();
	public List<Student> saveStudentTrainerDao(Trainer trainer, List<Student> students) {
		try {
			et.begin();
			for(Student student: students){
				em.persist(student);
			}
			et.commit();
			return students;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean updateStudentEmail(String email, int id) {
		try {
			Student student=em.find(Student.class, id);
			et.begin();
			student.setEmail(email);
			em.merge(student);
			et.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
