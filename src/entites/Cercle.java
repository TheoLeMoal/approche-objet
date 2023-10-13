package entites;

public class Cercle {
	private double rayon;

	/**
	 * Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	/**
	 * Retourne le perimetre
	 * @return
	 */
	public double getPerimetre() {
		return (this.rayon * 2) * 3.14;
	}
	
	/**
	 * Retourne la surface
	 * @return
	 */
	public double getSurface() {
		return this.rayon * 3.14;
	}
}
