package com.javase8.decisionMaking;

public class DecisionMaking {
    // IF and SWITCH
    public static void main(String[] args) {
        System.out.println("DecisionMaking");
        method1(1, 1, 2);
        method1(3, 1, 2);

        method2(1, 1, 2);
        method2(3, 1, 2);

        method3(1, 1, 0);
        method3(3, 0, 2);
        method3(1, 0, 2);
        method3(3, 0, 3);

        method4(1, 1, 1);
        method4(1, 0, 1);
        method4(1, 1, 0);
        method4(1, 0, 0);

        method5('A');
        method5('C');
        method5('B');
        method5('a');
        method5('b');
        method5('c');

        method6(Action.A);
        method6(Action.B);
        method6(Action.C);
        method6(Action.Z);
    }

    static void method1(int i, int j, int k) {
        // SIMPLE IF

        if (i == (j + k)) {
            System.out.println("same values");
        }
    }

    static void method2(int i, int j, int k) {
        // IF - ELSE

        if (i >= (j + k)) {
            System.out.println("is a triangle");
        } else {
            System.out.println("is a NOT triangle");
        }
    }

    static void method3(int i, int j, int k) {
        // IF - ELSE and NESTED IF

        System.out.println(i + " || " + j + " || " + k);
        if (i == (j + k)) {
            System.out.println("equals");
            if (i == j) {
                System.out.println(" K is ZERO");
            } else if (i == k) {
                System.out.println(" J is ZERO");
            }
        } else {
            System.out.println("NOT equals");
        }
    }

    static void method4(int i, int j, int k) {

//        AND - first -- second -- result
//              FALSE -- doesnot check  -- FALSE
//                TRUE -- it will check (TRUE) - TRUE
//                TRUE -- it will check (FALSE) - FALSE
        if ((i == j) && (i == k)) {
            System.out.println(" FULLY MATCHED ");
        } else if ((i == j) || (i == k)) {
            System.out.println(" either MATCHED ");
        } else {
            System.out.println(" neither MATCHED");
        }
    }


    static void method5(char c) {

        switch (c) {
            case 'A':
                System.out.println("Acceleration");
                break;
            case 'B':
                System.out.println("Break");
                break;
            case 'C':
                System.out.println("Clutch");
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }
    }

    static void method6(Action action) {

        switch (action) {
            case A:
                System.out.println("Acceleration");
                break;
            case B:
                System.out.println("Break");
                break;
            case C:
                System.out.println("Clutch");
                break;
            default:
                System.out.println("DEFAULT");
                break;
        }
    }
}
