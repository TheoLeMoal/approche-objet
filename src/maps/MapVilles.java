package maps;

import java.util.HashMap;
import java.util.Map;

import listes.Ville;

public class MapVilles {
    public static void main(String[] args) {
        // Créer une Map pour stocker les villes en fonction de leur nom
        Map<String, Ville> villesMap = new HashMap<>();

        // Ajouter des villes à la Map
        Ville ville1 = new Ville("Paris", 2200000);
        Ville ville2 = new Ville("Marseille", 850000);
        Ville ville3 = new Ville("Lyon", 500000);
        Ville ville4 = new Ville("Toulouse", 475000);

        villesMap.put(ville1.getNom(), ville1);
        villesMap.put(ville2.getNom(), ville2);
        villesMap.put(ville3.getNom(), ville3);
        villesMap.put(ville4.getNom(), ville4);

        // Recherchez et supprimez la ville avec le moins d'habitants
        Ville villeAEnlever = null;
        int minHabitants = Integer.MAX_VALUE;

        for (Ville ville : villesMap.values()) {
            if (ville.getNbHabitants() < minHabitants) {
                minHabitants = ville.getNbHabitants();
                villeAEnlever = ville;
            }
        }
        villesMap.remove(villeAEnlever.getNom());

        // Afficher les villes restantes
        System.out.println("Villes restantes :");
        for (Ville ville : villesMap.values()) {
            System.out.println(ville.getNom() + " - Habitants : " + ville.getNbHabitants());
        }
    }
}
