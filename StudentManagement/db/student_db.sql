-- Active: 1741608148264@@127.0.0.1@3306@student_data
CREATE DATABASE student_data;
use student_data;

create table students (
    id INT AUTO_INCREMENT PRIMARY KEY ,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100)
);

show DATABASES;
Delete FROM students;
TRUNCATE TABLE students;
