package com.qspider.jdbc_servlet_jsp_crud_with_mysql_db.studentDriverController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.qspider.jdbc_servlet_jsp_crud_with_mysql_db.jdbcontroller.jdbcConnection;


public class InsertIntoStudentController {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
			Connection connection=jdbcConnection.createConnection();
			String sql="insert into student (id,name,email,phone,password,dob)values(?,?,?,?,?,?)";
			PreparedStatement statement=connection.prepareStatement(sql);
			
			
			System.out.println("Enter the ID");
			int id=sc.nextInt();
			
			System.out.println("Enter the Name");
			String name=sc.next();
			
			System.out.println("Enter the email");
			String email=sc.next();
			
			System.out.println("Enter the Phone");
			long phone=sc.nextInt();
			
			System.out.println("Enter the Password");
			String password=sc.next();
			
			System.out.println("Enter the DOB");
			String dob=sc.next();
			
		//load
			
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setString(3, email);
			statement.setLong(4, phone);
			statement.setString(5, password);
			statement.setObject(6, dob);
			
			int a=statement.executeUpdate();
			
		String res=a!=0?"Data Updated":"something went wrong";
		System.out.println(res);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}

