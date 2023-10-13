package fr.diginamic.jdr;

import java.util.Random;

class Troll extends Creature {
    public Troll() {
        super(10 + new Random().nextInt(6), 20 + new Random().nextInt(11), "Troll");
    }
}
