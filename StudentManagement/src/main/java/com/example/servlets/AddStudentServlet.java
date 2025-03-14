package com.example.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.DBConnection;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String course = request.getParameter("course");

        try (Connection con = DBConnection.getConnection()) {

            String query = "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);

            
            int rowsInserted = ps.executeUpdate();
            ps.close();
            con.close();

           
            if (rowsInserted > 0) {
                System.out.println("Student added successfully.");
            }

           
            response.sendRedirect("viewStudents");

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
