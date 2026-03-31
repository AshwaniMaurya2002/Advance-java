package com.company.hibernate_unidirectional_mapping_crud_operation.controller;

import com.company.hibernate_unidirectional_mapping_crud_operation.dao.PersonPanDao;

public class deletePersonByIdController {
	
	public static void main(String[] args) {
		
		PersonPanDao dao=new PersonPanDao();
		boolean b=
				dao.deletePersonById(1001);
		
		
		if(b) {
			System.out.println("Person deleted successfully");
		}
		else {
			System.out.println("Person not found with the given id");
		}
		
	}

}
