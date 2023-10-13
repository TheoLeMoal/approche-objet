package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
	  @Override
	  public int compare(Ville ville, Ville autreVille) {
	    return ville.getPopulation().compareTo(autreVille.getPopulation());
	  }
}