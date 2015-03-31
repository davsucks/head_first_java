package ChaptersSevenToNine;

/**
 * Trolls are named “Troll”, have 40 hit points and only take half damage
 * Created by David on 3/31/2015.
 */
public class Troll implements Monster {
    private int health = 40;
    private String name = "Troll";

    @Override
    public void takeDamage(int amount) {
        health -= (amount / 2);
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
