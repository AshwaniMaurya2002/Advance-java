package com.company.hibernate_unidirectional_mapping_crud_operation.controller;

import com.company.hibernate_unidirectional_mapping_crud_operation.dao.PersonPanDao;

public class deletePanByPanIdController {
	
	public static void main(String[] args) {
		
		PersonPanDao dao = new PersonPanDao();
				boolean b=dao.deletePanByPanId(510);
		
		if(b) {
			System.out.println("Pan deleted successfully");
		}
		else {
			System.out.println("Pan not found with the given id");
		}
		
	}

}
