package fr.diginamic.banque.entities;

public class CompteTaux extends Compte{
    int taux;

    public CompteTaux(long numCompte, double solde, int taux) {
        super(numCompte, solde);
        this.taux = taux;
    }


    @Override
    public String toString() {
        return "CompteTaux{" +
                "taux=" + taux +
                ", numCompte=" + numCompte +
                ", solde=" + solde +
                '}';
    }
}
