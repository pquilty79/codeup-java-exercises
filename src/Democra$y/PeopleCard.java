package Democra$y;

public class PeopleCard extends Card implements Playable {
    @Override
    public boolean drawCard() {
        return false;
    }

    @Override
    public int changeMoney() {
        return 0;
    }

    @Override
    public int changePopularity() {
        return 0;
    }
}
