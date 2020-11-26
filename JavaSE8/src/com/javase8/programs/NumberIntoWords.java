package com.javase8.programs;

import static com.javase8.programs.ReverseANumberAndAString.reverseANumber;

public class NumberIntoWords {
    public static void main(String[] args) {
        System.out.println("NumberIntoWords");
        printNumberIntoWords(123); // ONE TWO THREE
        printNumberIntoWords(96325874);
    }

    private static void printNumberIntoWords(int n) {
        System.out.println();
        n = (int) reverseANumber(n);
        while (n > 0) {
            printWords(n % 10);
            n = n / 10;
        }
    }

    private static void printWords(int n) {
        switch (n) {
            case 0:
                System.out.print("ZERO ");
                break;
            case 1:
                System.out.print("ONE ");
                break;
            case 2:
                System.out.print("TWO ");
                break;
            case 3:
                System.out.print("THREE ");
                break;
            case 4:
                System.out.print("FOUR ");
                break;
            case 5:
                System.out.print("FIVE ");
                break;
            case 6:
                System.out.print("SIX ");
                break;
            case 7:
                System.out.print("SEVEN ");
                break;
            case 8:
                System.out.print("EIGHT ");
                break;
            case 9:
                System.out.print("NINE ");
                break;
            default:
                System.out.println("UNKNOWN ");
        }
    }
}
