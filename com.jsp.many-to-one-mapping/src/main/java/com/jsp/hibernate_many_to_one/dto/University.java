package com.jsp.hibernate_many_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {
	@Id
	private int id;
	private String name;
	private String address;
}
