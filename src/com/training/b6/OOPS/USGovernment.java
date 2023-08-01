package com.training.b6.OOPS;

public class USGovernment {

    private static double taxRate= 0.3;

    public static void payTax(String _taxPayerName, double taxAmount){
        ///The citizen pays his tax
        OOPSLoggerHelper.printOnConsole(_taxPayerName+" has paid the tax to US Govt "+taxAmount);
    }

    public static double getTaxRate() {
        return taxRate;
    }
}
