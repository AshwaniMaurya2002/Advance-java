package com.project.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.project.db.DBConnection;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

try{

String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String password=request.getParameter("password");
String dob=request.getParameter("dob");
String doj=request.getParameter("doj");
int id=Integer.parseInt(request.getParameter("id"));

Connection con=DBConnection.getConnection();

PreparedStatement ps=con.prepareStatement(
"insert into user(name,email,phone,password,dob,doj,id) values(?,?,?,?,?,?,?)");

ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,phone);
ps.setString(4,password);
ps.setString(5,dob);
ps.setString(6,doj);
ps.setInt(7,id);

ps.executeUpdate();

response.sendRedirect("display.jsp");

}catch(Exception e){
e.printStackTrace();
}

}
}