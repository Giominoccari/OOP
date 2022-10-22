package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount {

    protected static final double TRANSACTION_FEE = 0.1;

    private final int id;
    private double balance;
    private int transactions;

    public ExtendedStrictBankAccount(final int id, final double balance) {
        super(id, balance);
    }

    protected boolean checkUser(final int id) {
        return this.id == id;
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }
    
    private boolean isWithdrawAllowed(final double amount) {
        return balance >= amount;
    }

    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + transactions * TRANSACTION_FEE;
        if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            balance -= feeAmount;
            transactions = 0;
        }
    }
    
}
