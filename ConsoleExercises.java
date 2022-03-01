package main;
import java.sql.SQLOutput;
import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. ", pi);
//
//        System.out.print("Enter something: ");
//        int input = scanner.nextInt();
//        System.out.printf("%n You entered %d", input);
// you get an error is you do not enter an integer

//        System.out.print("Enter three words: ");
//        String first = scanner.next();
//        String second = scanner.next();
//        String third = scanner.next();
//        System.out.printf("%nYou entered %s, %s, and %s", first, second, third);
// it will not print the You entered statement until the third is entered.
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.printf(sentence);
        // .nextline() is needed to capture all the words
        System.out.println("Enter the length, width, and height of the room you are in ");
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = length * width;
        double perimeter = 2 * (length + width);
        double volume = area * height;
        System.out.printf("The area of a room with a length of %.2fft and a width of %.2fft is %.2fsq ft.", length, width, area);
        System.out.printf("%nThe perimeter of a room with a length of %.2fft and a width of %.2fft is %.2fft.", length, width, perimeter);
        System.out.printf("%nThe volume of a room with a length of %.2fft, a width of %.2fft, and a height of %.2fft is %.2f cubic ft.", length, width, height, volume);

        scanner.close();
    }
}
