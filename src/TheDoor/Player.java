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

    public void equip(Weapon weapon) {

    }


}
