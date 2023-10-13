package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] tableau;
    private int taille;
    
    /**
     * Constructeur
     */
    public CalculMoyenne() {
        tableau = new double[10];
        taille = 0;
    }
    
    /**
     *  Méthode pour ajouter un double au tableau
     * @param valeur
     */
    public void ajout(double valeur) {
        if (taille == tableau.length) {
            // Si le tableau est plein, agrandissons-le en créant un nouveau tableau plus grand
            tableau = Arrays.copyOf(tableau, tableau.length * 2);
        }
        tableau[taille] = valeur;
        taille++;
    }
    
    /**
     *  Méthode pour calculer la moyenne des éléments du tableau
     * @return
     */
    public double calcul() {
        if (taille == 0) {
            throw new IllegalStateException("Le tableau est vide, impossible de calculer la moyenne.");
        }
        
        double somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        
        return somme / taille;
    }
}





