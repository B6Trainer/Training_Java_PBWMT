package com.training.b6.inhExc;

public class DBconnection implements AutoCloseable{

    private static DBconnection dbinstance;

    private DBconnection(){

    }

    public static DBconnection getDbinstance() {
        if(dbinstance==null)
             dbinstance= new DBconnection();

        return dbinstance;
    }

    public void close() {
        System.out.println("Connection closed");    }
}
