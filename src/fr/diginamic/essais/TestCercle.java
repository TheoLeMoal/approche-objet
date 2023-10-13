package fr.diginamic.essais;

import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		/**
		 * Cercle 1
		 */
		Cercle cercle1 = new Cercle(5);
		System.out.println("Cercle 1 :");
		System.out.println("Périmètre : " + cercle1.getPerimetre() + " Surface : " + cercle1.getSurface());
		
		/**
		 * Cercle 2
		 */
		Cercle cercle2 = new Cercle(13);
		System.out.println("Cercle 2 :");
		System.out.println("Périmètre : " + cercle2.getPerimetre() + " Surface : " + cercle2.getSurface());
		
		/**
		 * Cercle factory
		 */
		Cercle cercle = CercleFactory.facory(5);
	}
}
