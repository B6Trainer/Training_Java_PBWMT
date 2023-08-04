package com.training.b6.designpatterns.Adapter;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
