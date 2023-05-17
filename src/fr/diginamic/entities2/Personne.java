package fr.diginamic.entities2;

import fr.diginamic.entities.AdressePostale;

import java.util.Locale;

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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdr(AdressePostale adr) {
        this.adr = adr;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdr() {
        return adr;
    }

    public void presentation(){
        System.out.println(this.nom.toUpperCase() + " " + this.prenom.toUpperCase());
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
