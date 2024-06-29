package com.jsp.com.jsp.one_to_many_bidirectional.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trainer {
	@Id
	private int id;
	private String name;
	private String email;
	private long phoine;
	private LocalDate dob;
	private String specilazation;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "trainer")
	List<Student> st;
}
