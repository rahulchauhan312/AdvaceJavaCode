package com.jsp.hibernate_simple_project.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	@Id
	private int id;
	private String name;
	private String color;
	private LocalDate mfd;
	private LocalDate expd;
	private double price;
}
