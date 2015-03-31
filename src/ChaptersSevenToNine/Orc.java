package ChaptersSevenToNine;

/**
 * Orcs are named “Orc” and have 20 initial hitpoints
 *
 * Created by David on 3/31/2015.
 */
public class Orc implements Monster {
    private int health = 20;
    private String name = "Orc";

    @Override
    public void takeDamage(int amount) {
        health -= amount;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int currentHitpoints() {
        return health;
    }
}
