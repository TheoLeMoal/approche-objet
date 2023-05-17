package fr.diginamic.entities2;

import fr.diginamic.entities.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adr;

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adr=" + adr +
                '}';
    }
}
