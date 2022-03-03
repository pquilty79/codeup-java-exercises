
import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brickInTheWall = "We don't need no education\n" +
                "We don't need no thought control";
        System.out.println(brickInTheWall);


        String another = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(another);

        String next = "In windows, the main drive is usually C:\\";
        System.out.println(next);

        String oneMore = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(oneMore);
        scanner.close();
    }
}

