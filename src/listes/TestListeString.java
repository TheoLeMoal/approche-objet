package listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
		// Instanciez une ArrayList de String contenant les noms de villes
        ArrayList<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        // Recherchez la ville avec le plus grand nombre de lettres
        String villeLaPlusLongue = villes.get(0);
        for (String ville : villes) {
            if (ville.length() > villeLaPlusLongue.length()) {
                villeLaPlusLongue = ville;
            }
        }
        System.out.println("Ville avec le plus grand nombre de lettres : " + villeLaPlusLongue);

        // Mettez tous les noms de villes en majuscules
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }

        // Supprimez les villes dont le nom commence par la lettre 'N'
        villes.removeIf(ville -> ville.startsWith("N"));

        // Affichez la liste résultante
        System.out.println("Liste résultante : " + villes);

	}

}
