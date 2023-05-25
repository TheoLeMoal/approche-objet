package fr.diginamic.listes;
import java.util.ArrayList;
public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Afficher la ville la plus peuplée
        Ville plusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > plusPeuplee.getNbHabitants()) {
                plusPeuplee = ville;
            }
        }
        System.out.println("Ville la plus peuplée : " + plusPeuplee);

        // Supprimez la ville la moins peuplée
        Ville moinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < moinsPeuplee.getNbHabitants()) {
                moinsPeuplee = ville;
            }
        }
        villes.remove(moinsPeuplee);
        System.out.println("Liste après suppression de la ville la moins peuplée :");
        for (Ville ville : villes) {
            System.out.println("ville = " + ville);
        }

        // Mettre les villes de plus de 100 000 habitants en majuscules
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }
        System.out.println("Liste après modification des villes :");
        for (Ville ville : villes) {
            System.out.println("ville = " + ville);
        }
    }

}
