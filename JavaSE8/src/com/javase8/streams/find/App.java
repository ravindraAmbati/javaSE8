package com.javase8.streams.find;

import com.javase8.streams.data.StudentData;
import com.javase8.streams.pojo.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        Comparator<Student> comparator = (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa());

        Optional<Student> optionalStudent = students.stream().sorted(comparator).findAny();

        System.out.println(optionalStudent.get());
        System.out.println(optionalStudent.orElse(new Student("default")));
        System.out.println(optionalStudent.isPresent());

        optionalStudent.ifPresent(s -> System.out.println("random student " + s.getName()));

        optionalStudent = students.stream().sorted(comparator).findFirst();
        optionalStudent.ifPresent(s -> System.out.println("lowest scored student " + s.getName() + " with gpa " + s.getGpa()));

        optionalStudent = students.stream().sorted(comparator.reversed()).findFirst();
        optionalStudent.ifPresent(s -> System.out.println("highest scored student " + s.getName() + " with gpa " + s.getGpa()));

        optionalStudent = students.stream().max(comparator);
        optionalStudent.ifPresent(s -> System.out.println("highest scored student " + s.getName() + " with gpa " + s.getGpa()));

        optionalStudent = students.stream().min(comparator);
        optionalStudent.ifPresent(s -> System.out.println("lowest scored student " + s.getName() + " with gpa " + s.getGpa()));
    }
}
