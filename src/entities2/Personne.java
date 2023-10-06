package entities2;

import entites.AdressePostale;

public class Personne {
	//Nom de la personne
	public String nom;
	//Prénom de la personne
	public String prenom;
	//Adresse de la personne
	public AdressePostale adresse;
	
	/**
	 * Constructeur
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	/**
	 * Constructeur si il est vide
	 */
	public Personne() {
		super();
		this.nom = "Unknow";
		this.prenom = "Unknow";
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	
	public void toStringMaj() {
		System.out.println(nom.toUpperCase() + prenom.toUpperCase());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	/**
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * 
	 * @return
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}
	
	/**
	 * 
	 * @param adresse
	 */
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	
}
