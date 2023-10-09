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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	
}
