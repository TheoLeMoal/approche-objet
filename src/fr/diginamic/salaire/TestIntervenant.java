package fr.diginamic.salaire;

public class TestIntervenant {
    public static void main(String[] args) {
        // Créez une instance de Salarie
        Salarie salarie = new Salarie("Doe", "John", 3000.0);
        
        // Affichez les données du salarié
        System.out.println("Données du salarié :");
        salarie.afficherDonnees();
        
        // Créez une instance de Pigiste
        Pigiste pigiste = new Pigiste("Smith", "Jane", 10, 100.0);
        
        // Affichez les données du pigiste
        System.out.println("\nDonnées du pigiste :");
        pigiste.afficherDonnees();
    }
}
