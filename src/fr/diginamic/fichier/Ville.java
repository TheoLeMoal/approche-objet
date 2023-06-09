package fr.diginamic.fichier;

public class Ville {
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotale;

    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }
}
