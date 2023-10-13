package fr.diginamic.jdr;

import java.util.Random;

class Loup extends Creature {
    public Loup() {
        super(3 + new Random().nextInt(6), 5 + new Random().nextInt(6), "Loup");
    }
}
