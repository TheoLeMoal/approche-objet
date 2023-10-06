package entites;

public class AdressePostale {
	String numRue;
	String libelleRue;
	int codePostal;
	String ville;
	public AdressePostale(String num, String libelle, int code, String villes) {
		this.numRue = num;
		this.libelleRue = libelle;
		this.codePostal = code;
		this.ville = villes;
	}
	
	@Override
	public String toString() {
		return "Numéro de rue : " + this.numRue + ", libellé de la rue : " + this.libelleRue + " code postal : " + this.codePostal + ", ville : " + this.ville;
	}
}
