package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {
    
    private static final double MANAGEMENT_FEE = 5;

    private double balance;

    public ClassicBankAccount(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }

    protected boolean isWithDrawAllowed(final double imp){
        if(this.balance < imp){
            return false;
        }else{
            return true;
        }
    }

    protected double computeFee(){
        return MANAGEMENT_FEE; 
    }
}
