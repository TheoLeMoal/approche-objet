package entites;

import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		/**
		 * Adresse
		 */
		AdressePostale addr1 = new AdressePostale("12", "clos mistral", 26250, "Livron sur drôme");
		AdressePostale addr2 = new AdressePostale("11", "clos mistral", 26250, "Livron sur drôme");
		/**
		 * Personne
		 */
		Personne pers1 = new Personne("Le Moal", "Theo", addr1);
		//On modifie l'adresse
		pers1.setAdresse(addr2);
		Personne pers2 = new Personne();
		/**
		 * Affichage
		 */
		System.out.println(pers1);
		System.out.println(pers2);
		
	
	}

}
