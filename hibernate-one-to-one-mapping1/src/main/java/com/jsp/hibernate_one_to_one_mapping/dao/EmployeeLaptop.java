package com.jsp.hibernate_one_to_one_mapping.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_one_to_one_mapping.dto.Employee;
import com.jsp.hibernate_one_to_one_mapping.dto.Laptop;

public class EmployeeLaptop {
	EntityManager em = Persistence.createEntityManagerFactory("rahul_chauhan").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public Employee saveEmployee(Employee e) {
		try {
			et.begin();
			em.persist(e);
			et.commit();
			return e;
		} catch (Exception e2) {
			e2.printStackTrace();
			return null;
		}
	}

	public boolean updateLaptopPriceByEmployeeId(int id, double Price) {
		try {
			Employee e1 = em.find(Employee.class, id);
			if (e1 != null) {
				Laptop l1 = e1.getLaptop();
				double price1 = l1.getPrice();
				et.begin();
				l1.setPrice(Price);
				em.merge(e1);
				et.commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteByLaptopId(int id) {
		String selectQuery = "select * from Employee where laptop_id=?1 ";
		Query query = em.createNativeQuery(selectQuery);
		query.setParameter(1, id);
		
		Employee e1 = (Employee) query.getSingleResult();
		
		try {
		 // Laptop l1=em.find(Laptop.class, id);
		  et.begin();
		  e1.setLaptop(null);
		  em.remove(e1);
		  return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteEmployeeByDoj(LocalDate date) {
		try {
			String selectQuery = "select s from Employee s where s.doj=?1";
			Query query = em.createQuery(selectQuery);
			query.setParameter(1, date);
			Employee e1 = (Employee) query.getSingleResult();
			if (e1 != null) {
				et.begin();
				em.remove(e1);
				et.commit();
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public List<Employee> displayLaptopAndEmployee(){
		try {
			Query query=em.createQuery("from Employee");
			return query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
