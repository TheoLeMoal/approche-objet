package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws Exception{
        String file = "C:/Users/theol/Desktop/Cours/Java/approche-objet/src/fr/diginamic/fichier/recensement.csv";
        Path pathFile = Paths.get(file);
        List<String> lignes = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        lignes.remove(0);
        ArrayList<Ville> villes = new ArrayList<>();
        for (String ligne : lignes) {
            String[] tokens = ligne.split(";");
            String nom = tokens[5].replaceAll("\\s", ""); // Enlève les espaces du nom
            String codeDepartement = tokens[2].replaceAll("\\s", ""); // Enlève les espaces du code département
            String nomRegion = tokens[1].replaceAll("\\s", ""); // Enlève les espaces du nom de la région
            int populationTotale = Integer.parseInt(tokens[9].replaceAll("\\s", "")); // Enlève les espaces de la population totale
            if (populationTotale > 25000){
                Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
                villes.add(ville);
            }
        }
        List<String> lignes2= new ArrayList<>();
        lignes2.add("Nom de la commune;Code département;Nom de la région;Population totale");
        for (Ville ville : villes) {
            lignes2.add(ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion()+ ";" + ville.getPopulationTotale());
        }
        Path pathCible= Paths.get("C:/Users/theol/Desktop/Cours/Java/approche-objet/src/fr/diginamic/fichier/recensement3.csv");Files.write(pathCible, lignes2);
    }
}