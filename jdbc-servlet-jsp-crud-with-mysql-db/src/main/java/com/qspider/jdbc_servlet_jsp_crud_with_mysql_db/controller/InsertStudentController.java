package com.qspider.jdbc_servlet_jsp_crud_with_mysql_db.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertStudentController {
	
	public static void main(String[] args) {
		
		
		
		try {
			
			//step 1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2 connection establish
			
			String url="jdbc:mysql://localhost:3306/jdbc-m17";
			String user="root";
			String password="TIGER";
			
			Connection connection=DriverManager.getConnection(url, user, password);
			
			System.out.println(connection);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
