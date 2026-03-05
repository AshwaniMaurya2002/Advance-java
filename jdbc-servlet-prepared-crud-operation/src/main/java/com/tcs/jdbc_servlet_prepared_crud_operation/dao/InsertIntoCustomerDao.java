package com.tcs.jdbc_servlet_prepared_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tcs.jdbc_servlet_prepared_crud_operation.connection.CustomerConnection;

public class InsertIntoCustomerDao {
	
	public static boolean insertIntoCustomer() {
		
		
		try {
			
			Connection connection=CustomerConnection.createConnection();
			
			String sql="insert into customer values(?,?,?,?,?)";
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "Ravi");
			preparedStatement.setLong(3, 9876543210l);
			preparedStatement.setString(4, "ravi@123");
			preparedStatement.setString(5, "Bangalore");
			
			int rows=preparedStatement.executeUpdate();
			
			if(rows>0) {
				return true;
			}else {
				return false;
			}
				
				
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}

}
