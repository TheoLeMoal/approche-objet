package fr.diginamic.jdr;

import java.util.Random;

class Gobelin extends Creature {
    public Gobelin() {
        super(5 + new Random().nextInt(6), 10 + new Random().nextInt(6), "Gobelin");
    }
}
