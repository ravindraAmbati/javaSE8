package com.javase8.accessSpecifiers;

public class AnotherClass /*extends SomeClass*/{

    final String name="finalValue";
    final double value=99.99d;
    final static String CONSTANT = "CONSTANT";

    public AnotherClass(){
//        CONSTANT = "tryingToChange";
    }

    public AnotherClass(String name, double val){
//        this.name = name;
//        this.value = val;
        System.out.println("parameterized constructor");
//        CONSTANT = "tryingToChange";
    }

    public static void main(String[] args) {
        System.out.println("AnotherClass - for final");

        AnotherClass anotherClass1 = null;
        System.out.println(anotherClass1);
        AnotherClass anotherClass2 = new AnotherClass();
        System.out.println(anotherClass2);
        AnotherClass anotherClass3 = new AnotherClass("secondValue",258.654d);
        System.out.println(anotherClass3);
        AnotherClass anotherClass4 = new AnotherClass("nextValue",998.5d);
        System.out.println(anotherClass4);
//        anotherClass4.value = 123.456d;
//        CONSTANT = "tryingToChange";

    }

    @Override
    public String toString() {
//        CONSTANT = "tryingToChange";
        return "AnotherClass{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", CONSTANT="  + CONSTANT +
                '}';
    }
}
