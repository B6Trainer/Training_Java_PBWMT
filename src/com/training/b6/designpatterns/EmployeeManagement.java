package com.training.b6.designpatterns;

import com.training.b6.exceptionhandling.CustomAppException;

public interface EmployeeManagement {

    public Employee prepareEmployee(int emp_Type) throws CustomAppException;
}
