package fr.diginamic.banque.entites;

public class Compte {
	//Numéro de compte
	private int num;
	//Solde du compte
	private float solde;
	
	/**
	 * Constructeur
	 * @param num
	 * @param solde
	 */
	public Compte(int num, float solde) {
		super();
		this.num = num;
		this.solde = solde;
	}
	
	/**
	 * Constructeur
	 */
	public Compte() {
		super();
		this.num =  (int) (Math.random() * (9999 - 1000));
		this.solde = 0;
	}
	
	@Override
	public String toString() {
		return "Compte [num=" + num + ", solde=" + solde + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	
}
