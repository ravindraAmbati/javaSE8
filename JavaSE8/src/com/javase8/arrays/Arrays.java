package com.javase8.arrays;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("Arrays");

        int i = 1;
        System.out.println(i);
        i = i + 10;
        System.out.println(i + 10);
        String str = "this is a program to explain arrays";
        System.out.println(str);
        // Array series or collection of similar data
        int[] k = {215, 158, 26546, 35, 4, 5, 546, 700, 88, 9};
        System.out.println("3rd position value:" + k[3]);
        for (int j = 0; j < 10; j++) {
            System.out.println(k[j]);
        }
        String[] cars = {"sedan", "hatchback", "suv"};
        System.out.println("Number of cars:     " + cars.length);
        for (int j = 0; j < 3; j++) {
            System.out.println(cars[j]);
        }
        for (int j = 0; j < cars.length; j++) {
            System.out.println(cars[j]);
        }
        for (String car : cars) {
            System.out.println(car);
        }


        //multi dimension array
//        1 2 3
//        4 5 6
//        7 8 9
        int[][] matrix =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int j = 0; j < 3; j++) {
            for (int l = 0; l < 3; l++) {
                System.out.println(matrix[j][l]);
            }
        }
    }


}
