package com.studentinformation;

import java.util.UUID;

public class CoursePrerequisite {

    private UUID id;
    private Course course;
    private Course prerequisiteCourse;
    private String type;
    private Double minGrade;

    // Default Constructor
    public CoursePrerequisite() {
    }

    // Parameterized Constructor
    public CoursePrerequisite(UUID id, Course course,
                              Course prerequisiteCourse,
                              String type, Double minGrade) {

        this.id = id;
        this.course = course;
        this.prerequisiteCourse = prerequisiteCourse;
        this.type = type;
        this.minGrade = minGrade;
    }

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getPrerequisiteCourse() {
        return prerequisiteCourse;
    }

    public void setPrerequisiteCourse(Course prerequisiteCourse) {
        this.prerequisiteCourse = prerequisiteCourse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(Double minGrade) {
        this.minGrade = minGrade;
    }

    // toString
    @Override
    public String toString() {
        return "CoursePrerequisite{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", minGrade=" + minGrade +
                '}';
    }
}
