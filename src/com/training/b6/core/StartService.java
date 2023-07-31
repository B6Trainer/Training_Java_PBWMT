package com.training.b6.core;

import com.training.b6.helpers.Constants;
import com.training.b6.helpers.CustomAppException;
import com.training.b6.helpers.LogHelper;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StartService implements Constants {

    private static final String className=StartService.class.getSimpleName();

    public static void main(String[] args) {

        LogHelper.printOnConsole(className," : Hello and welcome! Service has started");
        // Print CLASSPATH environment variable
        /*String classpath = System.getenv("CLASSPATH");
        System.out.println("CLASSPATH: " + classpath);*/

        Controller conObj = new Controller();

        try {
            conObj.execute(Constants.EXECUTE_INITIALISE_APPCONFIG);
            //conObj.execute(EXECUTE_FILE_CONNECTION);
            //conObj.execute(EXECUTE_AUTOCLOSE);
            //conObj.execute(Constants.EXECUTE_NUMBER_ADD);
        } catch (CustomAppException e) {
            LogHelper.printOnConsole(className,e.getCustomMessage());
        }

    }


}