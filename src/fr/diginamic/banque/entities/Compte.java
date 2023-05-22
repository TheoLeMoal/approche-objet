package fr.diginamic.banque.entities;

public class Compte {
    long numCompte;
    double solde;

    public Compte(long numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    public long getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(long numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                '}';
    }
}
