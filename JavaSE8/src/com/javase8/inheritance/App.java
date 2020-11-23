package com.javase8.inheritance;

import java.time.LocalDate;

public class App {

    // IS-A: Student IS-A Person; Faculty IS-A Person
    // HAS-A: Person HAS-A Address; Student HAS-A Address; Faculty HAS-A Address;
    // HAS-A: Person HAS-A Address and ContactInfo; Student HAS-A Address and ContactInfo; Faculty HAS-A Address and ContactInfo;


////    Person (Address and ContactInfo)
////     /|\
////      |
//        |
////    Student
    public static void main(String[] args) {

        Person personEmpty = new Person();
        Student studentEmpty = new Student();
        Faculty facultyEmpty = new Faculty();
        Person student_IS_A_Person = new Student();
        Person faculty_IS_A_Person = new Faculty();

        Address personAddress = new Address("personFirstLine", "personCity", 123456L);

        ContactInfo personContactInfo = new ContactInfo(123465789L, "personal@person.com");

        Person person = new Person(1234567890L, "ravindra", "ambati", 'M', personAddress, personContactInfo);
        System.out.println(person);

        Address studentAddress = new Address("studentFirstLine", "studentCity", 5679856L);

        ContactInfo studentContactInfo = new ContactInfo(123325689L, "personal@student.com");

        Student student = new Student(256987614L, "studentFirstName", "studentLastName", 'M', studentAddress, studentContactInfo, 12, 8.75f);
        System.out.println(student);

        Address facultyAddress = new Address("facultyFirstLine", "facultyCity", 55489856L);

        ContactInfo facultyContactInfo = new ContactInfo(123325689L, "personal@faculty.com");

        Faculty faculty = new Faculty(12346547, "firstName", "lastName", 'M', facultyAddress, facultyContactInfo, "HoD", "Computers");
        System.out.println(faculty);

        Address simpleAddress = new Address("personFirstLine", "personCity", 123456L);

        ContactInfo simpleContactInfo = new ContactInfo(123465789L, "personal@person.com");

        Person firstPerson = new Person(1234567890L, "first", "last", 'M', simpleAddress, simpleContactInfo);
        firstPerson.setDob(LocalDate.of(2000,11,19));

        Student firstStudent = new Student(256987614L, "firstStudent", "lastStudent", 'M', simpleAddress, simpleContactInfo, 12, 8.75f);
        firstStudent.setDob(LocalDate.of(1999,1,26));

        Faculty firstFaculty = new Faculty(12346547, "firstName", "lastName", 'M', facultyAddress, facultyContactInfo, "HoD", "Computers");
        firstFaculty.setDob(LocalDate.of(1988,3,30));

    }
}
