package listes;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    /**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public String toString() {
        return nom + ", " + nbHabitants + " hab.";
    }
}
