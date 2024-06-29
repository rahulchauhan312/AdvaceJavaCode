package com.jsp.hibernate_crud_operation.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	@CreationTimestamp
	private LocalDate registerDate;
	private long phone;
	public Student(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
}
