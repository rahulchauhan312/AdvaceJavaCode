package com.jsp.com.jsp.hibernate_many_to_many_mapping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.com.jsp.hibernate_many_to_many_mapping.dto.Student;
import com.jsp.com.jsp.hibernate_many_to_many_mapping.dto.Subject;

public class StudentSubjectDao {
	EntityManager em=Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
	EntityTransaction et=em.getTransaction();
	public List<Student> saveStudentAndSubjectDao(List<Student> students){
		try { 
			et.begin();
			for (Student student : students) {
				em.persist(student);
			}
			et.commit();
			return students;
		} catch (Exception e) {
			e.printStackTrace();
		    return null;	
		}
		
	}
	public boolean deleteSubjectByIdDao(int subjectid) {
		try {
			Subject subject=em.find(Subject.class, subjectid);
		    String selectQuery="delete from student_subject where subject_id=?1";
		    em.createNativeQuery(selectQuery).setParameter(1,subjectid).executeUpdate() ;
		    et.begin();
		    em.remove(subject);
		    et.commit();
		    return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public List<Student> getAllStudentndSubject(){
		String selectQuery="select s from Student s";
		try {
			Query query=em.createQuery(selectQuery);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}