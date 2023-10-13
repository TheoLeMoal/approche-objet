package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("E:\\Projets java\\approche-objet\\src\\fichier\\recensement.csv");
        ArrayList<Ville> list1 = new ArrayList<>();
		boolean exists = Files.exists(path);
		if (exists) {
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
	        Iterator<String> iterator = lines.iterator();
	        iterator.next();
	        //Création des ville
	        while(iterator.hasNext()){
	            String target = iterator.next();
	            String[] targetSplit = target.split(";");

	            String name = targetSplit[6];
	            int code = Integer.parseInt(targetSplit[0]);
	            
	            String region = targetSplit[1];
	            long population = Long.parseLong(targetSplit[9].trim().replaceAll(" ", ""));

	            Ville targetCity = new Ville(name,code,region,population);
	            list1.add(targetCity);
	        }
		}else {
			System.out.println("Le fichier n'existe pas");
		}
		/**
		 * Affichage des objets ville
		 */
		for (Ville ville : list1) {
			System.out.println(ville);
		}
		
		//ficher 25000 habitant
	    ArrayList<Ville> list2 = new ArrayList<>();
	    for (Ville ele:list1) {
	        if(ele.getPopulation() > 25000){
	            list2.add(ele);
	        }
	    }
	    
        ArrayList<String> list3 = new ArrayList<>();
        String header = "Nom;Code département;Nom de la région;Population totale";
        list3.add(header);

        for (int i = 0; i < list2.size(); i++) {
            String info =list2.get(i).getName()+ ";" + list2.get(i).getCode()+ ";" + list2.get(i).getRegion()+ ";" + list2.get(i).getPopulation() ;
            list3.add(info);
        }

        Path pathTarget = Paths.get("E:\\Projets java\\approche-objet\\src\\fichier\\recensement25000.csv");
        Files.write(pathTarget,list3);
	}
}