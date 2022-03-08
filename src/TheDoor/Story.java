package TheDoor;

import util.Input;

import java.sql.SQLOutput;

public class Story {
    public void introduction(Player player) {
        Input input = new Input();
        String introduction = "Your GPS tells you you have arrived at your new client's house for your appointment.\n " +
                "The client, Ted Leviathans, contacted you last week regarding the sale of his late parent's house.\n " +
                "After meeting Ted over Zoom, you scheduled a follow up for this morning at the property.\n " +
                "As you arrive, the house appears run down and no other cars are around.\n" +
                "You note some piles of what you consider junk are on the front lawn.\n" +
                "Since it appears you are the only one there, you message Ted that you are at the house,\n and he quickly replies that he is inside, finishing cleaning out the basement before garbage day tomorrow.\n" +
                "You head inside, and hear noise coming from an open door with a stairway leading downwards.\n" +
                "'Down here " + player.getName() + "!', calls the familiar voice of Ted Leviathans.\n" +
                "You head into the basement down a surprisingly long staircase that rickets each step you take.\n" +
                "When you reach the bottom, a large steel door blocks the entrance\n";
        System.out.println(introduction);
        if (input.yesNo("Would you like to open the door?")) {
            chapterOne(player);
        } else {
            System.out.println("In fear, you swiftly exit the house, get in your car, and drive away.\n Ted Leviathan's phone number is disconnected when you try to follow up.\n For the rest of your life you wonder 'what if?'");
        }
    }

    private static void restart(Player player) {
        Input input = new Input();
        String restart = "You awake on the basement floor at the foot of the staircase. You appear to be unharmed, as if nothing happened.\n";
        System.out.println(restart);
        while (input.yesNo("Would you like to open the door?")) {
            chapterOne(player);
        }
        System.out.println("In fear, you swiftly exit the house, get in your car, and drive away.\n For the rest of your life you wonder 'what if?'");

    }

    private static void chapterOne(Player player) {
        Input input = new Input();
        String entrance = "The doorknob turns easily enough, but the door is so wide you have to wedge yourself around it just to squeeze\n" +
                "between it and the wall. As soon as you on the other side, it slams shut, forcing you to stumble forward and fall flat.\n" +
                "It is pitch black inside, except for the light of your cellphone on the ground in front of you.\n" +
                "You pick up your cellphone and see you have no reception.\n";
        System.out.println(entrance);
        if(input.yesNo("Would you like to use your cellphone as a flashlight?")){
            System.out.println("Your battery is fully charged and are relieved find your flashlight app\n" +
                    "It provides enough light to see that you are laying on a narrow path that with a dark deep ravine on your left.\n" +
                    "You carefully stand up and look around. You appear to be in a cave. The path turns ahead, revealing little of what lies ahead.\n" +
                    "You hear a mixture of screams, cries, and laughter echoing through the tunnel");
            chapterTwo(player);
        } else {
            System.out.println("You fumble around in the to get back up. After a few steps you fall to into a deep chasm.\n" +
                    "The fall results in compound fractures to both legs. You scream for help. Out of the darkness a voice replies 'There is only one way out'\n" +
                    "You cry out again, but no other answers follow. Slowly, painfully, you bleed out in the darkens.");
            restart(player);
        }
    }


    private static void chapterTwo(Player player) {
        Input input = new Input();
        System.out.println("Enter the number of your next action: 1) Move ahead 2) Check your pockets 3) Call out for help\n");
        int response = input.getInt(1, 3);
        if(response == 1) {
            chapterThree(player);
        } else if (response == 2) {
            System.out.println("You check you pockets for anything useful and find only you car keys.");
            if(input.yesNo("Would you like to equip our keys as a weapon?")){
//                player.setWeapon(String.valueOf(Weapon.keys));
                System.out.println("You grasp your car keys in your fist, with the keys sticking through your fingers.\n" +
                        "If there is trouble ahead, you hope you are ready");
                chapterThree(player);
            }  else {
//                player.setWeapon(String.valueOf(Weapon.fist));
                chapterThree(player);
            }
        } else if (response == 3){
            System.out.println("You shout several times. 'Is there anyone here? Help!'\n" +
                    "You hear in the distance what the screech of a metal latch followed by the sound of barking dogs\n" +
                    "In seconds two huge black hounds with red eyes and open foaming jaws round the corner and pounce on you.\n" +
                    "Before you can fight back one tears out your throat. Blood spurts out. You helplessly clutch the wound as they continue to rip you apart.\n" +
                    "Out of the darkness a voice rasps: 'There is only one way out'\n" +
                    "Your last sight is of jaws closing over your eyes \n");
            restart(player);
        }
    }
    private static void chapterThree(Player player) {
        Input input = new Input();
        System.out.println("You continue down the mysterious corridor. Around the next you see an elderly man sitting on a stool.\n" +
                "There are chains around his ankles which attach to the cave wall. As you approach you are horrified to see\n" +
                "that his eyes are pinned open and his hands have been removed. The stubs of his arms bare large stitches oozing \n" +
                "with blood and puss. 'The master knows you are here' he says as you creep closer. 'There is only one way out.'\n" +
                "Enter the number of your next action: 1) Ask about the master 2) Ask where you are 3) Ignore him and walk away\n" +
                "4) Ask about the way out 5) Attack");
        int response = input.getInt(1, 5);
        if(response == 1) {
            System.out.println("We are all his slaves; ultimately, so is he.");
        } else if (response == 2) {
            System.out.println("Beyond the world, beyond time, in the master's realm");
        } else if (response == 3) {
            chapterFour(player);
        } else if (response == 4) {
            System.out.println("Death");
        } else if (response == 5) {
            String currentWeapon = player.getWeapon();
//            System.out.printf("Frustrated and fearful, you swing at the old man, doing %d damage", Weapon.getDamage(currentWeapon));
        }

    }
    private static void chapterFour(Player player) {

    }



}
