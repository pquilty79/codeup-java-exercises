package TheDoor;


import java.util.HashMap;

public class Enemies {
    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    private final String name;
    private final String weapon;
    private int health;
    private int damage;
    private Enemies(String name, String weapon, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weapon = weapon;
    }

    static Enemies hound = new Enemies("hound", "bites", 30, 10);
    static Enemies screamer = new Enemies("hound", "bites", 30, 10);
    static Enemies ghoul = new Enemies("hound", "bites", 30, 10);

private static int getRandomInt() {
    return (int) Math.ceil(Math.random() * 100);
}

public static Enemies getRandomEnemy(){
    int random = getRandomInt();
    if(random <= 33){
        return hound;
    } else if (random <= 66){
        return screamer;
    } else {
        return ghoul;
    }
}






}
