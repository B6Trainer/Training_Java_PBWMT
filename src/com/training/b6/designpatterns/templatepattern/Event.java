package com.training.b6.designpatterns.templatepattern;

public abstract class Event implements EventTemplate{

    public void start(){

        inauguration();
        welcomeSpeech();
        executeEvent();
        thanksGivingSpeech();
    }
}
