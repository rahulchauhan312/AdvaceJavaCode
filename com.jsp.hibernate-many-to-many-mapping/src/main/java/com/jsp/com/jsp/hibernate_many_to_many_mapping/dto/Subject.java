package com.jsp.com.jsp.hibernate_many_to_many_mapping.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
	@Id
	private int id;
	private String name;
	private String authorname;
	private LocalDate pdate;
	private double price;
}
