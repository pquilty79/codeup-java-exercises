import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {
        int guesses = 1;
        counter(guesses);
    }
    public static void evaluate(int random) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100:");
        String guess = scanner.nextLine().trim();
        try {
            if (Integer.parseInt(guess) == random) {
                System.out.println("GOOD GUESS!");
                System.out.println("Would you like to play again?");
                String response = scanner.nextLine().toLowerCase().trim();
                if (response.equals("y")) {
                    counter(1);
                }
            } else if (Integer.parseInt(guess)  > random) {
                System.out.println("LOWER");
            } else if (Integer.parseInt(guess) < random){
                System.out.println("HIGHER");
            }
        } catch (NumberFormatException e) {
            System.out.println(guess + " is not a valid input");
//            evaluate(random);
        }
    }
    public static void counter(int guesses) {
        int random = (int) Math.ceil(Math.random() * 100);
        do {
            System.out.printf("Attempt #%d%n", guesses);
            evaluate(random);
            guesses++;
        } while (guesses < 10);
        System.out.println("Too many attempts. Game Over");
        }
}
