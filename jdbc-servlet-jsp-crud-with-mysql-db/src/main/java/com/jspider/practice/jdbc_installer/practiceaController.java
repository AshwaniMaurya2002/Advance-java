package com.jspider.practice.jdbc_installer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class practiceaController {
	
	public static void main(String[] args) {
		
		
		String url="jdbc:mysql://localhost:3306/practice";
		String user="root";
		String password="TIGER";
		
		try {
			//step loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
//			String sql="insert into demo(id,name,phone) values(104,'mohit',3252520)";
			//String sql="delete from demo where id=104";
			String sql="select * from demo";
			ResultSet res=stmt.executeQuery(sql);
			
			while(res.next()) {
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
			}
			
//			if(a>0) {
//				System.out.println("data inserted");
//			}
//			else {
//				System.out.println("something went wrong");
//			}
			
		} catch (ClassNotFoundException| SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
