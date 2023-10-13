package fr.diginamic.jdr;

import java.util.Random;

class Personnage {
    private int force;
    private int pointsDeVie;
    private int score;

    /**
     * Constructeur
     * @param force
     * @param pointsDeVie
     */
    public Personnage(int force, int pointsDeVie) {
        this.force = force;
        this.pointsDeVie = pointsDeVie;
        this.score = 0;
    }

    /**
     * Récupérer la force
     * @return
     */
    public int getForce() {
        return force;
    }

    /**
     * Récupérer les points de vie
     * @return
     */
    public int getPointsDeVie() {
        return this.pointsDeVie;
    }

    /**
     * Récupérer le score
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     * Ajout des points au score
     * @param points
     */
    public void ajouterScore(int points) {
    	this.score += points;
    }

    /**
     * Enlever les points de vie par rapport au dégats subit
     * @param degats
     */
    public void subirDegats(int degats) {
        this.pointsDeVie -= degats;
    }
}
