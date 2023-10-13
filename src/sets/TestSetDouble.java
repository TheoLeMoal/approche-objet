package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
        // Créez un HashSet de doubles
        HashSet<Double> doubleHashSet = new HashSet<>();

        // Ajoutez les éléments donnés au HashSet
        doubleHashSet.add(1.5);
        doubleHashSet.add(8.25);
        doubleHashSet.add(-7.32);
        doubleHashSet.add(13.3);
        doubleHashSet.add(-12.45);
        doubleHashSet.add(48.5);
        doubleHashSet.add(0.01);

        // Affichez le HashSet
        System.out.println("Contenu du HashSet de doubles : " + doubleHashSet);
        
        /**
         * Recherchez le plus grand élément de la collection
         */
        Iterator<Double> iterator = doubleHashSet.iterator();
        double maxDouble = Double.NEGATIVE_INFINITY;
        while (iterator.hasNext()) {
			Double double1 = (Double) iterator.next();
			if (maxDouble < double1) {
				maxDouble = double1;
			}
		}
        System.out.println("Le plus grand élément de la collection est " + maxDouble);
        /**
         * Supprimez le plus petit élément de la collection
         */
        iterator = doubleHashSet.iterator();
        double minDouble = Double.POSITIVE_INFINITY;
        while (iterator.hasNext()) {
			Double double1 = (Double) iterator.next();
			if (minDouble > double1) {
				minDouble = double1;
			}
		}
        doubleHashSet.remove(minDouble);
        /**
         *  Affichez le contenu de la collection modifiée
         */
        System.out.println("Contenu du HashSet après la suppression : " + doubleHashSet);
	}

}
