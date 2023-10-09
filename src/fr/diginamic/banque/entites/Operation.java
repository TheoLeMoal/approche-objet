package fr.diginamic.banque.entites;

public abstract class Operation {
	private String date;
	private int montant;
	
	/**
	 * Constructeur
	 * @param date
	 * @param montant
	 */
	public Operation(String date, int montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Operation [date=" + date + ", montant=" + montant + "]";
	}
	
	public abstract String getType();

	/**
	 * Récuperer la date
	 * @return
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Modifier la date
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Récuperer le montant
	 * @return
	 */
	public int getMontant() {
		return montant;
	}

	/**
	 * Modifier le montant
	 * @param montant
	 */
	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	
}
