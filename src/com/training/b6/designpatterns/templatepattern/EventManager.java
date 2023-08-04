package com.training.b6.designpatterns.templatepattern;

import com.training.b6.exceptionhandling.CustomAppException;

public class EventManager {

    public static void main(String[] args) {

    try{
        Event ann_event= EventFactory.createEvent("AnnualDay");
        Event sp_event=EventFactory.createEvent("SportsDay");

        ann_event.start();
        System.out.println("----------------------------------------------------------");
        sp_event.start();
    } catch (
    CustomAppException e) {
        System.out.println("Exception happened "+e.getCustomMessage());
    }
    }
}
