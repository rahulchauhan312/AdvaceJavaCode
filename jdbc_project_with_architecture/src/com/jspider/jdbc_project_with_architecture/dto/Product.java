package com.jspider.jdbc_project_with_architecture.dto;

import java.time.LocalDate;

public class Product {
	private int id;
	private String Name;
	private double price;
	private String color;
	private LocalDate mfd;
	private LocalDate expd;
	public Product() {
		super();
	}
	public Product(int id, String name, double price, String color, LocalDate mfd, LocalDate expd) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
		this.color = color;
		this.mfd = mfd;
		this.expd = expd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDate getMfd() {
		return mfd;
	}
	public void setMfd(LocalDate mfd) {
		this.mfd = mfd;
	}
	public LocalDate getExpd() {
		return expd;
	}
	public void setExpd(LocalDate expd) {
		this.expd = expd;
	}
	@Override
	public String toString() {
		
		return "Id is: " +id +"\nName is: " +Name +"\nPrice is: " +price +"\nColor is: " +color +"\nManufacturing Date is: "+mfd +"\nExpairyDate is: "+expd+"\n============================================";
	}
	
}
