package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Departement {
	private String code;
	private int population;
	
	/**
	 * @param code
	 * @param population
	 */
	public Departement(String code, int population) {
		super();
		this.code = code;
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
		return "Departement [code=" + code + ", population=" + population + "]";
	}
	
	
}