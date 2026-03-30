package com.company.hibernate_unidirectional_mapping_crud_operation.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	private LocalDate dob;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Pan pan;
	

}
