package com.training.b6.designpatterns.Adapter;

public class AnimalAdapter extends Vehicle {

    private Animal animal;
    public AnimalAdapter(Animal _animal){
    this.animal=_animal;
    }
    @Override
    public void move() {
        animal.run();
    }
}
