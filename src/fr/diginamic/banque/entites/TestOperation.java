package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation debit1 = new Debit("test1", 1);
		Operation debit2 = new Debit("test2", 2);
		Operation credit1 = new Credit("test3", 3);
		Operation credit2 = new Credit("test4", 4);
		Operation[] operations = new Operation[4];
		operations[0] = debit1;
		operations[1] = debit2;
		operations[2] = credit1;
		operations[3] = credit2;
		for (Operation operation : operations) {
			System.out.println(operation + " " + operation.getType());
		}
		System.out.println("-------------------------------------------------------------");
		int montantGlobal = 0;
		for (Operation operation : operations) {
			if (operation.getType() == "CREDIT") {
				montantGlobal += operation.getMontant();
			}else if (operation.getType() == "DEBIT") {
				montantGlobal -= operation.getMontant();
			}
		}
		System.out.println(montantGlobal);
	}

}
