package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
        // Instanciez un HashSet de String
        HashSet<String> stringHashSet = new HashSet<>();

        // Ajoutez les éléments donnés au HashSet
        stringHashSet.add("USA");
        stringHashSet.add("France");
        stringHashSet.add("Allemagne");
        stringHashSet.add("UK");
        stringHashSet.add("Italie");
        stringHashSet.add("Japon");
        stringHashSet.add("Chine");
        stringHashSet.add("Russie");
        stringHashSet.add("Inde");
        
        // Recherchez le pays avec le plus grand nombre de lettres
        Iterator<String> iterator = stringHashSet.iterator();
        String paylePlusLong = "";
        while (iterator.hasNext()) {
			String pay = (String) iterator.next();
            if (pay.length() > paylePlusLong.length()) {
            	paylePlusLong = pay;
            }
		}
        System.out.println("Le pay qui possède le plus de caractère de la collection est " + paylePlusLong);
        stringHashSet.remove(paylePlusLong);
        System.out.println("Contenu du HashSet après la suppression : " + stringHashSet);
	}
}
