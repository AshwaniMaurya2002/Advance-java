package com.company.hibernate_unidirectional_mapping_crud_operation.controller;

import java.time.LocalDate;

import com.company.hibernate_unidirectional_mapping_crud_operation.dao.PersonPanDao;
import com.company.hibernate_unidirectional_mapping_crud_operation.entity.Pan;
import com.company.hibernate_unidirectional_mapping_crud_operation.entity.Person;

public class InsertPersonPanController {
	
	public static void main(String[] args) {
		
		Pan pan=new Pan();
		pan.setId(510);
		pan.setPanNumber("ASS5235N");
		
		Person person=new Person();
		person.setId(1001);
		person.setName("Ashwani");
		person.setEmail("ashwani@gmail.com");
		person.setDob(LocalDate.parse("1999-08-15"));
		person.setPan(pan);
		
		
		PersonPanDao dao=new PersonPanDao();
		dao.savePersonAndPanDao(person,pan);
		
	}

}
