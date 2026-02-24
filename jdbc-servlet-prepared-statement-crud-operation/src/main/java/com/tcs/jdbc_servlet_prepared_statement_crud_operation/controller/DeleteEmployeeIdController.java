package com.tcs.jdbc_servlet_prepared_statement_crud_operation.controller;


import java.util.Scanner;

import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dao.EmployeeDao;

public class DeleteEmployeeIdController {
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		System.out.println("Enter Employee Id To delete the Employee data");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		boolean b=dao.deleteEmployeeByIdDao(id);
		
		String msg=b?"Employee Deleted":"Something went wrong";
		System.out.println(msg);
		

	}
}
