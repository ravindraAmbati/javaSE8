package com.javase8.streams.match;

import com.javase8.streams.data.StudentData;
import com.javase8.streams.pojo.Student;

import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();
        Predicate<Student> studentsCanCook = s -> s.getActivities().contains("cooking");
        System.out.print("all students can cook?    ");
        System.out.println(students.stream().allMatch(studentsCanCook));
        Predicate<Student> studentNameLengthLessThan3 = s -> s.getName().length() < 3;

        System.out.print("all student names are not less than 3?    ");
        System.out.println(students.stream().allMatch(studentNameLengthLessThan3.negate()));

        Predicate<Student> studentCanPlayBasketBall = s -> s.getActivities().contains("basketball");
        System.out.print("any student can play basketball?  ");
        System.out.println(students.stream().anyMatch(studentCanPlayBasketBall));

        Predicate<Student> studentScoredLessThan5_9 = s -> s.getGpa() < 5.9d;
        System.out.print("no student who scored less than 5.90  ");
        System.out.println(students.stream().noneMatch(studentScoredLessThan5_9));

        System.out.print("any student who scored less than 5.90 ");
        System.out.println(students.stream().anyMatch(studentScoredLessThan5_9));

        System.out.print("all student who scored less than 5.90 ");
        System.out.println(students.stream().allMatch(studentScoredLessThan5_9));

        Predicate<Student> studentScoredLessThan6 = s -> s.getGpa() < 6d;
        System.out.print("any student who scored less than 6 ");
        System.out.println(students.stream().anyMatch(studentScoredLessThan6));
    }
}
