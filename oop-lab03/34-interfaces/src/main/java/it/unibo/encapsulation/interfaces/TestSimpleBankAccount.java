package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder ar = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder ab = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount arbank = new SimpleBankAccount(ar.getUserID(), 5000);
        SimpleBankAccount abbank = new SimpleBankAccount(ab.getUserID(), 6700);

        // 4) Effettuare una serie di depositi e prelievi
        System.out.println("Andrea Rossi balance = " + arbank.getBalance() +", n di transazioni = " + arbank.getTransactionsCount());
        System.out.println("Alessandro Bianchi balance = "+ abbank.getBalance()+", n di transazioni = " + abbank.getTransactionsCount());
        abbank.deposit(ab.getUserID(), 250);
        arbank.deposit(ar.getUserID(), 2300);
        System.out.println("Andrea Rossi balance = " + arbank.getBalance() +", n di transazioni = " + arbank.getTransactionsCount());
        System.out.println("Alessandro Bianchi balance = "+ abbank.getBalance()+", n di transazioni = " + abbank.getTransactionsCount());
        abbank.withdraw(ab.getUserID(), 300);
        arbank.withdraw(ar.getUserID(), 250);
        System.out.println("Andrea Rossi balance = " + arbank.getBalance() +", n di transazioni = " + arbank.getTransactionsCount());
        System.out.println("Alessandro Bianchi balance = "+ abbank.getBalance()+", n di transazioni = " + abbank.getTransactionsCount());
        abbank.depositFromATM(ab.getUserID(), 1300);
        arbank.deposit(ar.getUserID(), 50);
        System.out.println("Andrea Rossi balance = " + arbank.getBalance() +", n di transazioni = " + arbank.getTransactionsCount());
        System.out.println("Alessandro Bianchi balance = "+ abbank.getBalance()+", n di transazioni = " + abbank.getTransactionsCount());
        abbank.withdrawFromATM(ab.getUserID(), 50);
        arbank.withdrawFromATM(ar.getUserID(), 1500);
        System.out.println("Andrea Rossi balance = " + arbank.getBalance() +", n di transazioni = " + arbank.getTransactionsCount());
        System.out.println("Alessandro Bianchi balance = "+ abbank.getBalance()+", n di transazioni = " + abbank.getTransactionsCount());
        abbank.chargeManagementFees(ab.getUserID());
        arbank.chargeManagementFees(ar.getUserID());
        System.out.println("Andrea Rossi balance = " + arbank.getBalance() +", n di transazioni = " + arbank.getTransactionsCount());
        System.out.println("Alessandro Bianchi balance = "+ abbank.getBalance()+", n di transazioni = " + abbank.getTransactionsCount());
        abbank.chargeManagementFees(ar.getUserID());
        arbank.chargeManagementFees(ab.getUserID());
        System.out.println("Andrea Rossi balance = " + arbank.getBalance() +", n di transazioni = " + arbank.getTransactionsCount());
        System.out.println("Alessandro Bianchi balance = "+ abbank.getBalance()+", n di transazioni = " + abbank.getTransactionsCount());
        
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */

        // 6) Provare a prelevare fornendo un id utente sbagliato

        // 7) Controllare nuovamente l'ammontare
    }
}
