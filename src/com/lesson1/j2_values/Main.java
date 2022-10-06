package com.lesson1.j2_values;

public class Main {

    public static void main(String[] args) {
        // Exercise 1
        // Ask the user for 2 numbers
        // Print only the highest number on the terminal

//        exercise1();

        // Exercise 2
        // Ask the user for 3 numbers
        // Print only the highest number on the terminal

        exercise2();
    }

    public static void exercise1() {
        // TODO: ask the user for input
        int n1 = 89;
        int n2 = 19;

//        if (n1 > n2) {
//            System.out.println(n1);
//        } else {
//            System.out.println(n2);
//        }

        int highest = Math.max(n1, n2);
        System.out.println(highest);
    }

    public static void exercise2() {
        int n1 = 34;
        int n2 = 39;
        int n3 = 30;

        // SOLUTION 1
//        int currentHighest = Math.max(n1, n2);
//        int highest = Math.max(currentHighest, n3);
//
//        System.out.println(highest);



        // SOLUTION 2 (same as 1 but all in 1 line)
//        System.out.println(Math.max(Math.max(n1, n2), n3));

        // SOLUTION 3
//        if (n1 > n2) {
//            if (n1 > n3) {
//                System.out.println(n1);
//            } else {
//                System.out.println(n3);
//            }
//        } else {
//            if (n2 > n3) {
//                System.out.println(n2);
//            } else {
//                System.out.println(n3);
//            }
//        }

        // SOLUTION 4
        int max = n1;

        if (n2 > max) {
            max = n2;
        }

        if (n3 > max) {
            max = n3;
        }

        System.out.println(max);

    }
}
