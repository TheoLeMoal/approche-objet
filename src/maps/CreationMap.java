package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
        // Créez une map pour stocker les salaires en fonction du prénom de la personne
        Map<String, Double> mapSalaires = new HashMap<>();

        // Ajoutez les données des employés et leurs salaires à la map
        mapSalaires.put("Paul", 1750.0);
        mapSalaires.put("Hicham", 1825.0);
        mapSalaires.put("Yu", 2250.0);
        mapSalaires.put("Ingrid", 2015.0);
        mapSalaires.put("Chantal", 2418.0);

        // Affichez la taille de la map
        System.out.println("Taille de la map : " + mapSalaires.size());
	}

}
