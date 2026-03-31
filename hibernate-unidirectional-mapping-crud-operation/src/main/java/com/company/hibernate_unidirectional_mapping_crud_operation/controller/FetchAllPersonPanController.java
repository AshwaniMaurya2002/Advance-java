package com.company.hibernate_unidirectional_mapping_crud_operation.controller;

import java.util.List;

import com.company.hibernate_unidirectional_mapping_crud_operation.dao.PersonPanDao;
import com.company.hibernate_unidirectional_mapping_crud_operation.entity.Person;

public class FetchAllPersonPanController {


	    public static void main(String[] args) {

	        PersonPanDao dao = new PersonPanDao();

	        List<Person> list = dao.getAllPersonAndPanDao();

	        for (Person p : list) {

	            System.out.println("Person ID: " + p.getId());
	            System.out.println("Name: " + p.getName());

	            if (p.getPan() != null) {
	                System.out.println("Pan ID: " + p.getPan().getId());
	                System.out.println("Pan Number: " + p.getPan().getPanNumber());
	            } else {
	                System.out.println("No Pan linked");
	            }
	        }
	    }
}