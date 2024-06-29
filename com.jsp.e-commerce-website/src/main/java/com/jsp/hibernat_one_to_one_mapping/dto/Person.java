package com.jsp.hibernat_one_to_one_mapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	@OneToOne(cascade = CascadeType.ALL)   	
	@JoinColumn(name = "adharNumber")
	Adhar adhar;
}
