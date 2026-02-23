package com.tcs.jdbc_servlet_prepared_statement_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.tcs.jdbc_servlet_prepared_statement_crud_operation.connection.JdbcEmployeeConnection;
import com.tcs.jdbc_servlet_prepared_statement_crud_operation.dto.Employee;

public class EmployeeDao {
	
	Connection connection=JdbcEmployeeConnection.createJdbcEmployeeConnection();
	
	/*
	 * saveEmployeeDao(Employee employee) method
	 * @return Employee 
	 * */
	
	public Employee saveEmployeeDao(Employee employee) {
		int id=employee.getId();
		String name=employee.getName();
		String email=employee.getEmail();
		String password=employee.getPassword();
		long phone=employee.getPhone();
		LocalDate dob=employee.getDob();
		LocalDate doj=employee.getDoj();
		
		
		
//		System.out.println("id = "+id);
//		System.out.println("name = "+ name);
//		System.out.println("Email = "+email);
//		System.out.println("Password = "+ password);
//		System.out.println("phone = "+ phone);
//		System.out.println("DOB = "+ dob);
//		System.out.println("DOJ = "+ doj);
		
		try {
			String employeeInsertQuery="insert into employee(id,name,email,password,phone,dob,doj) values (?,?,?,?,?,?,?) ";
			PreparedStatement ps= connection.prepareStatement(employeeInsertQuery);
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setLong(5, phone);
			ps.setObject(6, dob);
			ps.setObject(7, doj);
			
		 int a=ps.executeUpdate();
		 return a!=0?employee:null;
		} catch (SQLException e) {
	
			e.printStackTrace();
			return null;
		}
		
		
		
		
		
		
		
	}

	

}
