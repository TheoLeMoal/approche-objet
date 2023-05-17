package fr.diginamic.entities;

public class AdressePostale {
    String num = "";
    String libelle = "";
    String codeP = "";
    String ville = "";
    public AdressePostale(String num, String libelle, String codeP, String ville) {
        this.num = num;
        this.libelle = libelle;
        this.codeP = codeP;
        this.ville = ville;
    }
}
