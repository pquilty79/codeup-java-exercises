package TheDoor;

import util.Input;

public class DoorApp {


    public static void main(String[] args) {
        Input input = new Input();
        Story story = new Story();
        System.out.println("Enter your name:\n");
        String name = input.getString();
        Player player = new Player(name);
        player.setHealth(100);
        story.introduction(player);
    }
}
