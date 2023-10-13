package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.recensement.Ville;

public class RecherchePopulationRegion extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
        int population = 0;
        String nomRegion = scanner.nextLine();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
            	population += ville.getPopulationTotale();
            }
        }

        System.out.println("\nPopulation de la région " + nomRegion + " : " + population + "\n");
		
	}

}
