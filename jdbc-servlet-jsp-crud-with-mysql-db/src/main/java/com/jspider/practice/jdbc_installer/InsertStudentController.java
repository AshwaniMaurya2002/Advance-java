package com.qspider.jdbc_servlet_jsp_crud_with_mysql_db.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertStudentController {
	
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			
			//step 1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2 connection establish
			String url="jdbc:mysql://localhost:3306/jdbc-m17";
			String user="root";
			String password="TIGER";
			
			connection=DriverManager.getConnection(url, user, password);
			//step 3 create statement
			statement=connection.createStatement();
//			String sql="delete from student where id=103";
//			String sql="insert into student(id,name,email,phone,password,dob) values(103,'sohan','sohan@gmail.com',645463453,'sachine@123','2000-01-01')";
//			System.out.println(connection);
			int a=statement.executeUpdate(sql);
			if(a>0) {
				System.out.println("record inserted successfully");
			}
			else {
				System.out.println("record not inserted");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
