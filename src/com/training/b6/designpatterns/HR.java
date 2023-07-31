package com.training.b6.designpatterns;

import com.training.b6.core.Controller;
import com.training.b6.helpers.LogHelper;

public class HR extends Employee{

    private static final String className= Controller.class.getSimpleName();

    @Override
    public void startWorking() {

        LogHelper.printOnConsole(className,"I am Hiring employees");
    }
}
