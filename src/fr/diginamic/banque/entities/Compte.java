package fr.diginamic.banque.entities;

public class Compte {
    long numCompte;
    float solde;

    public Compte(long numCompte, float solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    public long getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(long numCompte) {
        this.numCompte = numCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
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
