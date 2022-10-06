package com.lesson1.j4_string_compare;

public class PrintChars {

    public static void main(String[] args) {

        String name = "Helder Pereira";

        System.out.println(name.length());

//        int lastCharPos = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println(letter);
        }



    }

}
