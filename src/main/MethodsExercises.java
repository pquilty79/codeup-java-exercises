import java.util.Locale;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(4, 3));
//        System.out.println(subtract(4, 3));
//        System.out.println(multiply(4, 3));
//        System.out.println(divide(4, 0));
//        System.out.println(modulus(4, 3));
        System.out.println(mulTwoPly(3, 4));
//        getFactor();
//        dicee();




    }



    // 1
    public static int add(int num1,int num2 ) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    // without using the * operator
    public static int mulTwoPly(int num1, int num2)  {
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum = sum + num2;
        }
        return sum;
    }



    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }
    //2
    public static void getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput >= min && userInput <= max) {
            System.out.printf("This number is between %d and %d", min, max);
            return;
        }
        getInteger(min, max);
    }
    //3
    public static void getFactor() {
            Scanner scanner = new Scanner(System.in);
            int userInput;
            System.out.print("Enter a number between 1 and 15: ");
            userInput = Integer.parseInt(scanner.nextLine());
            int fact = 1;
            if (userInput >= 1 && userInput <= 15) {
            for (int i = 1; i <= userInput; i++) {
                    fact *= i;
                }
                System.out.println(userInput + "! is: " + fact);
            } else {
                getFactor();
            }
    }
    //4
    public static void dicee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many sides do your dice have?");
        int sides = Integer.parseInt(scanner.nextLine().trim());
        int diceOne = (int) Math.ceil(Math.random() * sides);
        int diceTwo = (int) Math.ceil(Math.random() * sides);
        int total = diceOne + diceTwo;
        System.out.printf("You rolled a %d and a %d for a total of %d hit point damage to the target.%n", diceOne, diceTwo, total);
        System.out.println("Would you like to roll again? Y/N");
        String response = scanner.nextLine().toLowerCase().trim();
        if (response.equals("y")) {
            dicee();
        }
    }
    //5 made as a new class

}
