package com.jsp.hibernate_one_to_one_mapping.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private int id;
	private String name;
	private LocalDate doj;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_id")
	Laptop laptop;
}
