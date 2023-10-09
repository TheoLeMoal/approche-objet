package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte1 = new Compte(0001, 3501);
		CompteTaux compte2 = new CompteTaux(0002, 7500, 12);
		Compte[] comptes = new Compte[2];
		comptes[0] = compte1;
		comptes[1] = compte2;
		for (Compte compte : comptes) {
			System.out.println(compte);
		}
	}
}
