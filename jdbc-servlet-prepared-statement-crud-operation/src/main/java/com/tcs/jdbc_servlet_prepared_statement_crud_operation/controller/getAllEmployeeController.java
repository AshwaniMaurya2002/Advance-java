package com.tcs.jdbc_servlet_prepared_statement_crud_operation.controller;

import java.util.List;

import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dao.EmployeeDao;
import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dto.Employee;

public class getAllEmployeeController {
	
	public static void main(String[] args) {
		
		EmployeeDao e=new EmployeeDao();
		
		List<Employee>  employee=e.getAllEmployeeDao();
		
		for (Employee emp : employee) {
			System.out.println(emp);
		}
		
	}
	


}
