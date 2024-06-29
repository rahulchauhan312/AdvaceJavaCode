package com.jspider.jdbc_project2_with_architecture.dto;

import javax.management.StringValueExp;

public class Employee {
	private int id;
	private String name;
	private String email;
	private int phone;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String email, int phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
