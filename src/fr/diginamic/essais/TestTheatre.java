package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Theatre n°1", 100, 0, 0);
		theatre.inscrire(15, 10.99);
		theatre.inscrire(30, 10.99);
		theatre.inscrire(5, 10.99);
		theatre.inscrire(25, 10.99);
		theatre.inscrire(10, 10.99);
		theatre.inscrire(16, 10.99);
		System.out.println("Nombre de personne inscrit : " + theatre.getInscrits());
		System.out.println("La recette totale est de : " + theatre.getRecette() + "€");
	}
}
