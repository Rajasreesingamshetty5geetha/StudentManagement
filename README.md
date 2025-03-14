# Student Management System

## Project Overview
This is a **Student Management System** built using **Java Servlets, JSP, and MySQL**. It allows users to **add, view, and delete students** in a database.

## Folder Structure
```
STUDENTMANAGEMENT/
│── db/
│   ├── student_db.sql
│
│── lib/
│   ├── mysql-connector-java-9.2.0.jar
│
│── src/main/
│   ├── java/com/example/
│   │   ├── servlets/
│   │   │   ├── AddStudentServlet.java
│   │   │   ├── DeleteStudentServlet.java
│   │   │   ├── ViewStudentsServlet.java
│   │   ├── DBConnection.java
│   │   ├── DBConnection.class
│   │   ├── Student.java
│   │   ├── Student.class
│   │   ├── StudentDAO.java
│   │   ├── StudentDAO.class
│   │   ├── Main.java
│   │   ├── Main.class
│
│── webapp/
│   ├── WEB-INF/
│   │   ├── web.xml
│   ├── add_student.jsp
│   ├── index.jsp
│   ├── view_students.jsp
│
│── target/
│── pom.xml
```

## Database Setup
1. Import the `student_db.sql` file from the **db/** folder into MySQL.
2. Update the **DBConnection.java** file with your database credentials.
3. Ensure the MySQL JDBC Driver (`mysql-connector-java-9.2.0.jar`) is present in the **lib/** folder.

## How to Run
1. Compile the project using Maven:
   ```sh
   mvn clean package
   ```
2. Deploy the generated WAR file (`target/StudentManagementWeb-1.0-SNAPSHOT.war`) to **Tomcat**.
3. Start the **Tomcat Server** and access the application at:
   ```
   http://localhost:8080/StudentManagementWeb-1.0-SNAPSHOT/
   ```
4. Use the application to add, view, and delete students.

## Project Images
<img src="https://github.com/Rajasreesingamshetty5geetha/StudentManagement/blob/main/images/img2.png" alt="Alt Text" width="600" height="600">
<img src="https://github.com/Rajasreesingamshetty5geetha/StudentManagement/blob/main/images/img3.png" alt="Alt Text" width="700" height="600">
<img src="https://github.com/Rajasreesingamshetty5geetha/StudentManagement/blob/main/images/img1.png" alt="Alt Text" width="800" height="600">


