package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RechercheTopRegionsPopulation extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Region> regions = recensement.getRegions();
		
        // Triez la liste des régions par population (vous devrez implémenter la méthode compareTo dans la classe Region)
        regions.sort((region1, region2) -> region2.getPopulation() - region1.getPopulation());

        // Affichez les 10 régions les plus peuplées
        int limit = Math.min(10, regions.size());
        System.out.println("\nLes 10 régions les plus peuplées :");
        for (int i = 0; i < limit; i++) {
            Region region = regions.get(i);
            System.out.println(region.getNom() + " - Population : " + region.getPopulation());
        }
	}

}
