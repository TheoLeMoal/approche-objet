package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {

	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		/**
		 * Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		 * Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		 */
		for (Map.Entry<Integer, String> entry : mapVilles.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " " + val);
		}
		/**
		 * Afficher la taille de la map
		 */
		System.out.println(mapVilles.size());
	}
}
