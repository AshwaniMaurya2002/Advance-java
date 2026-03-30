package com.company.hibernate_unidirectional_mapping_crud_operation.controller;

import com.company.hibernate_unidirectional_mapping_crud_operation.dao.PersonPanDao;
import com.company.hibernate_unidirectional_mapping_crud_operation.entity.Pan;
import com.company.hibernate_unidirectional_mapping_crud_operation.entity.Person;

public class GetPersonPanController {

	public static void main(String[] args) {
		PersonPanDao dao = new PersonPanDao();
		Person person = dao.getPersonAndPanByPersonIdDao(101);
		
		System.out.println(person.getId());
		
		Pan pan=person.getPan();
		
		System.out.println(pan.getPanNumber());
		
	}

}
