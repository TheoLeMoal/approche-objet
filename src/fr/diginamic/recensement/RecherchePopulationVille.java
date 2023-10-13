package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.recensement.Ville;

public class RecherchePopulationVille extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
        int population = 0;
        String nomVille = scanner.nextLine();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
            	population = ville.getPopulationTotale();
                break;
            }
        }

        System.out.println("\nPopulation de " + nomVille + " : " + population + "\n");
	}

}
