package fr.diginamic.listes;
import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> listeEntiers = new ArrayList<>();

        // Ajouter les nombres de 1 à 100 à la liste
        for (int i = 1; i <= 100; i++) {
            listeEntiers.add(i);
        }

        // Afficher la taille de la liste
        System.out.println("Taille de la liste : " + listeEntiers.size());
    }
}
