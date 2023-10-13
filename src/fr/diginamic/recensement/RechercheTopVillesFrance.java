package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RechercheTopVillesFrance extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
        // Obtenez la liste des villes de france
        List<Ville> villes = recensement.getVilles();

        if (villes.isEmpty()) {
            System.out.println("Aucune ville trouvée.");
        } else {
            // Triéé la liste des villes par population
            villes.sort((ville1, ville2) -> ville2.getPopulationTotale() - ville1.getPopulationTotale());

            // Affichez les 10 villes les plus peuplées de france
            int limit = Math.min(10, villes.size());
            System.out.println("\nLes 10 villes les plus peuplées de france ");
            for (int i = 0; i < limit; i++) {
                Ville ville = villes.get(i);
                System.out.println(ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());
            }
        }
	}

}
