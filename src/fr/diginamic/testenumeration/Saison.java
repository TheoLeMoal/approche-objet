/**
 * 
 */
package fr.diginamic.testenumeration;

/**
 * Saison
 */
public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private final String libelle;
    private final int numeroOrdre;

    /**
     * Constructeur
     * @param libelle
     * @param numeroOrdre
     */
    Saison(String libelle, int numeroOrdre) {
        this.libelle = libelle;
        this.numeroOrdre = numeroOrdre;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getNumeroOrdre() {
        return numeroOrdre;
    }
    
    /**
     *  Méthode pour obtenir une instance de Saison en fonction du libellé
     * @param libelle
     * @return
     */
    public static Saison getSaisonByLibelle(String libelle) {
        for (Saison saison : values()) {
            if (saison.getLibelle().equalsIgnoreCase(libelle)) {
                return saison;
            }
        }
        return null;
    }
}
