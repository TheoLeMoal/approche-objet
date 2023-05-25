package fr.diginamic.interfaces;

public class TestObjectGeometrique {
    public static void main(String[] args) {
        ObjectGeometrique[] objets = new ObjectGeometrique[2];

        objets[0] = new Cercle(5.0);
        objets[1] = new Rectangle(4.0, 3.0);

        for (ObjectGeometrique objet : objets) {
            System.out.println("Périmètre: " + objet.perimetre());
            System.out.println("Surface: " + objet.surface());
            System.out.println();
        }
    }
}
