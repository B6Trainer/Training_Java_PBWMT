package com.training.b6.designpatterns;

public abstract class Employee {

    public abstract void startWorking();
    private String emp_Name;
    private int emp_Age;

    private String emp_Designation;

    public String getEmp_Designation() {
        return emp_Designation;
    }

    public void setEmp_Designation(String emp_Designation) {
        this.emp_Designation = emp_Designation;
    }


    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }


    public int getEmp_Age() {
        return emp_Age;
    }

    public void setEmp_Age(int emp_Age) {
        this.emp_Age = emp_Age;
    }


}
