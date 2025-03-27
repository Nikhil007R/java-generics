package com.bridgelabz.courseManagement;

abstract class CourseType {
    protected String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract String getEvaluationMethod();

    public String getCourseName() {
        return courseName;
    }
}
