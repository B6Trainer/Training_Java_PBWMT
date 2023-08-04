package com.training.b6.designpatterns.decorator;

public class MakeCoffee {

    public static void main(String[] args) {
        // Order a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: $" + simpleCoffee.getCost());
        System.out.println("Description: " + simpleCoffee.getDescription());

      // Add Milk to the coffee
        Coffee coffeeWithMilk = new Milk(simpleCoffee);
        System.out.println("Cost: $" + coffeeWithMilk.getCost());
        System.out.println("Description: " + coffeeWithMilk.getDescription());

          // Add Sugar to the coffee with Milk
        Coffee coffeeWithMilkAndSugar = new Sugar(coffeeWithMilk);
        System.out.println("Cost: $" + coffeeWithMilkAndSugar.getCost());
        System.out.println("Description: " + coffeeWithMilkAndSugar.getDescription());

        Coffee coffeeWithSugar = new Sugar(simpleCoffee);
        System.out.println("Cost: $" + coffeeWithSugar.getCost());
        System.out.println("Description: " + coffeeWithSugar.getDescription());
    }
}
