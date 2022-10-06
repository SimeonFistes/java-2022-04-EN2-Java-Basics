package com.lesson1.j4_string_compare;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ==
        // !=
        // >
        // >=
        // <
        // <=
        // Comparison Operators only Compare Numbers

//        String name1 = "Joe";
//        String name2 = "Jo";
//        name2 += "e";

        Scanner input = new Scanner(System.in);
        System.out.println("Insert the first name please:");
        String name1 = input.nextLine();

        System.out.println("Insert the second name please:");
        String name2 = input.nextLine();

        if (name1 == name2) {
            System.out.println("These strings have the same address");
        } else {
            System.out.println("These strings have a different address");
        }

        if (name1.equals(name2)) {
            System.out.println("These string have the same content");
        } else {
            System.out.println("These strings are different");
        }
    }

    public static boolean myStringEquals(String value1, String value2) {
        if (value1.length() != value2.length()) {
            return false;
        }

        for (int i = 0; i < value1.length(); i++) {
            if (value1.charAt(i) != value2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
