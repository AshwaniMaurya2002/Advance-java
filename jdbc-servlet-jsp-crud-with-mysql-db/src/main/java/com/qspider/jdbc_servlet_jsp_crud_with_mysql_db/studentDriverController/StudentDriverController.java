package com.qspider.jdbc_servlet_jsp_crud_with_mysql_db.studentDriverController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.qspider.jdbc_servlet_jsp_crud_with_mysql_db.jdbcontroller.jdbcConnection;

public class StudentDriverController {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		try {
			
			Connection connection=jdbcConnection.createConnection();
			String sql="update student set name=? where id=104";
			PreparedStatement statement=connection.prepareStatement(sql);
			//step 3
			
//			System.out.println("Enter the ID which you want to update");
//			int id=sc.nextInt();
			System.out.println("Enter the Name");
			String name=sc.next();
			
			statement.setString(1, name);
//			statement.setInt(2, id);
			
			int a=statement.executeUpdate();
			
		String res=a!=0?"Data Updated":"something went wrong";
		System.out.println(res);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
