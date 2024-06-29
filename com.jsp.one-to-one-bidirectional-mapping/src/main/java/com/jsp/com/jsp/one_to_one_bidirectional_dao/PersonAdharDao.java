package com.jsp.com.jsp.one_to_one_bidirectional_dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.com.jsp.one_to_one_bidirectional_dto.Adhar;
import com.jsp.com.jsp.one_to_one_bidirectional_dto.Person;


public class PersonAdharDao {
	EntityManager em=Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
    EntityTransaction et=em.getTransaction();
	public Person savePresonAdhar(Person p, Adhar a) {
		try {
			et.begin();
			p.setAdhar(a);
			em.persist(p);
			//em.persist(a);
			et.commit();
			return p;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	}
	public Person getPersonAdharByPersonIdDao(int personid) {
		return em.find(Person.class, personid);
	}
	public boolean deletePersonByAdharId(int id) {
		try {
			Adhar adhar=em.find(Adhar.class, id);
			Person person=adhar.getPerson();
			et.begin();
			em.remove(person);
			et.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Adhar getPersonByAdhar(long id) {
		return em.find(Adhar.class, id);
	}
}