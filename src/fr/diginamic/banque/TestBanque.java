package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(1, 1000);
        System.out.println("compte = " + compte);
    }
}
