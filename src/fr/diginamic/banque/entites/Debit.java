package fr.diginamic.banque.entites;

public class Debit extends Operation{

	public Debit(String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
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
