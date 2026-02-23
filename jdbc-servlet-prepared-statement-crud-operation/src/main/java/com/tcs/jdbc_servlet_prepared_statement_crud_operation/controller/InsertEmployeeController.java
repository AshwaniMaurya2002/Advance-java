package com.tcs.jdbc_servlet_prepared_statement_crud_operation.controller;

import java.time.LocalDate;

import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dao.EmployeeDao;
import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dto.Employee;

public class InsertEmployeeController {
	
	public static void main(String[] args) {
		
		
		EmployeeDao dao=new EmployeeDao();
		
		Employee employee=new  Employee();
		employee.setId(4455);
		employee.setName("prakash");
		employee.setPhone(53235332);
		employee.setEmail("prakash@gmail.com");
		employee.setPassword("praveen123");
		employee.setDob(LocalDate.parse("2000-10-08"));
		employee.setDoj(LocalDate.parse("2024-10-08"));
		
		Employee employee2=dao.saveEmployeeDao(employee);
		 
		String msg=employee2!=null?"Data Inserted":"Somthing went wrong";
		
		System.out.println(msg);
		
		
	}

}
