package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperation {

	public static void main(String[] args) {
		double ope1 = Operations.calcul(50D, 20D , '-');
		double ope2 = Operations.calcul(50D, 20D , '+');
		double ope3 = Operations.calcul(50D, 20D , '*');
		double ope4 = Operations.calcul(50D, 20D , '/');
	}
}
