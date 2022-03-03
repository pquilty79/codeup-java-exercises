package main;

import java.util.Objects;
import java.util.Scanner;



public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1a
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
        //1b
//        int i = 0;
//        do {
//            i+=2;
//            System.out.println(i);
//
//        } while (i < 100);
//        int i = 100;
//        do {
//            i-=5;
//            System.out.println(i);
//        } while (i > 10);
//          int x = 2;
//          int y = 2;
//          do {
//              System.out.println(x);
//              x = (int) Math.pow(x, y);
//          } while (x < 1000000);
        //1c
//        for(int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//        for(int i = 100; i >= 10; i -= 5) {
//            System.out.println(i);
//        }
//          for(int x = 2; x < 1000000; x = (int) Math.pow(x, 2)) {
//              System.out.println(x);
//          }
        // 2 Fizzbuzz

//    for(int i = 0; i <= 100; i++) {
//
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("fizzbuzz");
//        } else if (i % 3 == 0) {
//            System.out.println("fizz");
//        } else if (i % 5 == 0) {
//            System.out.println("buzz");
//        } else {
//            System.out.println(i);
//        }
//    }

        // 3 Table of Powers
        String answer;
        do {
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= input; i++) {
                int squared = (int) Math.pow(i, 2.0);
                int cubed = (int) Math.pow(i, 3.0);
                System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
            }
            System.out.println("Would you like to continue? Y/N");
            answer = scanner.next().toLowerCase();
        } while (Objects.equals(answer, "y"));


//         4 grades
        String more;
        do {
            System.out.print("Enter your grade: ");
            double grade = scanner.nextDouble();
            if (grade == 100) {
                System.out.println("You have an A+");
            } else if (grade < 100 && grade > 87) {
                System.out.println("You have an A");
            } else if (grade <= 87 && grade > 79) {
                System.out.println("You have an B");
            } else if (grade <= 79 && grade > 66) {
                System.out.println("You have an C");
            } else if (grade <= 66 && grade > 59) {
                System.out.println("You have an D");
            } else {
                System.out.println("You have an F");
            }
            System.out.println("Would you like to continue? Y/N");
            more = scanner.next().toLowerCase();
        } while (Objects.equals(more, "Y"));


        scanner.close();
    }
}
