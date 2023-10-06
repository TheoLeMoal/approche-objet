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
		Personne pers2 = new Personne("Le Moal", "Theo", addr2);
		System.out.println(pers1);
	}

}