package com.training.b6.designpatterns;

import com.training.b6.helpers.CustomAppException;

public class EmployeeFactory implements DPConstants, EmployeeManagement{


    @Override
    public Employee prepareEmployee(int employeeType) throws CustomAppException {
        Employee emp;
        switch (employeeType){
            case Developer:
                emp=new Developer();
                break;
            default:
                // Code block executed if expression doesn't match any case
                throw new CustomAppException("Invalid Employee request received");
        }
        return emp;
    }
}
