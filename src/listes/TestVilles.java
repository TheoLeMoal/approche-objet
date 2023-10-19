package listes;

import java.util.ArrayList;

public class TestVilles {
    public static void main(String[] args) {
        // Créez une ArrayList de villes
        ArrayList<Ville> listeVilles = new ArrayList<>();
        listeVilles.add(new Ville("New York", 8537673, Continent.AMERIQUE));
        listeVilles.add(new Ville("Paris", 2175601, Continent.EUROPE));
        listeVilles.add(new Ville("Pékin", 21516000, Continent.ASIE));
        listeVilles.add(new Ville("Moscou", 12615882, Continent.EUROPE));
        listeVilles.add(new Ville("Berlin", 3759493, Continent.EUROPE));
        listeVilles.add(new Ville("Sydney", 4627345, Continent.OCEANIE));
        listeVilles.add(new Ville("Sao Paulo", 12106920, Continent.AMERIQUE));
        listeVilles.add(new Ville("Dakar", 1040444, Continent.AFRIQUE));

        // Recherchez et affichez la ville la plus peuplée
        Ville villePlusPeuplee = listeVilles.get(0);
        for (Ville ville : listeVilles) {
            if (ville.getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
                villePlusPeuplee = ville;
            }
        }
        System.out.println("La ville la plus peuplée : " + villePlusPeuplee);

        // Supprimez la ville la moins peuplée
        Ville villeMoinsPeuplee = listeVilles.get(0);
        for (Ville ville : listeVilles) {
            if (ville.getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
                villeMoinsPeuplee = ville;
            }
        }
        listeVilles.remove(villeMoinsPeuplee);

        // Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        for (Ville ville : listeVilles) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        // Affichez la liste résultante
        System.out.println("Liste résultante : " + listeVilles);
    }
}
