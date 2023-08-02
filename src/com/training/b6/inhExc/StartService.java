package com.training.b6.inhExc;

public class StartService {

    public static void main(String[] args) {


        ClassA obj = new ClassA(); //Object of Class A
        System.out.println(obj.doAddition(10,5));

        ClassB objb = new ClassB();// Object of Class B
               // objb.classBSpecialMethod();
        System.out.println(objb.doAddition(10,5));

        ClassA obj2 = new ClassB();// Object of class B
        System.out.println(obj2.doAddition(10,5));


        //ClassA == Tree
        //ClassB == MangoTree

        // Tree obj = MangoTree

    }
}
