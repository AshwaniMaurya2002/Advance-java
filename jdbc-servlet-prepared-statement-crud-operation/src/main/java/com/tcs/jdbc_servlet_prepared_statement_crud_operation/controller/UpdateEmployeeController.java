package com.tcs.jdbc_servlet_prepared_statement_crud_operation.controller;

import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dao.EmployeeDao;
import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dto.Employee;

public class UpdateEmployeeController {
	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		
		Employee employee=new  Employee();
		
		Employee employee2=dao.updateEmployeeDao(employee);
		
		
		
		
	}

}
