package fr.diginamic.maison;

public abstract class Piece {
	private double superficie;
	private int etage;
	
	/**
	 * Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/**
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	
}
