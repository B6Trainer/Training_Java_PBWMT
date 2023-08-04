package com.training.b6.designpatterns.Adapter;

import com.training.b6.designpatterns.Adapter.Animal;

public class Dog implements Animal {

    @Override
    public void run() {
        System.out.println("Dog is Running");
    }
}
