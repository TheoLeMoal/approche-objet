package fr.diginamic.entities;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale("11", "Le clos mistral", "26250", "Livron sur Drôme");
        System.out.println("adr1 = " + adr1);
        AdressePostale adr2 = new AdressePostale("12", "Le clos mistral", "26250", "Livron sur Drôme");
        System.out.println("adr2 = " + adr2);
    }

}
