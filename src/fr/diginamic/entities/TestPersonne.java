package fr.diginamic.entities;

import fr.diginamic.entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale("11", "Le clos mistral","26250","Livron sur Drôme");
        adr1.num = "11";
        adr1.libelle = "Le clos mistral";
        adr1.ville = "Livron sur Drôme";
        adr1.codeP = "26250";
        Personne per1 = new Personne();
        per1.nom = "Doe";
        per1.prenom = "Jhon";
        per1.adr = adr1;
        System.out.println("per1 = " + per1);
    }
}
