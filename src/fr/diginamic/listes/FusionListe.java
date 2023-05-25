package fr.diginamic.listes;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<String>();

        // Fusionner les données de liste1 dans liste3
        Iterator<String> iterator1 = liste1.iterator();
        while (iterator1.hasNext()) {
            String element = iterator1.next();
            liste3.add(element);
        }

        // Fusionner les données de liste2 dans liste3
        Iterator<String> iterator2 = liste2.iterator();
        while (iterator2.hasNext()) {
            String element = iterator2.next();
            liste3.add(element);
        }

        // Afficher la liste3
        for (String couleur : liste3) {
            System.out.println("couleur = " + couleur);
        }
    }
}





