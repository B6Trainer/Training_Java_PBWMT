package com.training.b6.OOPS;

public class ChinaGovernment {

    private static double taxRate= 0.25;

    public static void payTax(String _taxPayerName, double taxAmount){
        ///The citizen pays his tax
        OOPSLoggerHelper.printOnConsole(_taxPayerName+" has paid the tax to Chinese Govt "+taxAmount);
    }

    public static double getTaxRate() {
        return taxRate;
    }
}
