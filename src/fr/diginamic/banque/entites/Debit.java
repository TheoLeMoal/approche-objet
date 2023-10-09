package fr.diginamic.banque.entites;

public class Debit extends Operation{

	/**
	 * Constructeur
	 * @param date
	 * @param montant
	 */
	public Debit(String date, int montant) {
		super(date, montant);
	}

	/**
	 * Retourne le type d'operatrion
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}

}
