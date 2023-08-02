package com.training.b6.inhExc;

public class ClassA {

    public  int inVariable;
    int check;

    public  void instMethod(){
        System.out.println(" I am Class A  method");
    }

    public int doAddition(int i,int j){
        inVariable=i+j;
        return inVariable;
    }

}
