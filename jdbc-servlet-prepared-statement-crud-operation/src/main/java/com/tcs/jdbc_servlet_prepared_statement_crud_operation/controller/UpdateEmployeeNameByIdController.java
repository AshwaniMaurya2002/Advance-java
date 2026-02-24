package com.tcs.jdbc_servlet_prepared_statement_crud_operation.controller;

import java.util.Scanner;

import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dao.EmployeeDao;

public class UpdateEmployeeNameByIdController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Id");
		int id = sc.nextInt();

		System.out.println("Enter Employee Name");
		String name = sc.next();

		EmployeeDao dao = new EmployeeDao();
		boolean isUpdated = dao.updateEmployeeNameByIdDao(id, name);

		String msg = isUpdated ? "Name Updated" : "Something went wrong";
		System.out.println(msg);

	}

}
