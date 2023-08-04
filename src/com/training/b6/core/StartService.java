package com.training.b6.core;

import com.training.b6.designpatterns.AppConfiguration;
import com.training.b6.helpers.Constants;
import com.training.b6.exceptionhandling.CustomAppException;
import com.training.b6.helpers.LogHelper;
import com.training.b6.inhExc.DBconnection;

import java.io.IOException;

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

        try {
        initialiseConfiguration();  // Initialising Application configuration
        Controller conObj = new Controller();
            conObj.execute(EXECUTE_FILE_CONNECTION);
            //conObj.execute(Constants.EXECUTE_NUMBER_DIVIDE);
            //conObj.execute(EXECUTE_AUTOCLOSE);
        } catch (CustomAppException e) {
            LogHelper.printOnConsole(className,e.getCustomMessage());
        }catch (Exception e) {
            LogHelper.printOnConsole(className,e.getMessage());
        }

        LogHelper.printOnConsole(className," : Thank you! Service completed and stopped");

    }

    private static void initialiseConfiguration() throws IOException {

        AppConfiguration appConfiguration= AppConfiguration.getInstance();
        String appName=appConfiguration.getProperty("app.name");
        String appEnv=appConfiguration.getProperty("app.env");

        LogHelper.printOnConsole(className,"App Name: "+appName);
        LogHelper.printOnConsole(className,"App Env: "+appEnv);
    }


}