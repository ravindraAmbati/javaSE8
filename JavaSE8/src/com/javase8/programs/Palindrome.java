package com.javase8.programs;

import static com.javase8.programs.NumberNature.isEven;
import static com.javase8.programs.ReverseANumberAndAString.reverseAString3;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome");
        System.out.println(isPalindrome1("12321"));
        System.out.println(isPalindrome1("LEVEL"));
        System.out.println(isPalindrome1("level"));
        System.out.println(isPalindrome1("Level"));
        System.out.println(isPalindrome2("12321"));
        System.out.println(isPalindrome2("LEVEL"));
        System.out.println(isPalindrome2("level"));
        System.out.println(isPalindrome2("Level"));
        System.out.println(isPalindrome3("123321"));
        System.out.println(isPalindrome3("NOON"));
        System.out.println(isPalindrome3("level"));
        System.out.println(isPalindrome3("Level"));
    }

    private static boolean isPalindrome3(String s) {
        System.out.println("isPalindrome3");
        int l = s.length();
        int h = l / 2;
        String first = null;
        String last = null;
        first = s.substring(0, h);
        if (isEven(l)) {
            last = s.substring(h, l);
        } else {
            last = s.substring(h + 1, l);
        }
        last = reverseAString3(last);

        return first.equals(last);
    }

    private static boolean isPalindrome1(String s) {
        s = s.toLowerCase();
        String r = reverseAString3(s);
        return r.equals(s);
    }

    private static boolean isPalindrome2(String s) {
        // Not recommended
        return s.toLowerCase().equals(reverseAString3(s.toLowerCase()));
    }


}
