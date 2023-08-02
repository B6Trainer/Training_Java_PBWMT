package com.training.b6.inhExc;

public class ClassB extends ClassA{


    private ClassC cObject = new ClassC();

    public void performCalc(){
        doAddition(10,5);
        cObject.doMultiplication(10,5);

    }

    @Override
    public int doAddition(int i, int j) {

        return super.doAddition(i, j)+5;
    }

    public void classBSpecialMethod(){
        System.out.println("Class B special Method");
    }
}
