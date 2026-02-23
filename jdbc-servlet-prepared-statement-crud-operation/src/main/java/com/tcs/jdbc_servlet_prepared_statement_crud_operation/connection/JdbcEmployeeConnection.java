package com.tcs.jdbc_servlet_prepared_statement_crud_operation.connection;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



public class JdbcEmployeeConnection {
	
	
	public static Connection createJdbcEmployeeConnection() {
		
		try {
			
			//step1 register and load driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			
			//Step 2 Get COnnection
			String url="jdbc:mysql://localhost:3306/jdbc-m17";
			String username="root";
			String password="TIGER";
			
			return DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			return null;
		}

		
		
		
	}

}
