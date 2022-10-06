package com.lesson2.j5_dash_it;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Special characters:");
//        System.out.println("\n Change line");
//        System.out.println("\t Tab");
//        System.out.println("Hello I am very \"happy\" to see you!");
//        System.out.println("C:\\MyFiles\\SomeDocument.txt");

//        System.out.print("Hi\n");
//        // SAME AS
//        System.out.println("Hi");

        // TODO: ask user for input later
        String word = "banana";

//        for (int i = 0; i < word.length(); i++) {
//            System.out.println(i + ": " + word.charAt(i));
//        }


        // SOLUTION 1 (QUITE INTERESTING BUT NO)
//        for (int i = 0; i < word.length(); i++) {
//            System.out.print(word.charAt(i) + "-");
//        }
//        System.out.println("\b");

        // SOLUTION 2
//        for (int i = 0; i < word.length() - 1; i++) {
//            System.out.print(word.charAt(i) + "-");
//        }
//        int lastLetterPos = word.length() - 1;
//        char lastLetter = word.charAt(lastLetterPos);
//        System.out.println(lastLetter);

        // SOLUTION 3
//        System.out.print(word.charAt(0));
//        for (int i = 1; i < word.length(); i++) {
//            System.out.print("-" + word.charAt(i));
//        }

        // SOLUTION 4
//        for (int i = 0; i < word.length(); i++) {
//            if (i == word.length() - 1) { // i is the last iteration of the loop
//                System.out.print(word.charAt(i));
//            } else {
//                System.out.print(word.charAt(i) + "-");
//            }
//        }

        // SOLUTION 5
//        for (int i = 0; i < word.length(); i++) {
//            if (i == 0) { // i is the first iteration of the loop
//                System.out.print(word.charAt(i));
//            } else {
//                System.out.print("-" + word.charAt(i));
//            }
//        }

        // SOLUTION 6
//        for (int i = 0; i < word.length(); i++) {
//            if (i > 0) {
//                System.out.print("-");
//            }
//            System.out.print(word.charAt(i));
//        }

        // SOLUTION 7
        String output = "";
        for (int i = 0; i < word.length(); i++) {
            if (i > 0) {
                output += "-";
            }
            output +=word.charAt(i);
        }
        System.out.println(output);


        // THIS WAS JUST AN EXAMPLE
//        String name = "Joe";
//        name = name + " Smith";
//        name += " Smith";
//        name += 'A';
//
//        System.out.println(name);





    }
}
