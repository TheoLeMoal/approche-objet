package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestComparableVille {
	  public static void main(String[] args) {
		    ArrayList<Ville> villes = new ArrayList<>();
		    villes.add(new Ville("Montpellier", 5000000));
		    villes.add(new Ville("Nantes", 2000000));
		    villes.add(new Ville("Lyon", 4000000));
		    villes.add(new Ville("Marseille", 8000000));
		    villes.add(new Ville("Paris", 10000000));

		    /**
		     * Affichage des villes
		     */
		    System.out.println("Original cities");
		    System.out.println(villes);

		    /**
		     * Affichage par rapport au nom
		     */
		    System.out.println("Trié par nom");
		    Collections.sort(villes, new ComparatorNom());
		    System.out.println(villes);
		    
		    /**
		     * Affichage par rapport à la population
		     */
		    System.out.println("Trié par population");
		    Collections.sort(villes, new ComparatorHabitant());
		    System.out.println(villes);
	  }
}
