package TheDoor;

import util.input;

public class doorApp {


    public static void main(String[] args) {
        input input = new input();
        Story story = new Story();
        System.out.println("Enter your name:\n");
        String name = input.getString();
        Player player = new Player(name);
        story.introduction(player);
    }
}
