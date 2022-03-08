package TheDoor;

public class Player {
    private final String name;
    private String weapon;
    private int health;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        health = 100;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

//public class Weapon {
//    static Weapon fist = new Weapon(2);
//    static Weapon keys = new Weapon(4);
//    static Weapon poker = new Weapon(10);
//    static Weapon chair = new Weapon(9);
//    static Weapon chain = new Weapon(8);
//    static Weapon knife = new Weapon(10);
//    static Weapon kick = new Weapon(5);
//
//    private static int damage;
//    public Weapon(int damage) {
//        Weapon.damage = damage;
//    }
//
//
//    public static int getDamage(String weapon) {
//        return Weapon.damage;
//    }
//}


}
