package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int population;

    public Ville(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public int compareTo(Ville autreVille) {
        return Integer.compare(this.population, autreVille.getPopulation());
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", population=" + population +
                '}';
    }
}