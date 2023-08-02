package com.training.b6.inhExc;

public class MyClass {

    //Static Variable

    //Static Methods
    //Static blocks

    //Instance Variable
    //Instance Methods

    //Constructors

    private MyClass(){
        System.out.println("MyClass default constructor is invoked");
    }

    public MyClass(String _objectName){

        System.out.println("MyClass object name constructor is invoked");
    }

    public static MyClass getInstance(){
    return new MyClass();
    }

}
