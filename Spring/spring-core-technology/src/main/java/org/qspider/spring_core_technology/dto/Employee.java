package org.qspider.spring_core_technology.dto;

import lombok.Data;
import lombok.ToString;

@Data
public class Employee {

	private int id;
	private String name;
	private Laptop laptop;
	
	Employee(int id,String name,Laptop laptop){
	
		this.id=id;
		this.name=name;
		this.laptop=laptop;
	}

	
}
