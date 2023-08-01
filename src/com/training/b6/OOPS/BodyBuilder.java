package com.training.b6.OOPS;

public class BodyBuilder extends Actor{

    public BodyBuilder(String _name, int _age, String _country){
        super( _name,  _age,  _country);

    }
    @Override
    public void deliverDialogue() {
        OOPSLoggerHelper.printOnConsole(getName()+" I am delivering in English");
    }

    @Override
    public void performStunt() {
        OOPSLoggerHelper.printOnConsole(getName()+" I am performing stunt with weapons");
    }


}
