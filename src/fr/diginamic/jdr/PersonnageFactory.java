package fr.diginamic.jdr;

import java.util.Random;

public class PersonnageFactory{
	public static Personnage creerPersonnage() {
	    Random random = new Random();
	    int force = random.nextInt(7) + 12;
	    int pointsDeVie = random.nextInt(31) + 20;
	    System.out.println("Votre personnage a " + pointsDeVie + " PV et " + force + " de force\n");
	    return new Personnage(force, pointsDeVie);
	}
}
