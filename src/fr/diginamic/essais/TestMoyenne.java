package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        // Test 1
        CalculMoyenne calcul1 = new CalculMoyenne();
        calcul1.ajout(10);
        calcul1.ajout(20);
        calcul1.ajout(30);
        System.out.println("Moyenne 1 : " + calcul1.calcul());
        
        // Test 2
        CalculMoyenne calcul2 = new CalculMoyenne();
        calcul2.ajout(5);
        calcul2.ajout(15);
        calcul2.ajout(25);
        calcul2.ajout(35);
        calcul2.ajout(45);
        System.out.println("Moyenne 2 : " + calcul2.calcul());
    }
}
