package fr.diginamic.fichier;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws Exception{
        String file = "C:/Users/theol/Desktop/Cours/Java/approche-objet/src/fr/diginamic/fichier/recensement.csv";
        Path pathFile = Paths.get(file);
        List<String> lignes1 = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        List<String> lignes2= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lignes2.add(lignes1.get(i));
        }
        Path pathCible= Paths.get("C:/Users/theol/Desktop/Cours/Java/approche-objet/src/fr/diginamic/fichier/recensement2.csv");Files.write(pathCible, lignes2);
        for (String line : lignes2) {
            System.out.println(line);
        }
    }
}
