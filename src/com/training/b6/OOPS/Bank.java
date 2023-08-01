package com.training.b6.OOPS;

public class Bank {

    public static BankAccount createAccount(String _accHolderName){
        return new BankAccount(_accHolderName);
    }

}
