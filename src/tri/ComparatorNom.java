package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{
	  @Override
	  public int compare(Ville ville, Ville autreVille) {
	    return ville.getNom().compareTo(autreVille.getNom());
	  }
}
