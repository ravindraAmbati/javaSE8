package com.javase8.inheritance;

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
    }
}
