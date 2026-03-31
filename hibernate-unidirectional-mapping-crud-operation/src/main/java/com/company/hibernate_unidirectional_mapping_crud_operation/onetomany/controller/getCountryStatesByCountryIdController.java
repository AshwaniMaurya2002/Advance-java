package com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.controller;

import com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.dao.CountryStateDao;
import com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.entitty.Country;

public class getCountryStatesByCountryIdController {
	
	public static void main(String[] args) {
		
		CountryStateDao dao=new CountryStateDao();
		Country country=dao.getCountryStatesByCountryIdDao(91);
		
		if(country!=null) {
			System.out.println(country);
		}else {
			System.out.println("country code is invalid");
		}
		
	}

}
