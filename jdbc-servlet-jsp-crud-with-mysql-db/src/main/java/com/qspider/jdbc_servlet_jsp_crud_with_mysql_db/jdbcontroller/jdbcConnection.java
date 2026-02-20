package com.qspider.jdbc_servlet_jsp_crud_with_mysql_db.jdbcontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class jdbcConnection {
	
	public static Connection createConnection() {
		
		//step 1--> register driver
		
		Driver driver;
		try {
			
			Connection connection=null;
			driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2-- connection
			String url="jdbc:mysql://localhost:3306/jdbc-m17";
			String user="root";
			String password="TIGER";
			 
			return DriverManager.getConnection(url,user,password);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
		
		
		
	}

}
