package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RechercheTopVillesParDepartement extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le code du département : ");
        String codeDepartement = scanner.next();

        // Obtenez la liste des villes du département spécifié
        List<Ville> villes = recensement.getVillesByDepartement(codeDepartement);

        if (villes.isEmpty()) {
            System.out.println("Aucune ville trouvée pour ce département.");
        } else {
            // Triez la liste des villes par population (vous devrez implémenter la méthode compareTo dans la classe Ville)
            villes.sort((ville1, ville2) -> ville2.getPopulationTotale() - ville1.getPopulationTotale());

            // Affichez les 10 villes les plus peuplées du département
            int limit = Math.min(10, villes.size());
            System.out.println("\nLes 10 villes les plus peuplées du département " + codeDepartement + " :");
            for (int i = 0; i < limit; i++) {
                Ville ville = villes.get(i);
                System.out.println(ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());
            }
        }
	}

}
