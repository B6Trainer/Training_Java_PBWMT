package com.training.b6.designpatterns.Factory;

import com.training.b6.helpers.LogHelper;

public class Developer extends Employee {

    private static final String className= Developer.class.getSimpleName();

    @Override
    public void startWorking() {
        LogHelper.printOnConsole(className,"Developer : I am Developing Code");
    }
}
