package fr.diginamic.entities;

import fr.diginamic.entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale("11", "Le clos mistral","26250","Livron sur Drôme");
        Personne per1 = new Personne("Le Moal","Theo",adr1);
        System.out.println("per1 = " + per1);
        Personne per2 = new Personne();
        System.out.println("per2 = " + per2);

    }
}
