# Student Information System

## Software Design and Architecture - Assignment 1

This project was developed for the Software Design and Architecture course.

The project implements a basic Student Information System using
Object-Oriented Programming principles in Java.

## Programming Language

- Java

## Assignment Topic

Student Information System – Class Design

## Project Description

The purpose of this assignment is to design classes based on the
provided Student Information System database schema.

The project represents the relationships between the entities using
Java classes and object references.

## Classes

The project contains the following main classes:

- Faculty
- Department
- Program
- Student
- Instructor
- Course
- AcademicTerm
- CoursePrerequisite
- ProgramCourse

## Enum Classes

The project uses Java enum types for predefined values:

- AcademicTitle
- DegreeLevel
- Gender
- StudentStatus
- CourseType
- Semester

## Object-Oriented Concepts

The project demonstrates:

- Encapsulation
- Private fields
- Constructors
- Getters and setters
- Object relationships
- Enum types
- Method overriding
- `toString()` method
- ArrayList

## Relationships

The classes represent relationships between entities in the database schema.

Examples:

- A Department belongs to a Faculty.
- A Program belongs to a Department.
- A Student belongs to a Program.
- A Course belongs to a Department.
- A CoursePrerequisite is related to Course objects.
- A ProgramCourse connects a Program with a Course.

## Student Registration Simulation

The `Main` class creates a Student object and adds it to an
`ArrayList<Student>`.

The registered student is then printed to the console.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open `Main.java`.
3. Run the `main` method.
4. The registered student information will be displayed in the console.

## Author

Software Design and Architecture - Assignment 1
