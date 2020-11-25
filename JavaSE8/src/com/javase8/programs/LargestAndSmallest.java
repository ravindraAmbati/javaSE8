package com.javase8.programs;

public class LargestAndSmallest {
    public static void main(String[] args) {
        System.out.println(largest(2, 3));
        System.out.println(largest(3, 2));
        System.out.println(largest(1, 1));
        System.out.println(smallest(2, 3));
        System.out.println(smallest(3, 2));
        System.out.println(smallest(1, 1));
        System.out.println(largest(2, 3, 1));
        System.out.println(largest(3, 2, 1));
        System.out.println(largest(1, 2, 3));
        System.out.println(largest(3, 1, 2));
        System.out.println(smallest(2, 3, 1));
        System.out.println(smallest(3, 2, 1));
        System.out.println(smallest(1, 2, 3));
        System.out.println(smallest(3, 1, 2));
    }

    private static int smallest(int i, int j, int k) {
        if (i < j && i < k) {
            return i;
        } else if (j < i && j < k) {
            return j;
        } else if (k < i && k < j) {
            return k;
        } else {
            if (i == j && k < i) {
                return k;
            } else if (j == k && i < j) {
                return i;
            } else if (k == i && j < k) {
                return k;
            } else {
                return 0;
            }
        }
    }

    private static int largest(int i, int j, int k) {
        if (i > j && i > k) {
            return i;
        } else if (j > i && j > k) {
            return j;
        } else if (k > i && k > j) {
            return k;
        } else {
            if (i == j && k > i) {
                return k;
            } else if (j == k && i > j) {
                return i;
            } else if (k == i && j > k) {
                return k;
            } else {
                return 0;
            }
        }
    }

    private static int smallest(int n, int m) {
        if (n < m) {
            return n;
        } else if (m < n) {
            return m;
        } else {
            return 0;
        }
    }

    private static int largest(int n, int m) {
        if (n > m) {
            return n;
        } else if (m > n) {
            return m;
        } else {
            return 0;
        }
    }
}
