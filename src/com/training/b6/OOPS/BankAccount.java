package com.training.b6.OOPS;

public class BankAccount {

    private String accountHolderName;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }

    private double balance;

    BankAccount(String _accHolder ){
        this.accountHolderName=_accHolder;
    }

}
