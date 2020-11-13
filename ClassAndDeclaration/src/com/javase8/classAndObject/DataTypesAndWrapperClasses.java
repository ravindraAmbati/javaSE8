package com.javase8.classAndObject;

public class DataTypesAndWrapperClasses {

    private byte b; // 8-bit
    private short s; // byte extension 16-bit
    private int i;
    private long l;
    private float f;
    private double d;
    private String str;
    private boolean bool;
    private char c;

    private Integer anInteger;
    private Long aLong;
    private Boolean aBoolean;


    public DataTypesAndWrapperClasses() {
    }

    private void assignNumerics() {
        this.b = -128;
        this.s = 32767;
        this.i = 2147483647;
        this.l = -9223372036854775808L;
    }

    private void assignDecimals() {
        this.f = -1293565498.23f;
        this.d = -9223372036854775808.235879d;
    }

    private void assignString() {
        this.str = "assignString";
        this.str = new String("created String Object");
    }

    public static void main(String[] args) {
        System.out.println("com.javase8.classAndObject.DataTypesAndWrapperClasses");
        System.out.println();
        DataTypesAndWrapperClasses obj1 = new DataTypesAndWrapperClasses();
        System.out.println(obj1);
        obj1.assignNumerics();
        System.out.println(obj1);
        obj1.assignDecimals();
        System.out.println(obj1);
        obj1.assignString();
        System.out.println(obj1);
        System.out.println(obj1.str.charAt(0));
        System.out.println(obj1.str.charAt(10));
        System.out.println(obj1.str.toUpperCase());
        String[] strings = obj1.str.split(" ");
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);
        String[] Estrings = obj1.str.split("e");
        System.out.println(Estrings[0]);
        System.out.println(Estrings[1]);
        System.out.println(Estrings[2]);
        System.out.println(Estrings[3]);

        obj1.anInteger = new Integer(1256);
        //obj1.anInteger = 123;
        obj1.i = 123;

        System.out.println(obj1.anInteger);
        System.out.println(obj1.i);
        System.out.println("compare:    " + obj1.anInteger.equals(1256));
        obj1.aLong = new Long(1256);
        System.out.println("compare:    " + obj1.anInteger.equals(obj1.aLong));

        obj1.i = 123;
        obj1.l = 123;
        System.out.println(obj1.i == obj1.l);

        obj1.anInteger = new Integer(123);
        obj1.aLong = new Long(123);
        System.out.println(obj1.anInteger.equals(obj1.aLong));

    }

    @Override
    public String toString() {
        return "com.javase8.classAndObject.DataTypesAndWrapperClasses{" +
                "b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", str='" + str + '\'' +
                ", bool=" + bool +
                ", c=" + c +
                '}';
    }
}
