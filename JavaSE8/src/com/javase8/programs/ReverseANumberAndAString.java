package com.javase8.programs;

public class ReverseANumberAndAString {

    public static void main(String[] args) {
        System.out.println("ReverseANumberAndAString");
        System.out.println(reverseANumber(9876)); //6789
        //System.out.println(reverseANumber(1234567890)); //0987654321 // zero is ignored
        System.out.println(reverseAString1("Java"));
        System.out.println(reverseAString1("9876")); // 6789
        System.out.println(reverseAString1("1234567890")); //0987654321 // zero is not ignored
        System.out.println(reverseAString1("{}()[]:',.<>?/"));
//        System.out.println(reverseAString2("Java"));
//        System.out.println(reverseAString2("9876"));
//        System.out.println(reverseAString2("1234567890"));
        System.out.println(reverseAString3("Java"));
        System.out.println(reverseAString3("9876")); // 6789
        System.out.println(reverseAString3("1234567890")); //0987654321 // zero is not ignored
        System.out.println(reverseAString3("{}()[]:',.<>?/"));
    }

    public static String reverseAString3(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    private static String reverseAString1(String s) {

        char[] chars = s.toCharArray();
        int l = s.length();
        String reverse = "";
        for (int i = l - 1; i >= 0; i--) {
            reverse = reverse + chars[i];
        }
        return reverse;
    }

    private static String reverseAString2(String s) {
        // todo: incomplete
        byte[] bytes = s.getBytes();
        int l = s.length();
        String reverse = "";
        for (int i = l - 1; i >= 0; i--) {
            reverse = reverse + bytes[i];
        }
        return reverse;
    }

    private static long reverseANumber(long n) {
        long r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        return r;
    }


}
