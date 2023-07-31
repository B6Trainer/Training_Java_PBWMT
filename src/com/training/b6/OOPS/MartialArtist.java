package com.training.b6.OOPS;

public class MartialArtist extends Actor{


    public MartialArtist(String _name, String _from , String _language){
        super(_name,  _from , _language);
    }

    @Override
    public void deliverDialogue() {
        OOPSLogHelper.printOnConsole("I am speaking in Mandarin");
    }

    @Override
    public void performStunts() {
        OOPSLogHelper.printOnConsole("Starts his acrobatic stunts");
    }
    @Override
    public void payTax() {
        double taxAmount = bankAccount.getBalance()*0.25;
        bankAccount.reduceBalance(taxAmount);
        ChineseGovernment.payTax(getName(),(bankAccount.getBalance()));
    }

}
