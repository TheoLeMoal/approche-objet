package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> listeVilles = new ArrayList<>();
        listeVilles.add("Nice");
        listeVilles.add("Carcassonne");
        listeVilles.add("Narbonne");
        listeVilles.add("Lyon");
        listeVilles.add("Foix");
        listeVilles.add("Pau");
        listeVilles.add("Marseille");
        listeVilles.add("Tarbes");

        // Rechercher la ville avec le plus grand nombre de lettres
        String villePlusLongue = "";
        for (String ville : listeVilles) {
            if (ville.length() > villePlusLongue.length()) {
                villePlusLongue = ville;
            }
        }
        System.out.println("Ville avec le plus grand nombre de lettres : " + villePlusLongue);

        // Mettre toutes les villes en majuscules
        for (int i = 0; i < listeVilles.size(); i++) {
            String ville = listeVilles.get(i);
            listeVilles.set(i, ville.toUpperCase());
        }

        // Supprimer les villes qui commence par la lettre "N"
        listeVilles.removeIf(ville -> ville.startsWith("N"));

        // Afficher la liste
        System.out.println("Liste résultante : " + listeVilles);
    }
}
