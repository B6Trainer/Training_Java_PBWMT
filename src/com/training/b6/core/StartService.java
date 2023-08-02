package com.training.b6.core;

import com.training.b6.helpers.Constants;
import com.training.b6.exceptionhandling.CustomAppException;
import com.training.b6.helpers.LogHelper;
import com.training.b6.inhExc.DBconnection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StartService implements Constants {

    private static final String className=StartService.class.getSimpleName();


    /**
     * Main method of the application to start
     * @param args String[]
     */
    public static void main(String[] args) {

        LogHelper.printOnConsole(className," : Hello and welcome! Service has started");
        // Print CLASSPATH environment variable
        /*String classpath = System.getenv("CLASSPATH");
        System.out.println("CLASSPATH: " + classpath);*/

        Controller conObj = new Controller();

      /*  try {
            //conObj.execute(Constants.EXECUTE_INITIALISE_APPCONFIG);
            //conObj.execute(EXECUTE_FILE_CONNECTION);
            //conObj.execute(Constants.EXECUTE_NUMBER_DIVIDE);
            //conObj.execute(EXECUTE_AUTOCLOSE);
        } catch (CustomAppException e) {
            LogHelper.printOnConsole(className,e.getCustomMessage());
        }*/

        DBconnection dBconnection=null ;
        try{
             dBconnection = DBconnection.getDbinstance();
            //...
            //...
        }catch (Exception e){

        }finally{
            dBconnection.close();
        }

        try (DBconnection dBconnection2 = DBconnection.getDbinstance()){

        }catch (Exception e){

        }

        LogHelper.printOnConsole(className," : Thank you! Service completed and stopped");

    }


}