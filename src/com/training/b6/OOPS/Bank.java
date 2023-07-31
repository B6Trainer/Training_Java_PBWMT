package com.training.b6.OOPS;

public class Bank {

    public static BankAccount createBankAccount(String _AccountHolderName, String _Country){
        return new BankAccount(_AccountHolderName,_Country);
    }

}
