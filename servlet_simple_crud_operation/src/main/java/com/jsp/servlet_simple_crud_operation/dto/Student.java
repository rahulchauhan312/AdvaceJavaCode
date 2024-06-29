package com.jsp.servlet_simple_crud_operation.dto;

public class Student {
    private String name;
    private String email;
    private String pass;
    private String degree;
    private String branch;
    private String gender;
	public Student() {
		super();
	}
	
	public Student(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	public Student(String name, String email, String pass, String degree, String branch, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.pass= pass;
		this.degree = degree;
		this.branch = branch;
		this.gender = gender;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", pass=" + pass + ", degree=" + degree + ", branch="
				+ branch + ", gender=" + gender + "]";
	}
	
    
}
