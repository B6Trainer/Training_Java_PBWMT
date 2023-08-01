package com.training.b6.OOPS;

public abstract class Actor implements Citizen{

    private String name;

    private int age;

    private String country;

    private String profession="Actors";

    public BankAccount getMyBankAccount() {
        return myBankAccount;
    }

    private BankAccount myBankAccount;

    public Actor(String _name, int _age, String _country){
        this.name=_name;
        this.age=_age;
        this.country=_country;
        this.myBankAccount=Bank.createAccount(_name);
    }

    public String whatIsYourName(){
        return "My name is "+getName();
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    public void setAge(int age) {
        if(age>0)
            this.age = age;
        else
            this.age=0;
    }


    public void act() {

        performStunt();
        deliverDialogue();
    }

    public abstract void deliverDialogue() ;

    public abstract void performStunt() ;

    public void pay(double salary) {
        myBankAccount.deposit(salary);
    }

    public double checkBankBalance() {
        return myBankAccount.getBalance();
    }

    @Override
    public void payTax() {
        double earnedAmount = myBankAccount.getBalance();
        double taxAmount = earnedAmount*USGovernment.getTaxRate();
        USGovernment.payTax(getName(),taxAmount);
        getMyBankAccount().withdraw(taxAmount);
    }
}
