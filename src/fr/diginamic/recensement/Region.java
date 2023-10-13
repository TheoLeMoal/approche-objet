package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Region {
    private String code;
    private String nom;
    private int population;
    
	/**
	 * @param code
	 * @param nomRegion
	 * @param population
	 */
	public Region(String code, String nom, int population) {
		super();
		this.code = code;
		this.nom = nom;
		this.population = population;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the nomRegion
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Region [code=" + code + ", nom=" + nom + ", population=" + population + "]";
	}
	
	
}