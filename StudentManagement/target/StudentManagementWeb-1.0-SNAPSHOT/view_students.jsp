<%@page import="java.util.List, com.example.Student"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Students</title>
    <style>
        table {
            width: 60%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            padding: 10px;
            text-align: center;
            border: 1px solid black;
        }
        th {
            background-color: #f2f2f2;
        }
        a {
            text-decoration: none;
            padding: 5px 10px;
            color: white;
            background-color: red;
            border-radius: 5px;
        }
        a:hover {
            background-color: darkred;
        }
    </style>
</head>
<body>

    <h2>Student List</h2>

    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Age</th><th>Course</th><th>Action</th></tr>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            if (students != null) {
                for (Student s : students) {
        %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getAge() %></td>
            <td><%= s.getCourse() %></td>
            <td><a href="delete?id=<%= s.getId() %>">Delete</a></td> <!-- Ensure Delete Servlet URL -->
        </tr>
        <% 
                }
            } else { 
        %>
        <tr><td colspan="5">No students found.</td></tr>
        <% } %>
    </table>

    <a href="add_student.jsp">Add Student</a>
</body>
</html>