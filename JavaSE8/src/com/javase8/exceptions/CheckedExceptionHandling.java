package com.javase8.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        System.out.println("CheckedExceptionHandling");
        m1();
        m2();
        try {
            m3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m1() {
        System.out.println("m1");
        System.out.println("### START ###");
        File file = new File("/someFile.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("### END ###");
    }

    private static void m2() {
        System.out.println("m2");
        System.out.println("### START ###");
        File file = new File("/file.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            fileReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("### END ###");
    }

    private static void m3() throws IOException {
        System.out.println("m2");
        System.out.println("### START ###");
        File file = new File("/file.txt");
        FileReader fileReader = null;
        fileReader = new FileReader(file);
        fileReader.read();
        System.out.println("### END ###");
    }
}
