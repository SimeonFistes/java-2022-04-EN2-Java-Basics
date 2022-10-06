package com.lesson2.j8_arrays;

public class Main {

    public static void main(String[] args) {

//        int[] numbers = new int[5];
//
//        int firstNumber = numbers[0];
//        int lastNumber = numbers[numbers.length - 1];
//
//        numbers[0] = 23;
//        numbers[1] = 123;
//        numbers[2] = 1;
//        numbers[3] = 43;
//        numbers[4] = 54;
//
//        int[] numbers2 = { 23, 123, 1, 43, 54 };

        // Create 2 arrays withs 5 numbers each
        // Print both arrays and print which array has the highest total

        int[] array1 = { 43, 1, 32, 34, 10};
        int[] array2 = { 120 };

        int total1 = 0;
        for (int i = 0; i < array1.length; i++) {
//            total = total + array1[i];
            total1 += array1[i];
//            System.out.println("V:" + array1[i]);
//            System.out.println("CT:" + total);
//            System.out.println("-----------------");
        }

        int total2 = 0;
        for (int i = 0; i < array2.length; i++) {
            total2 += array2[i];
        }

        System.out.println("The total for the first array is " + total1);
        System.out.println("The total for the second array is " + total2);

        if (total1 > total2) {
            System.out.println("The first array is bigger");
        } else if (total1 < total2) {
            System.out.println("The second array is bigger");
        } else {
            System.out.println("They are equal");
        }

    }

}
