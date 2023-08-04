package com.training.b6.core;

import com.training.b6.designpatterns.AppConfiguration;
import com.training.b6.helpers.Constants;
import com.training.b6.exceptionhandling.CustomAppException;
import com.training.b6.helpers.LogHelper;

import java.io.IOException;

public class Controller implements Constants {

    private static final String className=Controller.class.getSimpleName();
    private static final Processor procObj = new Processor();

    //private static AppConfiguration appConfiguration;

    /**
     * Controller's Entry method to service the request
     * @param executeMethod
     * @throws CustomAppException
     */
    public void execute(int executeMethod) throws CustomAppException {

        try {

            switch (executeMethod) {
                case EXECUTE_INITIALISE_APPCONFIG:
                    // Code block executed if expression matches Constants.EXECUTE_INITIALISE_APPCONFIG
                    //initialiseConfiguration();
                    break;
                case EXECUTE_FILE_CONNECTION:
                    // Code block executed if expression matches Constants.EXECUTE_FILE_CONNECTION
                    executeFileConnectionExample();
                    break;
                case EXECUTE_NUMBER_DIVIDE:
                    // Code block executed if expression matches Constants.EXECUTE_NUMBER_ADD
                    divideNumber(100,0);
                    break;
                case EXECUTE_AUTOCLOSE:
                    // Code block executed if expression matches Constants.EXECUTE_AUTOCLOSE
                    executeAutoCloseExample();
                    break;
                // Add more cases as needed
                default:
                    // Code block executed if expression doesn't match any case
                    throw new CustomAppException("Invalid execution command received, Please contact our support ");
            }

        }catch (Exception exc){
            LogHelper.printOnConsole(className," Server Exception "+exc.getMessage(),exc);
            throw new CustomAppException("Internal Server error occurred, Please contact our support ",exc);
        }


    }


 /*   private void initialiseConfiguration() throws IOException {

        appConfiguration=AppConfiguration.getInstance();
        String appName=appConfiguration.getProperty("app.name");
        String appEnv=appConfiguration.getProperty("app.env");

        LogHelper.printOnConsole(className,"App Name: "+appName);
        LogHelper.printOnConsole(className,"App Env: "+appEnv);
    }*/


    private void executeAutoCloseExample(){

        LogHelper.printOnConsole(className,"is Executing the executeAutoCloseExample method");
        procObj.checkAutocloseable();
    }



    private void executeFileConnectionExample() throws IOException {

        LogHelper.printOnConsole(className,"is Executing the executeFileConnectionExample method");
        procObj.instantiateFileConnection();
    }


    private void divideNumber(int num, int div) {
        LogHelper.printOnConsole(className,"is Executing the divideNumber method");
        procObj.divideNumber(num,div);
    }
}
