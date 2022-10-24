package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

import it.unibo.inheritance.impl.AbstractBankAccount;
import it.unibo.inheritance.api.*;

public class RestrictedBankAccount extends AbstractBankAccount{
    private static final double MANAGEMENT_FEE = 5;
    private static final double TRANSACTION_FEE = 0.1;

    public RestrictedBankAccount(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }

    public void chargeManagementFees(final int usrID) {
        final double feeAmount = MANAGEMENT_FEE + super.getTransactionsCount() * TRANSACTION_FEE;
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {
            setBalance(getBalance() - feeAmount);
            resetTransactions();
        }
    }

    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            super.withdraw(id, amount);
        }
    }

    private boolean isWithdrawAllowed(double amount) {
        return super.getBalance() >= amount;
    }

    protected double computeFee(){
        return MANAGEMENT_FEE; 
    }
}
