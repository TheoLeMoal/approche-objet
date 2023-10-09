package fr.diginamic.banque.entites;

public class Credit extends Operation{

	public Credit(String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
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
