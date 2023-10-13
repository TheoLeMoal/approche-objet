package fr.diginamic.jdr;

abstract class Creature {
    private int force;
    private int pointsDeVie;
    private String nom;

    public Creature(int force, int pointsDeVie, String nom) {
        this.force = force;
        this.pointsDeVie = pointsDeVie;
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void subirDegats(int degats) {
        pointsDeVie -= degats;
    }
}
