package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Recensement {
    private List<Ville> villes = new ArrayList<>();
    private List<Region> regions = new ArrayList<>();
    private List<Departement> departements = new ArrayList<>();
    
    /**
     * Constructeur
     */
    public Recensement() {
        this.villes = new ArrayList<>();
        this.regions = new ArrayList<>();
        this.departements = new ArrayList<>();
    }

    /**
     * Retourne les villes
     * @return
     */
    public List<Ville> getVilles() {
        return villes;
    }

    /**
     * Retourne les régions
     * @return
     */
    public List<Region> getRegions() {
        return regions;
    }

    /***
     * Retourne les département
     * @return
     */
    public List<Departement> getDepartements() {
        return departements;
    }
    
    /**
     * Mettre les villes du fichier recencement-population.csv dans la List villes
     * @param cheminFichier
     */
    public void chargerDonnees(Path cheminFichier) {
    	try {
			List<String> lines = Files.readAllLines(cheminFichier, StandardCharsets.UTF_8);
			Iterator<String> iterator = lines.iterator();
		       iterator.next();
		       //Création des ville
		       while(iterator.hasNext()){
			       String target = iterator.next();
			       String[] targetSplit = target.split(";");
			       String nomRegion = targetSplit[1];
			       String codeRegion = targetSplit[0];
		           String codeDepartement = targetSplit[2];
		           String codeCommune = targetSplit[5];
		           String nomCommune = targetSplit[6];
		           int populationTotale = Integer.parseInt(targetSplit[9].trim().replaceAll(" ", ""));
		           Ville targetCity = new Ville(codeRegion,nomRegion,codeDepartement,codeCommune,nomCommune,populationTotale);
		           villes.add(targetCity);
		           
	                // Chercher si la région existe déjà
	                Region existingRegion = null;
	                for (Region region : regions) {
	                    if (region.getCode().equals(codeRegion)) {
	                        existingRegion = region;
	                        break;
	                    }
	                }

	                // Si la région existe, augmenter la population, sinon, créer une nouvelle région
	                if (existingRegion != null) {
	                    existingRegion.setPopulation(existingRegion.getPopulation() + populationTotale);
	                } else {
	                    Region newRegion = new Region(codeRegion, nomRegion, populationTotale);
	                    regions.add(newRegion);
	                }
	                
	                // Chercher si le département existe déjà
	                Departement existingDepartement = null;
	                for (Departement departement : departements) {
	                    if (departement.getCode().equals(codeDepartement)) {
	                        existingDepartement = departement;
	                        break;
	                    }
	                }

	                // Si le département existe, augmenter la population, sinon, créer un nouveau département
	                if (existingDepartement != null) {
	                    existingDepartement.setPopulation(existingDepartement.getPopulation() + populationTotale);
	                } else {
	                    Departement newDepartement = new Departement(codeDepartement, populationTotale);
	                    departements.add(newDepartement);
	                }
	           }
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    /**
     * Retourne les villes d'un département
     * @param codeDepartement
     * @return
     */
    public List<Ville> getVillesByDepartement(String codeDepartement) {
        List<Ville> villesByDepartement = new ArrayList<>();
        
        for (Ville ville : villes) {
            if (ville.getCodeDepartement().equals(codeDepartement)) {
                villesByDepartement.add(ville);
            }
        }

        return villesByDepartement;
    }

	/**
	 * Retourne les ville d'une région
	 * @param nomRegion
	 * @return
	 */
    public List<Ville> getVillesByRegion(String nomRegion) {
        List<Ville> villesByRegion = new ArrayList<>();
        
        for (Ville ville : villes) {
            if (ville.getNomRegion().equals(nomRegion)) {
                villesByRegion.add(ville);
            }
        }

        return villesByRegion;
    }
}
