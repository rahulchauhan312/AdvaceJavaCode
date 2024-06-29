package com.jsp.com.jsp.one_to_one_bidirectional_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	@OneToOne(cascade = CascadeType.ALL)   	
	@JoinColumn(name = "adharNumber")
	Adhar adhar;
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone ;
	}
	
}
