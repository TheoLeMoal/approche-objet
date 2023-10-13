package entites;

public class Salaire {
	private String nom;
	private String prenom;
	private double salaire;
	
	/**
	 * Constructeur
	 * @param nom
	 * @param prenom
	 * @param salaire
	 */
	public Salaire(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Salaire [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
	
}
