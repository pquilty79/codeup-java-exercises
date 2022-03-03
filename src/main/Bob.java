package main;

import java.util.Objects;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Say something to Bob");
            String response = scanner.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Bob replies: 'Sure'");
            } else if (response.endsWith("!")) {
                System.out.println("Bob replies: 'Whoa, chill out!'");
            } else if (response.equals("")) {
                System.out.println("Bob replies: 'Fine. Be that way!'");
            } else {
                System.out.println("Bob replies: 'Whatever'");
            }
            System.out.println("Would you like to say something else to Bob? Y/N");
            answer = scanner.nextLine().toLowerCase();
        } while (Objects.equals(answer, "y"));






        scanner.close();
    }
}
