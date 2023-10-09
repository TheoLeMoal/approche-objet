package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	private int taux;

	/**
	 * Constructeur
	 * @param num
	 * @param solde
	 * @param taux
	 */
	public CompteTaux(int num, float solde, int taux) {
		super(num, solde);
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteTaux [taux="+taux+", "+super.toString()+"]";
	}
	
}
