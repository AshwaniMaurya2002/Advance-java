package com.tcs.jdbc_servlet_prepared_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.tcs.jdbc_servlet_prepared_crud_operation.connection.CustomerConnection;

public class UpdateCustomerNameById {
	
	
	public static boolean updateCustomerNameById() {
		
		
	try {
		Scanner sc=new Scanner(System.in);
		String sql="update customer set name=? where id=?";
		Connection connection=CustomerConnection.createConnection();
		PreparedStatement ps=	connection.prepareStatement(sql);
		int ans=ps.executeUpdate();
		System.out.println("enter the name to update");
		String name=sc.next();
		System.out.println("Enter the id where to update");
		int id=sc.nextInt();
		ps.setString(1, name);
		ps.setInt(2, id);
		return ans!=0?true:false;
		
		
	} catch (SQLException e) {

		e.printStackTrace();
		return false;
	}
		
	}
	

}
