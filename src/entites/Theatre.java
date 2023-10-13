package entites;

public class Theatre {
	private String nom;
	private int capacite;
	private int inscrits;
	private double recette;
	
	/**
	 * Constructeur
	 * @param nom
	 * @param capacite
	 * @param inscrits
	 * @param recette
	 */
	public Theatre(String nom, int capacite, int inscrits, double recette) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.inscrits = inscrits;
		this.recette = recette;
	}
	
	public void inscrire(int nbrClient, double prix) {
		if ((this.capacite - this.inscrits) > nbrClient) {
			this.inscrits += nbrClient;
			this.recette += (prix * nbrClient);
		}else {
			System.out.println("La capacité du théatre a été dépassé");
		}
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
	 * @return the capacite
	 */
	public int getCapacite() {
		return capacite;
	}

	/**
	 * @param capacite the capacite to set
	 */
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	/**
	 * @return the inscrits
	 */
	public int getInscrits() {
		return inscrits;
	}

	/**
	 * @param inscrits the inscrits to set
	 */
	public void setInscrits(int inscrits) {
		this.inscrits = inscrits;
	}

	/**
	 * @return the recette
	 */
	public double getRecette() {
		return recette;
	}

	/**
	 * @param recette the recette to set
	 */
	public void setRecette(double recette) {
		this.recette = recette;
	}
	
	
}
