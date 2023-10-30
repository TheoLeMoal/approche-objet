package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {
        // Instanciez un HashSet de pays
        HashSet<Pays> paysHashSet = new HashSet<>();

        // Ajoutez les pays avec leurs informations
        paysHashSet.add(new Pays("USA", 331002651, (long) 62606.25));
        paysHashSet.add(new Pays("France", 65273511, (long) 39455.29));
        paysHashSet.add(new Pays("Allemagne", 83783942, (long) 48457.52));
        paysHashSet.add(new Pays("UK", 67886011, (long) 42719.67));
        paysHashSet.add(new Pays("Italie", 60461826, (long) 31952.96));
        paysHashSet.add(new Pays("Japon", 126476461, (long) 42946.94));
        paysHashSet.add(new Pays("Chine", 1444216107, (long) 10715.59));
        paysHashSet.add(new Pays("Russie", 145912025, (long) 11218.13));
        paysHashSet.add(new Pays("Inde", 1380004385, (long) 2103.23));

        // Affichez les informations de chaque pays
        for (Pays pays : paysHashSet) {
            System.out.println(pays);
        }
        
        Iterator<Pays> iteratorPays = paysHashSet.iterator();
        double pibParHabitantMax = Double.MIN_VALUE;
        Pays paysAvecMeilleurPIBParHabitant = null;
        
        while (iteratorPays.hasNext()) {
			Pays pays = (Pays) iteratorPays.next();
            if (pays.getPibParHabitant() > pibParHabitantMax) {
            	paysAvecMeilleurPIBParHabitant = pays;
            }
		}
        
        System.out.println("Pays avec le PIB par habitant le plus élevé : " + paysAvecMeilleurPIBParHabitant);
        
        // Recherchez le pays avec le PIB total le plus élevé
        iteratorPays = paysHashSet.iterator();
        double pibTotalMax = Double.MIN_VALUE;
        Pays paysAvecMeilleurPIBTotal = null;
        
        while (iteratorPays.hasNext()) {
			Pays pays = (Pays) iteratorPays.next();
            if (pays.getPIBTotal() > pibTotalMax) {
            	paysAvecMeilleurPIBTotal = pays;
            }
		}
        
        System.out.println("Pays avec le PIB total le plus élevé : " + paysAvecMeilleurPIBTotal);
        
        /**
         * Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
         */
        iteratorPays = paysHashSet.iterator();
        double pibTotalMin = Double.MAX_VALUE;
        Pays paysAvecPirePIBTotal = null;
        
        while (iteratorPays.hasNext()) {
			Pays pays = (Pays) iteratorPays.next();
            if (pays.getPIBTotal() < pibTotalMin) {
            	paysAvecPirePIBTotal = pays;
            }
		}
        paysAvecPirePIBTotal.setNom(paysAvecPirePIBTotal.getNom().toUpperCase());
        
        iteratorPays = paysHashSet.iterator();
        while (iteratorPays.hasNext()) {
            Pays pays = iteratorPays.next();
            if (pays == paysAvecPirePIBTotal) {
            	iteratorPays.remove();
            }
        }
        
        // Affichez l'ensemble des pays modifiés
        for (Pays pays : paysHashSet) {
            System.out.println(pays.getNom() + " - Habitants: " + pays.getNbHabitants() + " - PIB total: " + pays.getPIBTotal());
        }
	}

}
