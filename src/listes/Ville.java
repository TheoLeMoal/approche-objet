package listes;

import java.util.Objects;

public class Ville {
    private String nom;
    private int nbHabitants;
    private Continent continent;

    public Ville(String nom, int nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
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

	/*
	 * return the nbHabitants
	 */
	public int getNbHabitants() {
        return nbHabitants;
    }

    /**
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
    
    @Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + ", continent=" + continent + "]";
	}

	public boolean equals(Object obj) {
        if (!(obj instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) obj;
        return nbHabitants == other.nbHabitants && Objects.equals(nom, other.nom);
    }
}
