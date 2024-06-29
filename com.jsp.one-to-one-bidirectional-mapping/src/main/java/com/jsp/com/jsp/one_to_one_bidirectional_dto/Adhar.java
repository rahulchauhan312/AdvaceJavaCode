package com.jsp.com.jsp.one_to_one_bidirectional_dto;

import java.time.LocalDate;

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
public class Adhar {
	@Id
	private long adharNumber;
	private LocalDate dob;
	private String address;
	private String father;
	@OneToOne(mappedBy = "adhar")
	Person person;
	@Override
	public String toString() {
		return "adharNumber=" + adharNumber + ", dob=" + dob + ", address=" + address + ", father=" + father;
	}
	
}
