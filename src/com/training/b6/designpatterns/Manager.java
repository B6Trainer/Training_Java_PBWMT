package com.training.b6.designpatterns;

import com.training.b6.designpatterns.Factory.Employee;
import com.training.b6.designpatterns.Factory.EmployeeFactory;
import com.training.b6.exceptionhandling.CustomAppException;

public class Manager implements DPConstants {

    public static void main(String[] args) {


       EmployeeFactory empFact = new EmployeeFactory();
        try {
            Employee dev = empFact.prepareEmployee(DPConstants.Developer);//
            Employee hr = empFact.prepareEmployee(DPConstants.HR);

            dev.startWorking();
            hr.startWorking();


            //--------------------------------------------------------------------
           /* Subscriber subs1 = new Subscriber("Subs-1");
            Subscriber subs2 = new Subscriber("Subs-2");

            Publisher.subscribe(subs1);
            Publisher.subscribe(subs2);

            //-------------------------------------------------------------------------------

            Publisher.publish("Tomorrow is a weekend");*/



     } catch (CustomAppException e) {
        System.out.println("Exception happened "+e.getCustomMessage());
     }
    }
}
