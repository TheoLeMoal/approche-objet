package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        listeEntiers.add(-1);
        listeEntiers.add(5);
        listeEntiers.add(7);
        listeEntiers.add(3);
        listeEntiers.add(-2);
        listeEntiers.add(4);
        listeEntiers.add(8);
        listeEntiers.add(5);

        // Afficher tous les éléments de la liste
        for (int nombre : listeEntiers) {
            System.out.println(nombre);
        }

        // Afficher la taille de la liste
        System.out.println("Taille de la liste : " + listeEntiers.size());

        // Afficher le plus grand élément de la liste
        int plusGrand = Integer.MIN_VALUE;
        for (int nombre : listeEntiers) {
            if (nombre > plusGrand) {
                plusGrand = nombre;
            }
        }
        System.out.println("Plus grand élément : " + plusGrand);

        // Supprimer le plus petit élément de la liste
        int plusPetit = Integer.MAX_VALUE;
        for (int nombre : listeEntiers) {
            if (nombre < plusPetit) {
                plusPetit = nombre;
            }
        }
        listeEntiers.remove(Integer.valueOf(plusPetit));
        System.out.println("listeEntiers = " + listeEntiers);

        // Rechercher tous les éléments négatifs et les mettre en positifs
        for (int i = 0; i < listeEntiers.size(); i++) {
            int nombre = listeEntiers.get(i);
            if (nombre < 0) {
                listeEntiers.set(i, -nombre);
            }
        }

        // Afficher la liste
        System.out.println("listeEntiers = " + listeEntiers);
    }
}
