package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RechercheTopDepartementsPopulation extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Departement> departements = recensement.getDepartements();
		
        // Triez la liste des régions par population (vous devrez implémenter la méthode compareTo dans la classe Departement)
        departements.sort((departement1, departement2) -> departement2.getPopulation() - departement1.getPopulation());

        // Affichez les 10 régions les plus peuplées
        int limit = Math.min(10, departements.size());
        System.out.println("\nLes 10 régions les plus peuplées :");
        for (int i = 0; i < limit; i++) {
            Departement departement = departements.get(i);
            System.out.println(departement.getCode() + " - Population : " + departement.getPopulation());
        }
	}

}
