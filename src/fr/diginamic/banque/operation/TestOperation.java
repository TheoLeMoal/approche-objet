package fr.diginamic.banque.operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];

        operations[0] = new Credit("2023-05-20", 1000.0);
        operations[1] = new Debit("2023-05-21", 500.0);
        operations[2] = new Credit("2023-05-22", 1500.0);
        operations[3] = new Debit("2023-05-23", 200.0);

        double montantGlobal = 0.0;

        for (Operation operation : operations) {
            System.out.println("Date de l'opération: " + operation.getDate());
            System.out.println("Type de l'opération: " + operation.getType());
            System.out.println("Montant de l'opération: " + operation.getMontant());

            if (operation instanceof Credit) {
                montantGlobal += operation.getMontant();
            } else if (operation instanceof Debit) {
                montantGlobal -= operation.getMontant();
            }
            /*
            if (operation.getType() == "CREDIT") {
                montantGlobal += operation.getMontant();
            } else if (operation.getType() == "DEBIT") {
                montantGlobal -= operation.getMontant();
            }
            */
            System.out.println();
        }

        System.out.println("Montant global des opérations: " + montantGlobal);
    }
}
