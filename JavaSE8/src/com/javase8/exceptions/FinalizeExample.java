package com.javase8.exceptions;

//final vs finally vs finalize

//final - access specifier
//final for fields - locks the value - static final makes a variable value as Constant
//final for method restricts to override
//final for class restricts to inherit
//
//
//finally - exception
//        the code inside the finally block will be executed irrespective of exception held or caught
//
//finalize - is called before GC - garbage collector(recycling the memory of unused objects to make reuse it)

public class FinalizeExample {

    static FinalizeExample obj1;
    static FinalizeExample obj2;
    static FinalizeExample obj3;
    String s;
    int i;
    double d;

    public FinalizeExample() {
        System.out.println("default constructor");
    }

    public FinalizeExample(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public static void main(String[] args) {
        System.out.println("FinalizeExample");
        obj1 = new FinalizeExample();
        System.out.println(obj1);
        obj2 = new FinalizeExample("finalize", 1, 2.3d);
        System.out.println(obj2);
        obj3 = new FinalizeExample("object3", 1, 2.3d);
        System.out.println(obj3);
        obj1 = null;
        System.out.println(obj1);
        obj2 = null;
        System.out.println(obj2);
        obj3 = null;
        System.out.println(obj3);
        System.gc();
    }

    @Override
    public String toString() {
        return "FinalizeExample{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        obj1 = new FinalizeExample("reInit", 9, 9.9d);
        System.out.println(obj1);
        System.out.println("finalize called");
    }
}
