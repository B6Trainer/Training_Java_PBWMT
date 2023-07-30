package com.training.b6.core;

import com.training.b6.helpers.Constants;
import com.training.b6.helpers.LogHelper;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StartService implements Constants {

    private static final String className=StartService.class.getName();

    public static void main(String[] args) {


        LogHelper.printOnConsole(className," : Hello and welcome!");
        Controller conObj = new Controller();

        conObj.execute(EXECUTE_AUTOCLOSE);



    }


}