package fr.diginamic.recensement;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
        Recensement recensement = new Recensement();
        Path path = Paths.get("E:\\Projets java\\approche-objet\\src\\fr\\diginamic\\recensement\\recensement-population.csv");
        recensement.chargerDonnees(path);
		Scanner scanner = new Scanner(System.in);

        while (true) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
	            case 1:
	                RecherchePopulationVille rechercheVille = new RecherchePopulationVille();
	                rechercheVille.traiter(recensement, scanner);
	                break;
	            case 2:
	                RecherchePopulationDepartement rechercheDepartement = new RecherchePopulationDepartement();
	                rechercheDepartement.traiter(recensement, scanner);
	                break;
                case 3:
                	RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion();
                	rechercheRegion.traiter(recensement, scanner);
                    break;
                case 4:
                	RechercheTopRegionsPopulation rechercheTopRegion = new RechercheTopRegionsPopulation();
                	rechercheTopRegion.traiter(recensement, scanner);
                    break;
                case 5:
                	RechercheTopDepartementsPopulation rechercheTopDepartement = new RechercheTopDepartementsPopulation();
                	rechercheTopDepartement.traiter(recensement, scanner);
                    break;
                case 6:
                	RechercheTopVillesParDepartement rechercheTopVilleParDep = new RechercheTopVillesParDepartement();
                	rechercheTopVilleParDep.traiter(recensement, scanner);
                    break;
                case 7:
                	RechercheTopVillesParRegion rechercheTopVilleParRegion = new RechercheTopVillesParRegion();
                	rechercheTopVilleParRegion.traiter(recensement, scanner);
                    break;
                case 8:
                	RechercheTopVillesFrance rechercheTopVillesFrance = new RechercheTopVillesFrance();
                	rechercheTopVillesFrance.traiter(recensement, scanner);
                    break;
                case 9:
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
	}

	/**
	 * Affiche le menu
	 */
    private static void afficherMenu() {
        System.out.println("\nMenu :");
        System.out.println("1. Population d’une ville donnée");
        System.out.println("2. Population d’un département donné");
        System.out.println("3. Population d’une région donnée");
        System.out.println("4. Afficher les 10 régions les plus peuplées");
        System.out.println("5. Afficher les 10 départements les plus peuplés");
        System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
        System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
        System.out.println("8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("9. Sortir");
        System.out.print("Choix : ");
    }
}
