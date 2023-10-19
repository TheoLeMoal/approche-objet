package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
        // Utilisation d'une boucle pour afficher toutes les saisons
        for (Saison saison : Saison.values()) {
            System.out.println("Saison : " + saison.name() + " - Libellé : " + saison.getLibelle());
        }

        // Recherche du libellé de l'instance de Saison dont le nom est "ETE"
        String nom = "ETE";
        Saison saisonEte = Saison.valueOf(nom);
        System.out.println("Le libellé de la saison " + nom + " est : " + saisonEte.getLibelle());

        // Recherche d'une instance de Saison en fonction du libellé "Hiver"
        String libelle = "Hiver";
        Saison saisonHiver = Saison.getSaisonByLibelle(libelle);

        if (saisonHiver != null) {
            System.out.println("Le libellé de la saison est : " + saisonHiver.name());
        } else {
            System.out.println("Aucune saison trouvée avec le libellé : " + libelle);
        }
    }

}
