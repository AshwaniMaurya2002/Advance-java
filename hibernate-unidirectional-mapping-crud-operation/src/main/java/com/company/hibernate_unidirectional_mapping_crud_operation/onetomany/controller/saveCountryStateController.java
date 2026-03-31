package com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.dao.CountryStateDao;
import com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.entitty.Country;
import com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.entitty.State;

public class saveCountryStateController {

	public static void main(String[] args) {

		State state1 = new State();
		state1.setId(400);
		state1.setStateName("UttarPradesh");
		state1.setCapital("Lucknow");
		state1.setNoOfDistricts(75);
		
		State state2 = new State();
		state2.setId(401);
		state2.setStateName("Bihar");
		state2.setCapital("Patna");
		state2.setNoOfDistricts(70);
		
		State state3 = new State();
		state3.setId(402);
		state3.setStateName("Haryana");
		state3.setCapital("Chandigarh");
		state3.setNoOfDistricts(25);
		
		State state4 = new State();
		state4.setId(403);
		state4.setStateName("Uttrakhand");
		state4.setCapital("Dehradun");
		state4.setNoOfDistricts(12);
		
		List<State> states = new ArrayList<State>();
		states.add(state1);
		states.add(state2);
		states.add(state3);
		states.add(state4);
		
		Country country = new Country();
		country.setId(91);
		country.setName("INDIA");
		country.setCapital("New-Delhi");
		
		country.setStates(states);
		
		new CountryStateDao().saveCountryStateDao(country, state4);
	}
		
	}

