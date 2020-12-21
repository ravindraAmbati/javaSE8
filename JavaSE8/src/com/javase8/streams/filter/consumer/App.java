package com.javase8.streams.filter.consumer;

import com.javase8.streams.data.StudentData;
import com.javase8.streams.pojo.Student;

import java.util.List;
import java.util.function.Consumer;

public class App {

    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();
        java7(students);

        java8_1(students);

        java8_2(students);
    }

    private static void java8_2(List<Student> students) {
        System.out.println();
        System.out.println("java 8 #2");
        students.forEach(s -> System.out.print(s.getName().toUpperCase() + " || "));
    }

    private static void java8_1(List<Student> students) {
        System.out.println();
        System.out.println("java 8 #1");
        Consumer<Student> printUpperCaseStudentName = s -> System.out.print(s.getName().toUpperCase() + " || ");
        students.forEach(printUpperCaseStudentName);
    }

    private static void java7(List<Student> students) {
        System.out.println("java 7 ");
        for (Student s : students) {
            System.out.print(s.getName().toUpperCase() + " || ");
        }
    }
}
