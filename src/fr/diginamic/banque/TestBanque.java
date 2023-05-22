package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(1, 1254.25);
        CompteTaux compteTaux = new CompteTaux(1, 120.25, 2);

        // Création d'un tableau de type Compte avec une capacité de 2
        Compte[] tableauComptes = new Compte[2];

        // Assignation des objets compte et compteTaux au tableau
        tableauComptes[0] = compte;
        tableauComptes[1] = compteTaux;
        for (Compte el: tableauComptes) {
            System.out.println("Compte = " + el);
        }
    }
}
