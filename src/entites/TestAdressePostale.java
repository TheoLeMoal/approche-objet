package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale addr1 = new AdressePostale("12", "clos mistral", 26250, "Livron sur drôme");
		AdressePostale addr2 = new AdressePostale("11", "clos mistral", 26250, "Livron sur drôme");
		System.out.println(addr1);
	}
}
