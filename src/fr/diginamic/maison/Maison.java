package fr.diginamic.maison;

public class Maison {
    private Piece[] pieces;
    private int taille;

    public Maison(int capacite) {
        pieces = new Piece[capacite];
        taille = 0;
    }

    /**
     * Ajouter une pièce a la maison
     * @param piece
     */
    public void ajouterPiece(Piece piece) {
        if (piece == null || piece.getSuperficie() <= 0 || piece.getEtage() < 0) {
            System.err.println("La pièce n'a pas pu être ajoutée. Vérifiez les données de la pièce.");
            return;
        }

        if (taille < pieces.length) {
            pieces[taille] = piece;
            taille++;
        } else {
            System.err.println("La maison est pleine, impossible d'ajouter plus de pièces.");
        }
    }

    /**
     * Récupérer la superficie totale de la maison
     * @return
     */
    public double getSuperficieTotale() {
        double superficieTotale = 0;
        for (int i = 0; i < taille; i++) {
            superficieTotale += pieces[i].getSuperficie();
        }
        return superficieTotale;
    }

    /**
     * Récupérer la superficie d'un étage
     * @param etage
     * @return
     */
    public double getSuperficieEtage(int etage) {
        double superficieEtage = 0;
        for (int i = 0; i < taille; i++) {
            if (pieces[i].getEtage() == etage) {
                superficieEtage += pieces[i].getSuperficie();
            }
        }
        return superficieEtage;
    }

    /**
     * Récupérer la superficie d'un type de pièce
     * @param type
     * @return
     */
    public double getSuperficieParType(Class type) {
        double superficieParType = 0;
        for (int i = 0; i < taille; i++) {
            if (type.isInstance(pieces[i])) {
                superficieParType += pieces[i].getSuperficie();
            }
        }
        return superficieParType;
    }

    /**
     * Récupérer le nombre de pièce d'un type
     * @param type
     * @return
     */
    public int getNombreDePiecesParType(Class type) {
        int nombreDePieces = 0;
        for (int i = 0; i < taille; i++) {
            if (type.isInstance(pieces[i])) {
                nombreDePieces++;
            }
        }
        return nombreDePieces;
    }
}
