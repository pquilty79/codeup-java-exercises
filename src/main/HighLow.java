import java.util.Objects;
import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        do {
            if (counter(1)) {
                System.out.println("Game Over");
                System.out.println("Would you like to play again? Y/N");
                answer = scanner.next().toLowerCase();
            }
        } while (Objects.requireNonNull(answer).startsWith("y"));
    }
    public static boolean counter(int guesses) {
        int random = (int) Math.ceil(Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100:");
        while (guesses < 10) {
        String guess = scanner.nextLine().trim();
        try {
            if (Integer.parseInt(guess) == random) {
                System.out.println("GOOD GUESS!");
                System.out.println("YOU WIN!");
                guesses = 10;
            } else if (Integer.parseInt(guess) > random) {
                System.out.println("LOWER");
                guesses++;
                System.out.printf("Guess %d of 10%n", guesses);

            } else if (Integer.parseInt(guess) < random) {
                System.out.println("HIGHER");
                guesses++;
                System.out.printf("Guess %d of 10%n", guesses);
            }
        } catch (NumberFormatException e) {
            System.out.println(guess + " is not a valid input");
            }
        }
        return true;
    }


}

