package com.jsp.jdbc__bookstore.dto;

public class Order {
	private int id;
	private long phone;
	private String name;
	public Order() {
		super();
	}
	public Order(int id, long phone, String name) {
		super();
		this.id = id;
		this.phone = phone;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getname() {
		return name;
	}
	public void setBookname(String name) {
		this.name = name;
	}
	
}
