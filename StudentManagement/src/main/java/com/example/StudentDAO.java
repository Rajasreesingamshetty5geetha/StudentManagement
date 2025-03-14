package com.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(String name, int age, String course) {
        String query = "INSERT INTO students (name,age,course) VALUES (?,?,?)";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);
            ps.executeUpdate();
            System.out.println("Student added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query)){
            while (rs.next()) {
                students.add(new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("course")

                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
