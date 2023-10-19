package fr.diginamic.automates;

import java.util.Arrays;

public class JeuDeLaVie {

    private int[][] grilleActuelle;
    private int[][] nouvelleGrille;
    private int largeur;
    private int hauteur;

    public JeuDeLaVie(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        grilleActuelle = new int[largeur][hauteur];
        nouvelleGrille = new int[largeur][hauteur];
    }
    
    

    @Override
	public String toString() {
		return "x";
	}



	public void jouerUneGeneration() {
        for (int x = 0; x < largeur; x++) {
            for (int y = 0; y < hauteur; y++) {
                int voisins = compterVoisins(x, y);
                if (grilleActuelle[x][y] == 1) {
                    // Règles de survie et de mort
                    if (voisins < 2 || voisins > 3) {
                        nouvelleGrille[x][y] = 0;
                    } else {
                        nouvelleGrille[x][y] = 1;
                    }
                } else {
                    // Règle de naissance
                    if (voisins == 3) {
                        nouvelleGrille[x][y] = 1;
                    }
                }
            }
        }
        // Copiez la nouvelle grille dans la grille actuelle
        grilleActuelle = nouvelleGrille.clone();
    }

    public int compterVoisins(int x, int y) {
        int voisins = 0;
        return voisins;
    }

    public void afficherGrille() {
    	System.out.println(grilleActuelle);
    }

    public static void main(String[] args) {
        JeuDeLaVie jeu = new JeuDeLaVie(10, 10);
        for (int i = 0; i < 100; i++) {
            jeu.jouerUneGeneration();
            jeu.afficherGrille();
        }
    }
}
