package com.project.javafiles;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {

		 String email = req.getParameter("username");
		String password = req.getParameter("password");

		resp.setContentType("text/html;charset=UTF-8");

		// use try-with-resources to ensure the writer and JDBC resources are closed
		try (PrintWriter out = resp.getWriter()) {

			// load driver (optional for modern JDBC but harmless)
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jdbc-m17",
					"root",
					"TIGER");
				PreparedStatement ps = con.prepareStatement(
						"select * from user where email=? and password=?")) {

				ps.setString(1, email);
				ps.setString(2, password);

				try (ResultSet rs = ps.executeQuery()) {

					if (rs.next()) {
//						out.println("<h2 style='color:green'>Login Successful</h2>");
						out.println("<p>Welcome, " + rs.getString("email") + "!</p>");
						resp.sendRedirect("display.jsp");
					} else {
						out.println("<h2 style='color:red'>Invalid Email or Password</h2>");
					}
				}
			}

		} catch (final Exception e) {
			e.printStackTrace();
			// attempt to show a concise message to the client; full stack is in server logs
			resp.getWriter().println("<h2 style='color:red'>An error occurred while processing your request: " + e.getMessage() + "</h2>");
		}
	}
}