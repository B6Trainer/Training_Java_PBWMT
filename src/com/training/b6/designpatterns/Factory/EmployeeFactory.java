package com.training.b6.designpatterns.Factory;

import com.training.b6.designpatterns.DPConstants;
import com.training.b6.exceptionhandling.CustomAppException;

public class EmployeeFactory implements DPConstants, EmployeeManagement{


    @Override
    public Employee prepareEmployee(int employeeType) throws CustomAppException {
        Employee emp;
        switch (employeeType){
            case Developer:
                emp=new SuperDeveloper();
                emp.setEmp_Age(22);
                break;
            case HR:
                emp=new HR();
                break;
            default:
                // Code block executed if expression doesn't match any case
                throw new CustomAppException("Invalid Employee request received");
        }
        return emp;
    }
}
