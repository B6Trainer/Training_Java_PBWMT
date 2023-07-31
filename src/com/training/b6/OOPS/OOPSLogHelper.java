package com.training.b6.OOPS;

public class OOPSLogHelper {

    public static void printOnConsole(String message){
        System.out.println(" -> "+message);
    }

    public static void printOnConsole(String className, String message) {
        System.out.println(className+" : "+message);
    }

    public static void printOnConsole(String className, String message , Throwable thr) {
        thr.printStackTrace();
        System.out.println(className+" : Exception : "+message);

    }
}
