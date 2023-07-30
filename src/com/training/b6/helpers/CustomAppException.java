package com.training.b6.helpers;

public class CustomAppException extends Exception{


    private String customMessage;

    public CustomAppException(String _customMessage, Exception e){

        super(e);
        this.customMessage=_customMessage;
    }

    public CustomAppException(String _customMessage){

        this.customMessage=_customMessage;
    }


    public String getCustomMessage() {
        return customMessage;
    }

}
