package com.training.b6.OOPS;

public class Bodybuilder extends Actor{


    public Bodybuilder(String _name, String _from , String _language){
        super(_name,  _from , _language);
    }

    @Override
    public void deliverDialogue() {
        OOPSLogHelper.printOnConsole("I am the terminator, in a Metalic voice");
    }

    @Override
    public void performStunts() {
        OOPSLogHelper.printOnConsole(" Take a gun and start shooting the bad guys");
    }



}
