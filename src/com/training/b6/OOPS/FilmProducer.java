package com.training.b6.OOPS;

import com.training.b6.helpers.LogHelper;

public class FilmProducer {

    public static void main(String[] args) {

        //String _name, String _from , String _language
        Actor arnold = new Bodybuilder("Arnold","USA","English");
        Actor jackie = new MartialArtist("Jackie","China","Mandarin");

        OOPSLogHelper.printOnConsole(arnold.whatisYourName());
        OOPSLogHelper.printOnConsole(arnold.whereAreYouFrom());
        OOPSLogHelper.printOnConsole(arnold.whatLanguagesDoYouSpeak());

        OOPSLogHelper.printOnConsole("----------------------------------------------------------");

        OOPSLogHelper.printOnConsole(jackie.whatisYourName());
        OOPSLogHelper.printOnConsole(jackie.whereAreYouFrom());
        OOPSLogHelper.printOnConsole(jackie.whatLanguagesDoYouSpeak());

        OOPSLogHelper.printOnConsole("----------------------------------------------------------");

        arnold.act();
        jackie.act();
        OOPSLogHelper.printOnConsole("----------------------------------------------------------");

        arnold.paySalary(1000000);
        jackie.paySalary(1500000);

        OOPSLogHelper.printOnConsole(" Salary Paid----------------------------------------------------------");

        meetMyFriends(arnold,jackie);
        meetTaxPayer(arnold,jackie);

        OOPSLogHelper.printOnConsole(arnold.getName()+" - After Paying Tax my balance is: "+arnold.myBankBalance());
        OOPSLogHelper.printOnConsole(jackie.getName()+" - After Paying Tax my balance is: "+jackie.myBankBalance());


    }

    private static void meetMyFriends(Actor _arnold, Actor _jackie) {

        OOPSLogHelper.printOnConsole(" Meeting the friends----------------------------------------------------------");

        Bodybuilder arnold = (Bodybuilder) _arnold;
        MartialArtist jackie = (MartialArtist)_jackie;

        OOPSLogHelper.printOnConsole(arnold.whatisYourName()+" - I Earn: "+ arnold.myBankBalance());
        OOPSLogHelper.printOnConsole(jackie.whatisYourName()+" - I Earn: "+ jackie.myBankBalance());

    }

    private static void meetTaxPayer(Citizen _arnold, Citizen _jackie) {

        OOPSLogHelper.printOnConsole(" Meeting the Tax Payer----------------------------------------------------------");

        _arnold.payTax();
        _jackie.payTax();



    }

}
