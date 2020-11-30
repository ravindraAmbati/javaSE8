package com.javase8.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsException {
    public static void main(String[] args) {
        try {
            m1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m1() throws IOException {
        System.out.println("this is m1");
        m2();
    }

    private static void m2() throws IOException {
        System.out.println("this is m2");
        m3();
    }

    private static void m3() throws IOException {
        System.out.println("this is m3");
        m4();
    }

    private static void m4() throws IOException {
        System.out.println("### START ###");
        System.out.println("this is m4");
        File file = new File("/someFile.txt");
        FileReader fileReader = null;
        fileReader = new FileReader(file);
        fileReader.read();
        System.out.println("### END ###");
    }
}
