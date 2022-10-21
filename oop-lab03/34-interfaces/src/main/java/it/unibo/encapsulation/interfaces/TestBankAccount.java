package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder ar = new AccountHolder("Andrea", "Rossi", 1);
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder ab =  new AccountHolder("Alessandro", "Bianchi", 2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount arbank = new SimpleBankAccount(ar.getUserID(), 0);
        BankAccount abbank = new StrictBankAccount(ab.getUserID(), 0);
        System.out.println("Bianchi's balance =" + abbank.getBalance() + ", Rossi's balance =  " + arbank.getBalance());
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         * per il subtyping o polimorfismo inclusivo, Bank account include oggetti di tipo simple e strict bank account
         */
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        arbank.deposit(ar.getUserID(), 1000);
        abbank.deposit(ab.getUserID(), 1000);
        System.out.println("Bianchi's balance =" + abbank.getBalance() + ", Rossi's balance =  " + arbank.getBalance());
        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        arbank.withdraw(ar.getUserID(), 15000);
        abbank.withdraw(ab.getUserID(), 15000);
        System.out.println("Bianchi's balance =" + abbank.getBalance() + ", Rossi's balance =  " + arbank.getBalance());
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        System.out.println("Bianchi's balance =" + abbank.getBalance() + ", Rossi's balance =  " + arbank.getBalance());
        /*
         * 8) Qual è il risultato e perché?
         */
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        arbank.deposit(ar.getUserID(), 1000);
        abbank.deposit(ab.getUserID(), 1000);
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        arbank.chargeManagementFees(ar.getUserID());
        abbank.chargeManagementFees(ab.getUserID());
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        System.out.println("Bianchi's balance =" + abbank.getBalance() + ", Rossi's balance =  " + arbank.getBalance());
        /*
         * 12) Qual è il risultato e perché?
         */
    }
}
