package fr.diginamic.operations;

public class Operations {
	/**
	 * Permet de calculer l'opération
	 * @param a
	 * @param b
	 * @param type
	 * @return
	 */
	public static double calcul(double a, double b, char type) {
		if (type == '+') {
			return a + b;
		}else if(type == '-') {
			return a - b;
		} else if (type == '*') {
			return a * b;
		}else if(type == '/') {
			return a / b;
		}else {
			return 0;
		}
	}
}
