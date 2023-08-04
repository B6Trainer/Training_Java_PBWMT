package com.training.b6.designpatterns.Factory;

import com.training.b6.helpers.LogHelper;

public class HR extends Employee{

    private static final String className= HR.class.getSimpleName();

    @Override
    public void startWorking() {

        LogHelper.printOnConsole(className,"Hr : I am Hiring employees");
    }
}
