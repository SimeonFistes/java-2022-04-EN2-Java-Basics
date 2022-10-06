package com.students.adam;

import java.util.Arrays;
import java.util.Scanner;

public class Max {

//    public static void main(String[] args) {
//// Exercise 2
//// Ask the user for 3 numbers
//// Print only the highest number on the terminal
//        int max, no1, no2, no3;
//        Scanner scanner = new Scanner(System.in);
//        int[] arrayof3 = new int[3];
//        System.out.println("Please enter 3 numbers, at least 2 of them unequal to each other");
//        no1 = scanner.nextInt();
//        arrayof3[0] = no1;
//        no2 = scanner.nextInt();
//        arrayof3[1] = no2;
//        no3 = scanner.nextInt();
//        arrayof3[2] = no3;
////        do {
////
////        }
////        while (no1 == no2 == no3);
//        max = arrayof3[0];
//        for (int i = 1; i < arrayof3.length; i++)
//            if (arrayof3[i] > arrayof3[i - 1]) {
//                max = arrayof3[i];
//            }
//        System.out.println(max + " is the biggest number");
//
//    }


    public static void main(String[] args) {
        test();
    }
    static void test() {
        String[] names =  {
                "Konstantina",
                "Nikolaus",
                "Attila",
                "Simeon",
                "Gergö",
                "Alexandros",
                "Dávid",
                "Marios",
                "Dániel",
                "Filippos",
                "Odett",
                "Adam",
                "Maria",
                "Ioanna",
                "Ioannis",
                "Helder"
        };

        System.out.println(Arrays.toString(names));




    }
}

