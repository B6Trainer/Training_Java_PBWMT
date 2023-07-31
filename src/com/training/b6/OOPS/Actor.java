package com.training.b6.OOPS;

public abstract class Actor implements Citizen{

    private String name;
    private String Country;
    private String Profession;
    private String Language;

    protected BankAccount bankAccount;


    public Actor(String _name, String _from , String _language){
        this.name=_name;
        this.Country=_from;
        this.Language=_language;
        this.Profession="Actor";
        this.bankAccount= Bank.createBankAccount(this.name,this.Country);

    }

    public String getName() {
        return name;
    }

    public String whatisYourName(){
        return "My name is "+name;
    }

    public String whereAreYouFrom(){
        return "Iam from "+Country;
    }

    public String whatLanguagesDoYouSpeak(){
        return "I can speak "+Language;
    }

    public void act() {
        performStunts();
        deliverDialogue();
    }

    public abstract void deliverDialogue() ;

    public abstract void performStunts() ;

    public void paySalary(int _salary) {
        this.bankAccount.setBalance(_salary);
    }

    public double myBankBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public void payTax() {
        double taxAmount = bankAccount.getBalance()*0.3;
        bankAccount.reduceBalance(taxAmount);
        USGovernment.payTax(getName(),(bankAccount.getBalance()));
    }

}
