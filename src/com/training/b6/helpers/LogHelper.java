package com.training.b6.helpers;

public class LogHelper {

    public static void printOnConsole(String message){

    }

    public static void printOnConsole(String className, String message) {
        System.out.println(className+" : "+message);
    }

    public static void printOnConsole(String className, String message , Throwable thr) {
        thr.printStackTrace();
        System.out.println(className+" : Exception : "+message);

    }
}
