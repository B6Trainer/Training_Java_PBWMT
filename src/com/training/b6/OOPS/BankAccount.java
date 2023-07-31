package com.training.b6.OOPS;


public class BankAccount{

    private final String accountHolderName;

    private final String country;

    public void setBalance(int balance) {
        this.balance = this.balance+balance;
    }

    private double balance;


    BankAccount(String _AccountHolderName, String _Country){
        this.accountHolderName=_AccountHolderName;
        this.country=_Country;

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String get_Country() {
        return country;
    }

    public double getBalance() {
        return balance;
    }

    public void reduceBalance(double taxAmount) {
        this.balance= this.balance-taxAmount;
    }
}
