package com.training.b6.designpatterns.Adapter;

import java.util.ArrayList;
import java.util.Iterator;

public class StartServer {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car();
        Vehicle boat = new Boat();
        vehicles.add(car);
        vehicles.add(boat);

        Vehicle horse = new AnimalAdapter(new Horse());
        vehicles.add(horse);

        Vehicle dog = new AnimalAdapter(new Dog());
        vehicles.add(dog);

        Iterator<Vehicle> vehIt = vehicles.iterator();
        while (vehIt.hasNext()){
            Vehicle veh = vehIt.next();
            veh.move();
        }


    }
}
