package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

        // Afficher tous les éléments de la liste
        System.out.println("Éléments de la liste : " + liste);

        // Afficher la taille de la liste
        System.out.println("Taille de la liste : " + liste.size());

        // Rechercher et afficher le plus grand élément de la liste
        int max = liste.get(0);
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i) > max) {
                max = liste.get(i);
            }
        }
        System.out.println("Le plus grand élément de la liste : " + max);

        // Supprimer le plus petit élément de la liste
        int min = liste.get(0);
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i) < min) {
                min = liste.get(i);
            }
        }
        liste.remove(Integer.valueOf(min));
        System.out.println("Après suppression du plus petit élément : " + liste);

        // Rechercher tous les éléments négatifs et les modifier pour devenir positifs
        for (int i = 0; i < liste.size(); i++) {
            int valeur = liste.get(i);
            if (valeur < 0) {
            	liste.set(i, -valeur);
            }
        }

        // Afficher la liste résultante
        System.out.println("Liste résultante : " + liste);
	}

}
