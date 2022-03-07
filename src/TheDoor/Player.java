package TheDoor;

public class Player {
    private final String name;
    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    private int health;
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    private String weapon;
    public String getWeapon() {
        return  weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


}
