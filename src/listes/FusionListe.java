package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String args[]) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		//TODO Développements à réaliser ci-dessous
		
		List<String> liste3 = new ArrayList<String>();
		for (String string : liste1) {
			liste3.add(string);
		}
		for (String string : liste2) {
			liste3.add(string);
		}
		/**
		 * Plus simple en utilisant addAll()
		 * liste3.addAll(liste1);
		 * liste3.addAll(liste2);
		 */
		for (String string : liste3) {
			System.out.println(string);
		}
	}
}
