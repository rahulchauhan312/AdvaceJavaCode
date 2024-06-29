package com.jsp.hibernate_one_to_many.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainer {
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	private LocalDate dob;
	private String specilization;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> st;
}
