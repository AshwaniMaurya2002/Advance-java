package com.project.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.project.db.DBConnection;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

try{

int id=Integer.parseInt(request.getParameter("id"));

Connection con=DBConnection.getConnection();

PreparedStatement ps=con.prepareStatement(
"delete from user where id=?");

ps.setInt(1,id);

ps.executeUpdate();

response.sendRedirect("display.jsp");

}catch(Exception e){
e.printStackTrace();
}

}
}