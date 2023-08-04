package com.training.b6.designpatterns.templatepattern;

import com.training.b6.exceptionhandling.CustomAppException;

public class EventFactory {


    public static Event createEvent(String e) throws CustomAppException {

        {
            Event event;
            switch (e){
                case "SportsDay":
                    event=new SportsDay();
                   break;
                case "AnnualDay":
                    event = new AnnualDay();
                    break;
                default:
                    // Code block executed if expression doesn't match any case
                    throw new CustomAppException("Invalid Event request received");
            }
            return event;
        }
    }
}
