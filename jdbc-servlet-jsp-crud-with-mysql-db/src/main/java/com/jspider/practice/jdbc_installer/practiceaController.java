package com.jspider.practice.jdbc_installer;

import java.sql.*;

public class practiceaController {
	
	public static void main(String[] args) {
		
		
		String url="jdbc:mysql://localhost:3306/practice";
		String user="root";
		String password="TIGER";
		
		try {
			//step loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, password);
//			System.out.println(con);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from demo");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
