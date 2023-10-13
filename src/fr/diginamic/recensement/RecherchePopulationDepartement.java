package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.recensement.Ville;

public class RecherchePopulationDepartement extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
        int population = 0;
        String codeDepartement = scanner.nextLine();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equals(codeDepartement)) {
            	population += ville.getPopulationTotale();
            }
        }

        System.out.println("\nPopulation du " + codeDepartement + " : " + population + "\n");
	}

}
