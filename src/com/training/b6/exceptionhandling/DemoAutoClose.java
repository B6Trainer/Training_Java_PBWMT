package com.training.b6.exceptionhandling;

import java.io.Closeable;
import java.io.IOException;

public class DemoAutoClose implements Closeable{


    @Override
    public void close() throws IOException {
        System.out.println(this.getClass().getName()+" :  DemoAutoClose Object is closing out, Thank you");
    }

    public void CheckDemoObject() {

        System.out.println(this.getClass().getName()+" :  Hi, How are you, Thank you");
    }
}
