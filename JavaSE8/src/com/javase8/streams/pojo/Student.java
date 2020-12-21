package com.javase8.streams.pojo;

/* @author ravin @date 02-05-2020 @time 15:56 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private String gender;
    private int grade;
    private double gpa;
    private List<String> activities = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student(String name, String gender, int grade, double gpa, List<String> activities) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.gpa = gpa;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name) && Objects.equals(gender, student.gender) && Objects.equals(activities, student.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, grade, gpa, activities);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", activities=" + activities +
                '}';
    }
}
