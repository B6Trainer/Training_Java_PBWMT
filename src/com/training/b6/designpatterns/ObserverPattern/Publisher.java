package com.training.b6.designpatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Publisher {

    private static  ArrayList<Subscriber> subsList = new ArrayList<>();

    public static void  subscribe(Subscriber sub){
        subsList.add(sub);
    }

    public static void publish(String news){

        Iterator<Subscriber> iter = subsList.iterator();
        while(iter.hasNext()){
            Subscriber sub = iter.next();
            sub.receiveEvent(news);
        }
    }
}
