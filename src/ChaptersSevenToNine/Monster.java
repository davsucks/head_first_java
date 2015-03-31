package ChaptersSevenToNine;

/**
 * Monster provides an interface for the takeDamage, name, and currentHitpoints methods.
 * Created by David on 3/31/2015.
 */
public interface Monster {
    void takeDamage(int amount);
    String name();
    int currentHitpoints();

}
