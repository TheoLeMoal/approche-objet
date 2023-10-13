package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService {
	/**
	 * Methodes pour traité les données qui se trouve dans recensement
	 * @param recensement
	 * @param scanner
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner);
}
