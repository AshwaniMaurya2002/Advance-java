package com.jspider.practice.jdbc_installer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import com.mysql.cj.jdbc.Driver;

public class DisplayStudentController {
	
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			
			//step 1 register the driver
    Driver driver=new Driver();
    DriverManager.registerDriver(driver);
    
			//step2 connection establish
			String url="jdbc:mysql://localhost:3306/jdbc-m17";
			String user="root";
			String password="TIGER";
			
			connection=DriverManager.getConnection(url, user, password);
			//step 3 create statement
			statement=connection.createStatement();
			String sql="select * from student";
			ResultSet res=statement.executeQuery(sql);
			
			while(res.next()) {
				System.out.println("ID is ==> "+res.getInt("id"));
				System.out.println("Name is  ==>"+res.getString("name"));
//				System.out.println("Date ==>"+res.getDate("dob"));
				
			LocalDate dob=	res.getDate("dob").toLocalDate();
			System.out.println(dob);
				//fetch local date from using date
				System.out.println(LocalDate.now());
			}
		
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		
	}
}
