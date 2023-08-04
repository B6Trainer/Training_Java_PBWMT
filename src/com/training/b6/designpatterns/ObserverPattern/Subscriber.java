package com.training.b6.designpatterns.ObserverPattern;

public class Subscriber {

    private String subsName;

    public Subscriber( String _subs){
        this.subsName= _subs;
    }

    public void receiveEvent(String news){
        System.out.println(news+" received by "+subsName);
    }

}
