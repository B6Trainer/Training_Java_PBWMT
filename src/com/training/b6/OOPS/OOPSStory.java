package com.training.b6.OOPS;

public class OOPSStory {


    public static void main(String[] args) {

        //String _name, int _age, String _country
        Actor arnold = new BodyBuilder("Arnold",60,"USA");
        Actor jackie = new MartialArts("Jackie", 58,"China");



        meetFilmProducer(arnold,jackie);
        meetMyfriends(arnold,jackie);
        meetTaxPayer(arnold,jackie);
        OOPSLoggerHelper.printOnConsole("What is your balance Arnold? "+arnold.checkBankBalance());
        OOPSLoggerHelper.printOnConsole("What is your balance Jackie? "+jackie.checkBankBalance());
    }

    private static void meetTaxPayer(Citizen arnold, Citizen jackie) {
        arnold.payTax();
        jackie.payTax();
        OOPSLoggerHelper.printOnConsole("After paying tax----------------------------------------------------------------");

   }

    private static void meetMyfriends(Actor _arnold, Actor _jackie) {
        BodyBuilder arnold =(BodyBuilder) _arnold;
        MartialArts jackie =(MartialArts) _jackie;

        OOPSLoggerHelper.printOnConsole("Friends: What is your name? "+_arnold.whatIsYourName());
        OOPSLoggerHelper.printOnConsole("Friends: What is your name? "+_jackie.whatIsYourName());

    }

    private static void meetFilmProducer(Actor _arnold, Actor _jackie) {

        OOPSLoggerHelper.printOnConsole("What is your name? "+_arnold.whatIsYourName());
        OOPSLoggerHelper.printOnConsole("What is your name? "+_jackie.whatIsYourName());

        _arnold.act();
        _jackie.act();

        _arnold.pay(1000000);
        _jackie.pay(1200000);

        OOPSLoggerHelper.printOnConsole("----------------------------------------------------------------");
        OOPSLoggerHelper.printOnConsole("What is your balance Arnold? "+_arnold.checkBankBalance());
        OOPSLoggerHelper.printOnConsole("What is your balance Jackie? "+_jackie.checkBankBalance());



    }

}
