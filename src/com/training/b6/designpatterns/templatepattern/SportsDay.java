package com.training.b6.designpatterns.templatepattern;

public class SportsDay extends Event implements EventTemplate{


    @Override
    public void welcomeSpeech() {
        System.out.println("Sports day WelcomeSpeech");
    }

    @Override
    public void inauguration() {
        System.out.println("Sports day Inaugural speech");
    }

    @Override
    public void executeEvent() {
        System.out.println("Sports day event excution");
    }

    @Override
    public void thanksGivingSpeech() {
        System.out.println("Sports day Thanks giving speech");
    }
}
