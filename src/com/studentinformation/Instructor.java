package com.studentinformation;

import java.time.LocalDate;
import java.util.UUID;

public class Instructor {

    private UUID id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;
    private AcademicTitle title;
    private String specialization;
    private LocalDate hireDate;
    private boolean isActive;

    // Default Constructor
    public Instructor() {
    }

    // Parameterized Constructor
    public Instructor(UUID id, String employeeNo, String nationalId,
                      String firstName, String lastName, String email,
                      Department department, AcademicTitle title,
                      String specialization, LocalDate hireDate,
                      boolean isActive) {

        this.id = id;
        this.employeeNo = employeeNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.title = title;
        this.specialization = specialization;
        this.hireDate = hireDate;
        this.isActive = isActive;
    }

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public AcademicTitle getTitle() {
        return title;
    }

    public void setTitle(AcademicTitle title) {
        this.title = title;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // toString
    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", employeeNo='" + employeeNo + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", title=" + title +
                ", specialization='" + specialization + '\'' +
                ", hireDate=" + hireDate +
                ", isActive=" + isActive +
                '}';
    }
}
