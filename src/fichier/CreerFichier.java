package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) {
        //lisez le contenu du fichier
        Path path = Paths.get("E:\\Projets java\\approche-objet\\src\\fichier\\recensement.csv");
        List<String> lines = null;
		try {
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//On récupère les 100 lignes
        List<String> subLines = lines.subList(1,101);

        //Créer un fichier sur le quel on vas écrire les 100 lignes récupérer ci-dessus
        Path pathTarget = Paths.get("E:\\Projets java\\approche-objet\\src\\fichier\\recensement100.csv");
        try {
			Files.write(pathTarget,subLines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
