package com.jsp.hibernate_many_to_one.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
	@Id
	private int id;
	private String name;
	private String address;
	private String typs;
	@ManyToOne(cascade = CascadeType.ALL)
	University university;
}
