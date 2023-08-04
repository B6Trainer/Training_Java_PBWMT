package com.training.b6.designpatterns.Factory;

import com.training.b6.helpers.LogHelper;

public class SuperDeveloper extends Employee {

    private static final String className= SuperDeveloper.class.getSimpleName();
    @Override
    public void startWorking() {
        LogHelper.printOnConsole(className,"Super Developer : I am Developing Super Code");
    }
}
