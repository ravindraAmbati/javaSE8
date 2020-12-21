package com.javase8.streams.find;

import com.javase8.streams.data.StudentData;
import com.javase8.streams.pojo.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<Student> students = StudentData.getStudents();

        Optional<Student> optionalStudent = students.stream().sorted(Comparator.comparingDouble(Student::getGpa)).findAny();
        optionalStudent.ifPresent(s -> System.out.println("random student " + s.getName()));

        optionalStudent = students.stream().sorted(Comparator.comparingDouble(Student::getGpa)).findFirst();
        optionalStudent.ifPresent(s -> System.out.println("highest scored student " + s.getName()));

        optionalStudent = students.stream().sorted(Comparator.comparingDouble(Student::getGpa).reversed()).findFirst();
        optionalStudent.ifPresent(s -> System.out.println("lowest scored student " + s.getName()));

        optionalStudent = students.stream().max(Comparator.comparingDouble(Student::getGpa));
        optionalStudent.ifPresent(s -> System.out.println("highest scored student " + s.getName()));

        optionalStudent = students.stream().min(Comparator.comparingDouble(Student::getGpa));
        optionalStudent.ifPresent(s -> System.out.println("lowest scored student " + s.getName()));
    }
}
