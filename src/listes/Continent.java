/**
 * 
 */
package listes;

/**
 * Continent
 */
public enum Continent {
	EUROPE("Europe"),
	AFRIQUE("Afrique"),
	ASIE("Asie"),
	AMERIQUE("Amerique"),
	OCEANIE("Océanie");
	
    private final String libelle;
	
    /**
     * Constructeur
     * @param string
     */
	Continent(String string) {
		this.libelle = string;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	
	
}
