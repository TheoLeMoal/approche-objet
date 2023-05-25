package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TestListVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Paris", 2206488));
        villes.add(new Ville("Lyon", 513275));
        villes.add(new Ville("Marseille", 861635));
        villes.add(new Ville("Bordeaux", 257804));
        villes.add(new Ville("Toulouse", 479553));

        // Tri avec ComparatorHabitant
        Comparator<Ville> comparatorHabitant = new ComparatorHabitant();
        Collections.sort(villes, comparatorHabitant);

        System.out.println("Tri par nombre d'habitants:");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        System.out.println();

        // Tri avec ComparatorNom
        Comparator<Ville> comparatorNom = new ComparatorNom();
        Collections.sort(villes, comparatorNom);

        System.out.println("Tri par nom de ville:");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
