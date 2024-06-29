package com.jsp.hibernat_one_to_one_mapping.dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernat_one_to_one_mapping.dto.Adhar;
import com.jsp.hibernat_one_to_one_mapping.dto.Person;

public class PersonAdharDao {
	EntityManager em=Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
    EntityTransaction et=em.getTransaction();
	public Person savePresonAdhar(Person p, Adhar a) {
		try {
			et.begin();
			em.persist(p);
			//em.persist(a);
			et.commit();
			return p;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	}
	public boolean deletePersonById(int id) {
		Person person=em.find(Person.class, id);
		if(person!=null) {
			et.begin();
			em.remove(person);
			et.commit();
			return true;
		}
		else {
			return false;
		}
	}
	public boolean deleteAdharByIdDao(int id) {
		Person person=getPerson(id);

		et.begin();
		Adhar adhar=person.getAdhar();
		person.setAdhar(null); 
		em.merge(person);
		if(adhar!=null) {
			em.remove(person);
			et.commit();
			return true;
		}
		else {
			return false;
		}
	}
	public Person getPerson(int id) {
		return em.find(Person.class, id);
	}
	public boolean updateAdharDobbyPersonId(long phone, LocalDate dob) {
		String query1="select p From Person p where p.phone=?1";
		Query query=em.createQuery(query1);
		query.setParameter(1, phone);		
		Person p=(Person) query.getSingleResult();
		int id=p.getId();
//        Person p1=em.find(Person.class, id);
        Adhar adhar=p.getAdhar();
		if(id!=0) {
			et.begin();
			adhar.setDob(dob);
			em.merge(adhar);
			et.commit();
			return true;   
		}
		else {
			return false;
		}
	}
}