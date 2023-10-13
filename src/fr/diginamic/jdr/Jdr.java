package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Jdr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personnage personnage = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Créer le personnage");
            System.out.println("2. Combattre une créature");
            System.out.println("3. Afficher le score");
            System.out.println("4. Sortir\n");
            System.out.print("Saisisez votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    personnage = PersonnageFactory.creerPersonnage();
                    break;
                case 2:
                    if (personnage != null) {
                        combattreCreature(personnage);
                    } else {
                        System.out.println("Créez d'abord un personnage.\n");
                    }
                    break;
                case 3:
                    if (personnage != null) {
                        System.out.println("Score du personnage : " + personnage.getScore()+"\n");
                    } else {
                        System.out.println("Créez d'abord un personnage.\n");
                    }
                    break;
                case 4:
                    System.out.println("Merci d'avoir joué !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.\n");
                    break;
            }
        }
    }
    
    private static void combattreCreature(Personnage personnage) {
        Random random = new Random();
        Creature creature = CreatureFactory.creerCreature();

        while (personnage.getPointsDeVie() > 0 && creature.getPointsDeVie() > 0) {
            int attaquePersonnage = personnage.getForce() + random.nextInt(10) + 1;
            int attaqueCreature = creature.getForce() + random.nextInt(10) + 1;

            if (attaquePersonnage > attaqueCreature) {
                int degats = attaquePersonnage - attaqueCreature;
                creature.subirDegats(degats);
                System.out.print(creature instanceof Loup ? "Loup" : creature instanceof Gobelin ? "Goblin" : "Troll");
                System.out.println(" a subit " + degats + " degats");
            } else if (attaqueCreature > attaquePersonnage) {
                int degats = attaqueCreature - attaquePersonnage;
                personnage.subirDegats(degats);
                System.out.println("Vous avez subit " + degats + " degats");
            }
        }

        if (personnage.getPointsDeVie() <= 0) {
            System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.getScore() + " points.\n");
        } else {
            int scoreGagne = 0;
            if (creature instanceof Loup) {
                scoreGagne = 1;
            } else if (creature instanceof Gobelin) {
                scoreGagne = 2;
            } else if (creature instanceof Troll) {
                scoreGagne = 5;
            }
            personnage.ajouterScore(scoreGagne);
            System.out.println("Votre personnage a gagné le combat contre " + creature.getNom() + " et a obtenu " + scoreGagne + " points.");
            System.out.println("Votre personnage ressort du combat avec " + personnage.getPointsDeVie() + " PV\n");
        }
    }
}
