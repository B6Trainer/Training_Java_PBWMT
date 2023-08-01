package com.training.b6.OOPS;

public class MartialArts extends Actor{


    public MartialArts(String _name, int _age, String _country){
        super( _name,  _age,  _country);

    }
    @Override
    public void deliverDialogue() {
        OOPSLoggerHelper.printOnConsole(getName()+" I am delivering in Mandarin");
    }

    @Override
    public void performStunt() {
        OOPSLoggerHelper.printOnConsole(getName()+" I am performing stunt with Martial Arts");
    }

    @Override
    public void payTax() {
        double earnedAmount = getMyBankAccount().getBalance();
        double taxAmount = earnedAmount*ChinaGovernment.getTaxRate();
        ChinaGovernment.payTax(getName(),taxAmount);
        getMyBankAccount().withdraw(taxAmount);
    }
}
