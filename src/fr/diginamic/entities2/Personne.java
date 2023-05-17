package fr.diginamic.entities2;

import fr.diginamic.entities.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adr;

    public Personne() {
        this.nom = "Doe";
        this.prenom = "Jhon";
    }

    public Personne(String nom, String prenom, AdressePostale adr) {
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
    }



    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adr=" + adr +
                '}';
    }
}
