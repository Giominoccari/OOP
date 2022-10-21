package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {
    private static double ATM_TRANSACTION_FEE = 1;
    private static double TRANSACTION_FEE = 0.1;
    private static double MANAGEMENT_FEE = 5;

    private double balance;
    private int transaction;
    private int id;

    public StrictBankAccount(final int id, final int balance){
        this.id = id;
        this.balance = balance;
    }

    public void withdraw(int id, double amount){
        if( this.id == id && amount <= this.balance){
            this.transaction++;
            this.balance -= amount;
            this.balance -= TRANSACTION_FEE;
        }
    }

    public void deposit(int id, double amount){
        if( this.id == id ){
            this.transaction++;
            this.balance += amount;
            this.balance -= TRANSACTION_FEE;
        }
    }

    public void depositFromATM(int id, double amount){
        if( this.id == id ){
            this.transaction++;
            this.balance += amount;
            this.balance -= ATM_TRANSACTION_FEE;
            this.balance -= TRANSACTION_FEE;
        }
    }

    public void withdrawFromATM(int id, double amount){
        if( this.id == id && amount <= this.balance){
            this.transaction++;
            this.balance -= amount;
            this.balance -= ATM_TRANSACTION_FEE;
            this.balance -= TRANSACTION_FEE;
        }
    }
    
    public void chargeManagementFees(int id){
        if (this.id == id && this.balance >= MANAGEMENT_FEE){
            this.balance -= MANAGEMENT_FEE;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public int getTransactionsCount(){
        return this.transaction;
    }
}
