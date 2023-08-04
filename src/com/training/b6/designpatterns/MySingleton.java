package com.training.b6.designpatterns;

public class MySingleton {

    private static MySingleton singletonObj;

    private MySingleton(){

    }

    public static MySingleton getInstance(){

        if(singletonObj==null){
            singletonObj= new MySingleton();// create and store global varaible
        }
        return singletonObj;
    }

    public void performAction(){
        System.out.println("I am performing");
    }
}
