package com.training.b6.designpatterns.Adapter;

public class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("Boat is moving");
    }
}
