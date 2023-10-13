package listes;

import java.util.ArrayList;

public class TestVilles {
    public static void main(String[] args) {
        // Créez une ArrayList de villes
        ArrayList<Ville> listeVilles = new ArrayList<>();
        listeVilles.add(new Ville("Nice", 343000));
        listeVilles.add(new Ville("Carcassonne", 47800));
        listeVilles.add(new Ville("Narbonne", 53400));
        listeVilles.add(new Ville("Lyon", 484000));
        listeVilles.add(new Ville("Foix", 9700));
        listeVilles.add(new Ville("Pau", 77200));
        listeVilles.add(new Ville("Marseille", 850700));
        listeVilles.add(new Ville("Tarbes", 40600));

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
