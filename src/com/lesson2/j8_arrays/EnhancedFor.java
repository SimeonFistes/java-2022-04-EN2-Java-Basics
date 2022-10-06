package com.lesson2.j8_arrays;

public class EnhancedFor {

    public static void main(String[] args) {

        int[] numbers = { 2, 5, 6, 1 };
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(i + ": " + number);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
