package fr.diginamic.banque.operation;

public abstract class Operation {
    String date;
    double montant;

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public abstract String getType();
}
