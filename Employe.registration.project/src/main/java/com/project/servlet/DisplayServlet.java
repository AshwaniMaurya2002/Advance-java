package com.project.servlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayServlet {

    public static void main(String[] args) {

        try {

            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
          Connection  con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc-m17",
                    "root",
                    "TIGER");

            // 3. Create Statement
            Statement st = con.createStatement();

            // 4. Execute Query
            ResultSet rs = st.executeQuery("SELECT * FROM employee");

            // 5. Fetch Data
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                // 6. Display Data                System.out.println(
                        id + " " +
                        name + " " +
                        email + " " +
                        phone
                );
            }

            // 7. Close Connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}