package com.training.b6.core;

import com.training.b6.exceptionhandling.DemoAutoClose;
import com.training.b6.helpers.LogHelper;

import java.io.IOException;

public class Processor {

    private static final String className=Processor.class.getSimpleName();

    private static final ServiceProvider serviceObj = new ServiceProvider();

    public void checkAutocloseable() {

        LogHelper.printOnConsole(className," is Executing the checkAuto-close method");

        try (DemoAutoClose dmObj = new DemoAutoClose()) {

            dmObj.CheckDemoObject();
            LogHelper.printOnConsole(className," I am in a try block of Processor.CheckoutClose");


        }catch (Exception e1){
            LogHelper.printOnConsole(className," I am in a Exception block of Processor.CheckoutClose");
        }finally {
            LogHelper.printOnConsole(className," I am in a Finally block of Processor.CheckoutClose");
        }


    }


    public boolean instantiateFileConnection() throws IOException {

        serviceObj.instantiateFileConnection();

        return true;
    }

    public void divideNumber(int num, int div) {

        float result = serviceObj.divideNumber(num,div);
        LogHelper.printOnConsole(className," Division was successful and the result is "+result);
    }
}
