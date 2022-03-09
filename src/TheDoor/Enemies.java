package TheDoor;

public class Enemies {
    private final String name;
    private final String weapon;
    private int health;
    private final int damage;
    private int hitChance;


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


    Enemies(String name, String weapon, int health, int damage, int hitChance) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weapon = weapon;
        this.hitChance = hitChance;
    }


public static Enemies getRandomEnemy(){
    double random = Math.random();
    if(random <= .33){
        return new Enemies("hound", "bites", 40, 10, 10);
    } else if (random > .34 && random < .66){
        return new Enemies("screamer", "knife", 40, 15, 10);
    } else if (random >= .66) {
        return new Enemies("ghoul", "claws", 50, 10, 10);
    }
    return null;
}






}
