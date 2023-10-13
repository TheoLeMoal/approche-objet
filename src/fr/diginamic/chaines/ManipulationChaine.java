package fr.diginamic.chaines;

import entites.Salaire;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		/**
		 * Utilisez la méthode charAt(int index) pour afficher le premier caractère de la chaine de caractères
		 */
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);
		/**
		 * Utilisez la méthode length() pour afficher la longueur de la chaine de caractères
		 */
		System.out.println("Longueur de la chaine de caractères : " + chaine.length());
		/**
		 * Utilisez la méthode indexOf(char c) pour afficher l’index du premier « ; » contenu dans la chaine de caractères
		 */
		System.out.println("Index du premier « ; » : " + chaine.indexOf(';'));
		/**
		 * La méthode substring(int start, int end) permet d’extraire une portion de chaine de caractères comprise entre un index de début (inclus) et un index de fin (exclu).
		 * 
		 * Combinez la méthode substring et indexOf pour extraire le nom de famille de la personne.
		 */
		String nom = chaine.substring(0, chaine.indexOf(';'));
		System.out.println(nom);
		/**
		 * Utilisez la méthode toUpperCase() pour afficher le nom de famille en majuscules.
		 */
		System.out.println("Nom de famille en majuscules : " + nom.toUpperCase());
		/**
		 * Utilisez la méthode toLowerCase() pour afficher le nom de famille en minuscules.
		 */
		System.out.println("Nom de famille en minuscule : " + nom.toLowerCase());
		/**
		 * Utilisez la méthode split pour découper la chaine de caractères en morceaux. La
		 * méthode Le séparateur est le caractère « ; ». Cette méthode retourne un tableau.
		 * Affichez le tableau ainsi obtenu.
		 */
		String[] tab = chaine.split(";");
        for (String morceau : tab) {
            System.out.println(morceau + " ");
        }
        Salaire salaire = new Salaire(tab[0], tab[1], Double.parseDouble(tab[2].replace(" ", "")));
        System.out.println(salaire);
	}

}
