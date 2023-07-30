package com.training.b6.core;

import com.training.b6.helpers.Constants;
import com.training.b6.helpers.CustomAppException;
import com.training.b6.helpers.LogHelper;

import java.io.IOException;

public class Controller implements Constants {

    private static final String className=Controller.class.getName();
    private static final Processor procObj = new Processor();




    public void execute(int executeMethod) throws CustomAppException {

        try {

            switch (executeMethod) {
                case EXECUTE_AUTOCLOSE:
                    // Code block executed if expression matches Constants.EXECUTE_AUTOCLOSE
                    executeAutoCloseExample();
                    break;
                case EXECUTE_FILE_CONNECTION:
                    // Code block executed if expression matches Constants.EXECUTE_FILE_CONNECTION
                    executeFileConnectionExample();
                    break;
                case EXECUTE_NUMBER_ADD:
                    // Code block executed if expression matches Constants.EXECUTE_NUMBER_ADD
                    break;
                // Add more cases as needed
                default:
                    // Code block executed if expression doesn't match any case
                    throw new CustomAppException("Invalid execution command received, Please contact our support ");
            }

        }catch (Exception exc){
            LogHelper.printOnConsole(className," Server Exception Occurred ",exc);
            throw new CustomAppException("Internal Server error occurred, Please contact our support ",exc);
        }


    }



    private void executeAutoCloseExample(){

        LogHelper.printOnConsole(className,"is Executing the execute method");
        procObj.checkAutocloseable();
    }



    private void executeFileConnectionExample() throws IOException {

        LogHelper.printOnConsole(className,"is Executing the execute method");
        procObj.instantiateFileConnection();
    }
}
