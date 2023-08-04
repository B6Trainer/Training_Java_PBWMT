package com.training.b6.designpatterns.templatepattern;

public class AnnualDay extends Event implements EventTemplate{


    @Override
    public void welcomeSpeech() {
        System.out.println("Annual day WelcomeSpeech");
    }

    @Override
    public void inauguration() {
        System.out.println("Annual day Inaugural speech");
    }

    @Override
    public void executeEvent() {
        System.out.println("Annual day event execution");
    }

    @Override
    public void thanksGivingSpeech() {
        System.out.println("Annual day Thanks giving speech");
    }
}
