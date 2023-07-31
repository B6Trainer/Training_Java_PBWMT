package com.training.b6.core;

import java.io.IOException;

public class ServiceProvider {

    private static final String className=ServiceProvider.class.getSimpleName();


    public boolean instantiateFileConnection() throws IOException {

        throw new IOException("Unable to connect");

    }

    public float divideNumber(int num, int div) {
        return num/div;
    }
}
