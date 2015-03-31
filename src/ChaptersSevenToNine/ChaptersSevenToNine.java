package ChaptersSevenToNine;

import java.util.ArrayList;

/**
 * Create Orc and Troll classes that implement a Monster interface with
 * takeDamage(int amount), String name(), and int currentHitpoints() methods.
 * Store instances of both classes and store them in an ArrayList.
 * Iterate through the list and make each monster take 10 points of damage.
 * After you have damaged all of the monsters, report the name and current hit points of all monsters.
 * Orcs are named “Orc” and have 20 initial hitpoints
 * Trolls are named “Troll”, have 40 hit points and only take half damage
 * Created by David on 3/31/2015.
 */
public class ChaptersSevenToNine {
    public static void main(String[] args) {
        ArrayList<Monster> monsterArrayList = new ArrayList<Monster>();

        for (int i = 0; i < 8; ++i) {
            Monster curMonster = null;
            if (i % 2 == 0) {
                curMonster = new Orc();
            } else {
                curMonster = new Troll();
            }
            monsterArrayList.add(curMonster);
            curMonster.takeDamage(10);
        }

        // report damage on all of the monsters
        for (Monster curMonster : monsterArrayList) {
            System.out.println("Monster " + curMonster.name() + " has " + curMonster.currentHitpoints() + " of health left");
        }
    }
}
