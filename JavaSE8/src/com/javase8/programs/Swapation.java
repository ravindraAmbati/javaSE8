package com.javase8.programs;

public class Swapation {
    public static void main(String[] args) {
        System.out.println("Swapation");
        swapTwoNumbersWithThirdVar(2, 3); // 3,2
        swapTwoNumbersWithoutThirdVar(2, 3); // 3,2
    }

    private static void swapTwoNumbersWithoutThirdVar(int n, int m) {
        System.out.println("swapTwoNumbersWithoutThirdVar");
        System.out.println("Before Swap of n= " + n + " and m= " + m);
        n = n + m;
        m = n - m;
        n = n - m;
        System.out.println("After Swap of n= " + n + " and m= " + m);
    }

    // A - RED
    // B - BLUE
    // C
    // RED -> C -- A is Empty
    // BLUE -> A -- A is BLUE and B is empty
    // RED -> B -- C is empty
    // B - RED || A - BLUE
    private static void swapTwoNumbersWithThirdVar(int n, int m) {
        System.out.println("swapTwoNumbersWithThirdVar");
        System.out.println("Before Swap of n= " + n + " and m= " + m);
        int temp = n;
        n = m;
        m = temp;
        System.out.println("After Swap of n= " + n + " and m= " + m);
    }


}
