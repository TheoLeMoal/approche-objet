package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison(10);

        /**
         *  Ajout de pièces à la maison
         */
        maison.ajouterPiece(new Chambre(20.0, 0));
        maison.ajouterPiece(new Cuisine(15.0, 0));
        maison.ajouterPiece(new Salon(30.0, 1));
        maison.ajouterPiece(new SalleDeBain(10.0, 1));
        maison.ajouterPiece(new WC(5.0, 2));

        /**
         *  Affichage de la superficie totale de la maison
         */
        System.out.println("Superficie totale de la maison : " + maison.getSuperficieTotale());

        /**
         *  Affichage de la superficie du 1er étage
         */
        System.out.println("Superficie du 1er étage : " + maison.getSuperficieEtage(1));

        /**
         *  Affichage de la superficie des chambres
         */
        System.out.println("Superficie des chambres : " + maison.getSuperficieParType(Chambre.class));

        /**
         *  Affichage du nombre de salles de bain
         */
        System.out.println("Nombre de salles de bain : " + maison.getNombreDePiecesParType(SalleDeBain.class));
    }
}