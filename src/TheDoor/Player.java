package TheDoor;

public class Player {
    private final String name;
    private static String weapon;
    private int health;
    private static int damage;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        Player.weapon = weapon;
        System.out.printf("You equip %s\n", weapon);
        setDamage(weapon);
    }

    public int getDamage() {
        return Player.damage;
    }

    public void setDamage(String weapon) {
        if (weapon.equals("fist")){
            Player.damage = 2;
        } else if(weapon.equals("keys")) {
            Player.damage = 4;
        }
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        health = 100;
        weapon = "fist";
        damage = 2;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }




}
