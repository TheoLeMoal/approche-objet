package fr.diginamic.banque.entites;

public class Credit extends Operation{

	/**
	 * Constructeur
	 * @param date
	 * @param montant
	 */
	public Credit(String date, int montant) {
		super(date, montant);
	}

	/**
	 * Retourne le type d'operatrion
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}

}
