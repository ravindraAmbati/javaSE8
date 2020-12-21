package com.javase8.streams.filter.predicate;

import com.javase8.streams.data.StudentData;
import com.javase8.streams.pojo.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        gpaGreaterThan8();
        gradeLessThan4();
        gradeLessThan4AndGpaGreaterThan8();
    }

    private static void gradeLessThan4AndGpaGreaterThan8() {
        List<Student> students = StudentData.getStudents();

        System.out.println("gradeLessThan4AndGpaGreaterThan8: Java 7 -> applying a filter");
        List<Student> Java7_studentsGradeLessThan4AndGpaGreaterThan8 = new ArrayList<>();
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getGrade() < 4 && student.getGpa() > 8) {
                Java7_studentsGradeLessThan4AndGpaGreaterThan8.add(student);
            }
        }
        System.out.println(Java7_studentsGradeLessThan4AndGpaGreaterThan8);

        Predicate<Student> studentsGradeLessThan4 = student -> student.getGrade() < 4;
        Predicate<Student> gpaGreaterThan8 = s -> s.getGpa() > 8d;
        System.out.println("gradeLessThan4AndGpaGreaterThan8: Java 8 -> applying a filter #1");
        List<Student> Java8_studentsGradeLessThan4AndGpaGreaterThan8 = students.stream().filter(studentsGradeLessThan4).filter(gpaGreaterThan8).collect(Collectors.toList());
        System.out.println(Java8_studentsGradeLessThan4AndGpaGreaterThan8);

        System.out.println("gradeLessThan4AndGpaGreaterThan8: Java 8 -> applying a filter #2");
        List<Student> Java8_studentsGradeLessThan4AndGpaGreaterThan8_2 = students.stream().filter(studentsGradeLessThan4.and(gpaGreaterThan8)).collect(Collectors.toList());
        System.out.println(Java8_studentsGradeLessThan4AndGpaGreaterThan8_2);

    }

    private static void gradeLessThan4() {
        List<Student> students = StudentData.getStudents();
        System.out.println(students);

        System.out.println("Java 7 -> applying a filter");
        List<Student> Java7_studentsGradeLessThan4 = new ArrayList<>();
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getGrade() < 4) {
                Java7_studentsGradeLessThan4.add(student);
            }
        }
        System.out.println(Java7_studentsGradeLessThan4);

        System.out.println("Java 8 -> applying a filter #1");
        Predicate<Student> studentsGradeLessThan4 = student -> student.getGrade() < 4;
        List<Student> Java8_studentsGradeLessThan4 = students.stream().filter(studentsGradeLessThan4).collect(Collectors.toList());
        System.out.println(Java8_studentsGradeLessThan4);

        System.out.println("Java 8 -> applying a filter #2");
        List<Student> Java8_studentsGradeLessThan4_2 = students.stream().filter(student -> student.getGrade() < 4).collect(Collectors.toList());
        System.out.println(Java8_studentsGradeLessThan4_2);
    }

    private static void gpaGreaterThan8() {
        List<Student> students = StudentData.getStudents();
        System.out.println(students);

        System.out.println("Java 7 -> applying a filter");
        List<Student> Java7_studentsGpaGreaterThan8 = new ArrayList<>();
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getGpa() > 8d) {
                Java7_studentsGpaGreaterThan8.add(student);
            }
        }
        System.out.println(Java7_studentsGpaGreaterThan8);


        System.out.println("Java 8 -> applying a filter");
        Predicate<Student> gpaGreaterThan8 = s -> s.getGpa() > 8d;
        List<Student> Java8_studentsGpaGreaterThan8 = students.stream().filter(gpaGreaterThan8).collect(Collectors.toList());
        System.out.println(Java8_studentsGpaGreaterThan8);

        System.out.println("Java 8 -> applying a filter #2");
        List<Student> Java8_studentsGpaGreaterThan8_2 = students.stream().filter(s -> s.getGpa() > 8d).collect(Collectors.toList());
        System.out.println(Java8_studentsGpaGreaterThan8_2);
    }
}
