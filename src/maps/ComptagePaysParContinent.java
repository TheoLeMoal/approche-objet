package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
        // Créer une liste de pays
        List<Pays> paysList = new ArrayList<>();
        
        paysList.add(new Pays("France", 65000000, "Europe"));
        paysList.add(new Pays("Allemagne", 80000000, "Europe"));
        paysList.add(new Pays("Belgique", 10000000, "Europe"));
        paysList.add(new Pays("Russie", 150000000, "Asie"));
        paysList.add(new Pays("Chine", 1400000000, "Asie"));
        paysList.add(new Pays("Indonésie", 220000000, "Océanie"));
        paysList.add(new Pays("Australie", 20000000, "Océanie"));
        
        // Créer une HashMap pour compter le nombre de pays par continent
        Map<String, Integer> comptageParContinent = new HashMap<>();
        
        // Parcourir la liste de pays et compter les pays par continent
        for (Pays pays : paysList) {
            String continent = pays.getContinent();
            comptageParContinent.put(continent, comptageParContinent.getOrDefault(continent, 0) + 1);
        }
        
        // Afficher le comptage par continent
        for (Map.Entry<String, Integer> entry : comptageParContinent.entrySet()) {
            System.out.println("Continent : " + entry.getKey() + ", Nombre de pays : " + entry.getValue());
        }
    }
	
}
