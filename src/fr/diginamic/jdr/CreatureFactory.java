package fr.diginamic.jdr;

import java.util.Random;

public class CreatureFactory {
    public static Creature creerCreature() {
        Random random = new Random();
        int choixCreature = random.nextInt(3);

        switch (choixCreature) {
            case 0:
                return new Loup();
            case 1:
                return new Gobelin();
            case 2:
                return new Troll();
            default:
                return null;
        }
    }
}
