package sets;

import annotations.ToString;

public class Pays {
    @ToString(uppercase = false, separator = "->")
    private String nom;
    
    @ToString(separator = " $")
    private long pibParHabitant;

	private int nbHabitants;
	
	/**
	 * @param nom
	 * @param nbHabitants
	 * @param pibParHabitant
	 */
	public Pays(String nom, int nbHabitants, long pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}
	
	/**
	 * Retourne le PIB total d'un pays
	 * @return
	 */
    public double getPIBTotal() {
        return nbHabitants * pibParHabitant;
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

	/**
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * @return the pibParHabitant
	 */
	public double getPibParHabitant() {
		return pibParHabitant;
	}

	/**
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(long pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", pibParHabitant=" + pibParHabitant + ", nbHabitants=" + nbHabitants + "]";
	}

	
	
}
