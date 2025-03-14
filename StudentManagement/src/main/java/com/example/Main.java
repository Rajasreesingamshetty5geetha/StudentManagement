package com.example;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO DAO = new StudentDAO();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose an Option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Course: ");
                    String course = sc.next();
                    DAO.addStudent(name, age, course);
                    break;

                case 2:
                    List<Student> students = DAO.getAllStudents();

                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("+----+--------------+----+------------+");
                        System.out.printf("| %-2s | %-12s | %-2s | %-10s |\n", "ID", "Name", "Age", "Course");
                        System.out.println("+----+--------------+----+------------+");
                        for (Student s : students) {
                            System.out.printf("| %-2d | %-12s | %-2d | %-10s |\n", s.getId(), s.getName(), s.getAge(), s.getCourse());
                        }

                        System.out.println("+----+--------------+----+------------+");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    int id = sc.nextInt();
                    DAO.deleteStudent(id);
                    break;

                case 4:
                    System.out.println("Exiting ....");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
