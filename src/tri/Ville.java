package tri;

public class Ville implements Comparable<Ville> {
    private String nom;
    private Integer population;

    public Ville(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public Integer getPopulation() {
        return population;
    }

    @Override
    public int compareTo(Ville autreVille) {
      return population.compareTo(autreVille.population);
    }

	@Override
	public String toString() {
		return nom;
	}
    
    
}
