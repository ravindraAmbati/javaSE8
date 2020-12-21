package com.javase8.streams.data;

/* @author ravin @date 02-05-2020 @time 15:56 */

import com.javase8.streams.pojo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentData {

    public static Supplier<List<Student>> studentListSupplierLambda = () -> getStudents();
    public static Supplier<List<Student>> studentListSupplierMethodReference = StudentData::getStudents;
    public static Supplier<Student> studentSupplier = () -> new Student("Novo", "Male", 4, 7.0d, Arrays.asList("singing", "running", "swimming"));

    public static List<Student> getStudents() {

        Student s1 = new Student("Leo", "Male", 1, 8.0d, Arrays.asList("singing", "aerobics", "cooking"));
        Student s2 = new Student("Neo", "Female", 1, 7.3d, Arrays.asList("cycling", "basketball", "soccer"));
        Student s3 = new Student("Intell", "Male", 2, 8.1d, Arrays.asList("soccer", "swimming", "singing"));
        Student s4 = new Student("Jack", "Female", 2, 9.0d, Arrays.asList("running", "basketball", "crafting"));
        Student s5 = new Student("Tech", "Male", 3, 6.1d, Arrays.asList("soccer", "cycling", "swimming"));
        Student s6 = new Student("Log", "Female", 3, 5.9d, Arrays.asList("swimming", "dancing", "crafting"));
        Student s7 = new Student("Novo", "Male", 4, 7.0d, Arrays.asList("singing", "running", "swimming"));
        Student s8 = new Student("Ipho", "Female", 4, 8.0d, Arrays.asList("cycling", "basketball", "running"));
        Student s9 = new Student("Mac", "Male", 5, 7.5d, Arrays.asList("soccer", "crafting", "cooking"));
        Student s0 = new Student("Cisco", "Female", 5, 8.0d, Arrays.asList("crafting", "aerobics", "cooking"));
        Student s11 = new Student("More", "Male", 6, 8.5d, Arrays.asList("soccer", "crafting", "cooking"));
        Student s12 = new Student("Less", "Female", 6, 8.5d, Arrays.asList("crafting", "aerobics", "cooking"));
        return Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, s11, s12);
    }
}
